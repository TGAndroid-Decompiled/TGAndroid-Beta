package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public abstract class dpe {
    public static we7 a(float[] fArr, float[] fArr2, float f, float f2, int[] iArr, float f3) {
        int[][] iArr2;
        float f4;
        float f5;
        int[][] iArr3;
        int i;
        int i2;
        float f6;
        float f7;
        float f8;
        int length = fArr.length;
        ?? obj = new Object();
        float f9 = 0.0f;
        if (length == 0) {
            if (f3 > 0.0f) {
                f8 = f3;
            } else {
                f8 = 1.0f;
            }
            obj.a = Math.max(f, Math.min(f2, f8));
            obj.b = new float[0];
            obj.c = new int[0];
            obj.e = new int[0];
            return obj;
        }
        obj.f = Float.MAX_VALUE;
        Integer[] numArr = new Integer[length];
        for (int i3 = 0; i3 < length; i3++) {
            numArr[i3] = Integer.valueOf(i3);
        }
        if (iArr != null) {
            Arrays.sort(numArr, new bz0(iArr, (byte) 4));
        }
        int[] iArr4 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr4[i4] = numArr[i4].intValue();
        }
        int i5 = 1;
        if (length <= 1) {
            iArr2 = new int[][]{iArr4};
        } else {
            Integer[] numArr2 = new Integer[length];
            for (int i6 = 0; i6 < length; i6++) {
                numArr2[i6] = Integer.valueOf(iArr4[i6]);
            }
            Arrays.sort(numArr2, new ml3(fArr, (byte) 2));
            int[] iArr5 = new int[length];
            int[] iArr6 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                iArr5[i7] = numArr2[i7].intValue();
                iArr6[(length - 1) - i7] = numArr2[i7].intValue();
            }
            if (Arrays.equals(iArr5, iArr4)) {
                iArr2 = new int[][]{iArr4, iArr6};
            } else {
                iArr2 = Arrays.equals(iArr6, iArr4) ? new int[][]{iArr4, iArr5} : new int[][]{iArr4, iArr5, iArr6};
            }
        }
        int[][] iArr7 = iArr2;
        if (length <= 8) {
            int i8 = length - 1;
            int i9 = 1 << i8;
            iArr3 = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int[] iArr8 = new int[Integer.bitCount(i10) + 1];
                float f10 = f9;
                int i11 = 0;
                int i12 = 1;
                for (int i13 = 0; i13 < i8; i13++) {
                    if ((i10 & (1 << i13)) != 0) {
                        iArr8[i11] = i12;
                        i12 = 1;
                        i11++;
                    } else {
                        i12++;
                    }
                }
                iArr8[i11] = i12;
                iArr3[i10] = iArr8;
                i10++;
                f9 = f10;
            }
            f4 = f9;
            f5 = 1.0f;
        } else {
            f4 = 0.0f;
            ArrayList arrayList = new ArrayList();
            int i14 = 1;
            while (i14 <= length) {
                int i15 = length / i14;
                int i16 = length % i14;
                int[] iArr9 = new int[i14];
                int[] iArr10 = new int[i14];
                int i17 = 0;
                while (i17 < i14) {
                    if (i17 < i16) {
                        i = i5;
                    } else {
                        i = 0;
                    }
                    iArr9[i17] = i15 + i;
                    if (i17 >= i14 - i16) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    iArr10[i17] = i2 + i15;
                    i17++;
                    i5 = 1;
                }
                arrayList.add(iArr9);
                if (i16 != 0) {
                    arrayList.add(iArr10);
                }
                i14++;
                i5 = 1;
            }
            f5 = 1.0f;
            iArr3 = (int[][]) arrayList.toArray(new int[0]);
        }
        float[] fArr3 = new float[length];
        for (int i18 = 0; i18 < length; i18++) {
            float f11 = fArr[i18];
            if (f11 > f4) {
                f7 = f5 / f11;
            } else {
                f7 = f4;
            }
            fArr3[i18] = f7;
        }
        float[] fArr4 = new float[length];
        for (int i19 = 0; i19 < length; i19++) {
            fArr4[i19] = fArr2[i19];
        }
        ve7 ve7Var = new ve7(fArr, fArr4, f, f2, f3);
        float f12 = f5 / f2;
        float f13 = f5 / f;
        if (f3 > f4) {
            f6 = f5 / f3;
        } else {
            f6 = f4;
        }
        ve7 ve7Var2 = new ve7(fArr3, fArr4, f12, f13, f6);
        int length2 = iArr7.length;
        int i20 = 0;
        we7 we7Var = obj;
        while (i20 < length2) {
            int[] iArr11 = iArr7[i20];
            int i21 = 0;
            for (int i22 = 0; i22 < iArr11.length; i22++) {
                if (iArr11[i22] != iArr4[i22]) {
                    i21++;
                }
            }
            float f14 = i21 * 0.05f;
            int length3 = iArr3.length;
            int i23 = 0;
            we7 we7Var2 = we7Var;
            while (i23 < length3) {
                int[] iArr12 = iArr3[i23];
                ve7 ve7Var3 = ve7Var;
                int[] iArr13 = iArr11;
                float f15 = f14;
                we7 we7Var3 = we7Var2;
                ve7Var3.a(iArr13, iArr12, f15, we7Var3, false);
                if (iArr12.length > 1) {
                    ve7Var2.a(iArr13, iArr12, f15, we7Var3, true);
                }
                i23++;
                we7Var2 = we7Var3;
                ve7Var = ve7Var3;
                iArr11 = iArr13;
                f14 = f15;
            }
            i20++;
            ve7Var = ve7Var;
            we7Var = we7Var2;
        }
        return we7Var;
    }
}
