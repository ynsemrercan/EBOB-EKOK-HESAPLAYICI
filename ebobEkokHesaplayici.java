import java.util.Scanner;
public class ebobEkokHesaplayici {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1,num2,ebob=1;

        System.out.println("Birinci Sayıyı Giriniz: ");
        num1=input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        num2= input.nextInt();

        //EBOB HESAPLAYICI

        if(num1<num2){

            int i=num1;

            while(i >= 1){

                if ((num1%i)==0 && (num2%i)==0){

                    ebob=i;
                    System.out.println("Sayıların EBOB'U: "+ebob);
                    break;
                }

                i--;
            }
        }
        else{

            int i=num2;

            while(i >= 1){

                if ((num2%i)==0 && (num1%i)==0){

                    ebob=i;
                    System.out.println("Sayıların EBOB'U: "+ebob);
                    break;
                }

                i--;

        }

    }   //EKOK HESAPLAYICI
        int j=1;
        while (j<=num2*num1){

            if((j % num1 == 0) && (j % num2 == 0)){

                System.out.println("Sayıların EKOK'U: "+j);
                break;

            }

            j++;
        }

    }

}