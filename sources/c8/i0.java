package c8;

import android.graphics.Path;
public abstract class i0 {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            i0.d dVar = dVarArr[i7];
            char c10 = dVar.f15121a;
            i0.d dVar2 = dVarArr2[i7];
            if (c10 != dVar2.f15121a || dVar.f15122b.length != dVar2.f15122b.length) {
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

    public static i0.d[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: c8.i0.c(java.lang.String):i0.d[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.d.b(c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static i0.d[] e(i0.d[] dVarArr) {
        i0.d[] dVarArr2 = new i0.d[dVarArr.length];
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7] = new i0.d(dVarArr[i7]);
        }
        return dVarArr2;
    }
}
