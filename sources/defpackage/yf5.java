package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
public final class yf5 {
    public static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] c;
    public static final int[][] d;

    static {
        int[][] iArr;
        int[][] iArr2;
        int[][] iArr3;
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance(cls, 5, 256);
        c = iArr4;
        iArr4[0][32] = 1;
        int i = 65;
        while (true) {
            iArr = c;
            if (i > 90) {
                break;
            }
            iArr[0][i] = i - 63;
            i++;
        }
        iArr[1][32] = 1;
        int i2 = 97;
        while (true) {
            iArr2 = c;
            if (i2 > 122) {
                break;
            }
            iArr2[1][i2] = i2 - 95;
            i2++;
        }
        iArr2[2][32] = 1;
        int i3 = 48;
        while (true) {
            iArr3 = c;
            if (i3 > 57) {
                break;
            }
            iArr3[2][i3] = i3 - 46;
            i3++;
        }
        int[] iArr5 = iArr3[2];
        iArr5[44] = 12;
        iArr5[46] = 13;
        int[] iArr6 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            c[3][iArr6[i4]] = i4;
        }
        int[] iArr7 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr7[i5];
            if (i6 > 0) {
                c[4][i6] = i5;
            }
        }
        int[][] iArr8 = (int[][]) Array.newInstance(cls, 6, 6);
        d = iArr8;
        for (int[] iArr9 : iArr8) {
            Arrays.fill(iArr9, -1);
        }
        int[][] iArr10 = d;
        iArr10[0][4] = 0;
        int[] iArr11 = iArr10[1];
        iArr11[4] = 0;
        iArr11[0] = 28;
        iArr10[3][4] = 0;
        int[] iArr12 = iArr10[2];
        iArr12[4] = 0;
        iArr12[0] = 15;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            hya hyaVar = (hya) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    hya hyaVar2 = (hya) it2.next();
                    if (!hyaVar2.c(hyaVar)) {
                        if (hyaVar.c(hyaVar2)) {
                            it2.remove();
                        }
                    }
                } else {
                    linkedList2.addFirst(hyaVar);
                    break;
                }
            }
        }
        return linkedList2;
    }
}
