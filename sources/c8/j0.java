package c8;

import android.graphics.Path;
public abstract class j0 {
    public static boolean a(i0.e[] eVarArr, i0.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            i0.e eVar = eVarArr[i7];
            char c10 = eVar.f15578a;
            i0.e eVar2 = eVarArr2[i7];
            if (c10 != eVar2.f15578a || eVar.f15579b.length != eVar2.f15579b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(int i7, float[] fArr) {
        if (i7 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i7, length);
                float[] fArr2 = new float[i7];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static i0.e[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: c8.j0.c(java.lang.String):i0.e[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.e.b(c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static i0.e[] e(i0.e[] eVarArr) {
        i0.e[] eVarArr2 = new i0.e[eVarArr.length];
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            eVarArr2[i7] = new i0.e(eVarArr[i7]);
        }
        return eVarArr2;
    }
}
