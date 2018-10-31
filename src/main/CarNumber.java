package main;

import java.util.ArrayList;
import  java.lang.StringBuilder;
public class CarNumber{
    ArrayList<String> list = new ArrayList<String>();
    String[] arrLetter = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};//25 el
    StringBuilder sb = new StringBuilder();

    public  CarNumber(){
        setList();
    }


//Заполняем список номеров

    /*Необходимо получить номера типа 'A0001AA'
      число должно быть трехзначным (дополняеться нулями).
      если число больше 999 то сбрасывается к 1 , а вторая буква переходит к следующему элементу массива.
      Когда вторая буква ='Z' и число больше 999 первая буква переходит к следующему элементу массива.*/

    private void setList(){
        for(int i =0 ;i<24;i++){
            String first = arrLetter[i];
            for(int j =0 ;j<24;j++){
                String second = arrLetter[j];
                for(int k =1 ;k<1000;k++){
                    sb.append("A");
                    if(k<10){
                        sb.append("00");
                    }
                    if(k>9&&k<100){
                        sb.append("0");
                    }
                    sb.append(k);
                    sb.append(first);
                    sb.append(second);

                    list.add(sb.toString());
                    sb =  new StringBuilder();
                }
            }
        }

    }

    //Выводим список номеров на экран
    public void output(){
        for(int i =0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    //Получить список номеров
    public ArrayList<String> getList(){
        return list;
    }

    //Получить элемент
    public String getListElement(int index){
        return list.get( index);
    }
}
