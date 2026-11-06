package c8;

import java.util.ArrayList;
import java.util.Arrays;
public abstract class ic {
    public static ti.k a(float[] fArr, float[] fArr2, float f10, float f11, int[] iArr, float f12) {
        int[][] iArr2;
        float f13;
        float f14;
        int[][] iArr3;
        int i7;
        int i10;
        float f15;
        float f16;
        float f17;
        int length = fArr.length;
        ?? obj = new Object();
        float f18 = 0.0f;
        if (length == 0) {
            if (f12 > 0.0f) {
                f17 = f12;
            } else {
                f17 = 1.0f;
            }
            obj.f55996a = Math.max(f10, Math.min(f11, f17));
            obj.f55997b = new float[0];
            obj.f55998c = new int[0];
            obj.f55999e = new int[0];
            return obj;
        }
        obj.f56000f = Float.MAX_VALUE;
        Integer[] numArr = new Integer[length];
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(i11);
        }
        if (iArr != null) {
            Arrays.sort(numArr, new bi.s5(iArr, 4));
        }
        int[] iArr4 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr4[i12] = numArr[i12].intValue();
        }
        int i13 = 1;
        if (length <= 1) {
            iArr2 = new int[][]{iArr4};
        } else {
            Integer[] numArr2 = new Integer[length];
            for (int i14 = 0; i14 < length; i14++) {
                numArr2[i14] = Integer.valueOf(iArr4[i14]);
            }
            Arrays.sort(numArr2, new bi.s5(fArr, 5));
            int[] iArr5 = new int[length];
            int[] iArr6 = new int[length];
            for (int i15 = 0; i15 < length; i15++) {
                iArr5[i15] = numArr2[i15].intValue();
                iArr6[(length - 1) - i15] = numArr2[i15].intValue();
            }
            if (Arrays.equals(iArr5, iArr4)) {
                iArr2 = new int[][]{iArr4, iArr6};
            } else {
                iArr2 = Arrays.equals(iArr6, iArr4) ? new int[][]{iArr4, iArr5} : new int[][]{iArr4, iArr5, iArr6};
            }
        }
        int[][] iArr7 = iArr2;
        if (length <= 8) {
            int i16 = length - 1;
            int i17 = 1 << i16;
            iArr3 = new int[i17];
            int i18 = 0;
            while (i18 < i17) {
                int[] iArr8 = new int[Integer.bitCount(i18) + 1];
                float f19 = f18;
                int i19 = 0;
                int i20 = 1;
                for (int i21 = 0; i21 < i16; i21++) {
                    if ((i18 & (1 << i21)) != 0) {
                        iArr8[i19] = i20;
                        i20 = 1;
                        i19++;
                    } else {
                        i20++;
                    }
                }
                iArr8[i19] = i20;
                iArr3[i18] = iArr8;
                i18++;
                f18 = f19;
            }
            f13 = f18;
            f14 = 1.0f;
        } else {
            f13 = 0.0f;
            ArrayList arrayList = new ArrayList();
            int i22 = 1;
            while (i22 <= length) {
                int i23 = length / i22;
                int i24 = length % i22;
                int[] iArr9 = new int[i22];
                int[] iArr10 = new int[i22];
                int i25 = 0;
                while (i25 < i22) {
                    if (i25 < i24) {
                        i7 = i13;
                    } else {
                        i7 = 0;
                    }
                    iArr9[i25] = i23 + i7;
                    if (i25 >= i22 - i24) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArr10[i25] = i10 + i23;
                    i25++;
                    i13 = 1;
                }
                arrayList.add(iArr9);
                if (i24 != 0) {
                    arrayList.add(iArr10);
                }
                i22++;
                i13 = 1;
            }
            f14 = 1.0f;
            iArr3 = (int[][]) arrayList.toArray(new int[0]);
        }
        float[] fArr3 = new float[length];
        for (int i26 = 0; i26 < length; i26++) {
            float f20 = fArr[i26];
            if (f20 > f13) {
                f16 = f14 / f20;
            } else {
                f16 = f13;
            }
            fArr3[i26] = f16;
        }
        float[] fArr4 = new float[length];
        for (int i27 = 0; i27 < length; i27++) {
            fArr4[i27] = fArr2[i27];
        }
        ti.j jVar = new ti.j(fArr, fArr4, f10, f11, f12);
        float f21 = f14 / f11;
        float f22 = f14 / f10;
        if (f12 > f13) {
            f15 = f14 / f12;
        } else {
            f15 = f13;
        }
        ti.j jVar2 = new ti.j(fArr3, fArr4, f21, f22, f15);
        int length2 = iArr7.length;
        int i28 = 0;
        ti.k kVar = obj;
        while (i28 < length2) {
            int[] iArr11 = iArr7[i28];
            int i29 = 0;
            for (int i30 = 0; i30 < iArr11.length; i30++) {
                if (iArr11[i30] != iArr4[i30]) {
                    i29++;
                }
            }
            float f23 = i29 * 0.05f;
            int length3 = iArr3.length;
            int i31 = 0;
            ti.k kVar2 = kVar;
            while (i31 < length3) {
                int[] iArr12 = iArr3[i31];
                ti.j jVar3 = jVar;
                int[] iArr13 = iArr11;
                float f24 = f23;
                ti.k kVar3 = kVar2;
                jVar3.a(iArr13, iArr12, f24, kVar3, false);
                if (iArr12.length > 1) {
                    jVar2.a(iArr13, iArr12, f24, kVar3, true);
                }
                i31++;
                kVar2 = kVar3;
                jVar = jVar3;
                iArr11 = iArr13;
                f23 = f24;
            }
            i28++;
            jVar = jVar;
            kVar = kVar2;
        }
        return kVar;
    }
}
