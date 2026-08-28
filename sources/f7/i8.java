package f7;

import android.graphics.Path;
public abstract class i8 {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            i0.d dVar = dVarArr[i9];
            char c10 = dVar.f10852a;
            i0.d dVar2 = dVarArr2[i9];
            if (c10 != dVar2.f10852a || dVar.f10853b.length != dVar2.f10853b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i9) {
        if (i9 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i9, length);
                float[] fArr2 = new float[i9];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static i0.d[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: f7.i8.c(java.lang.String):i0.d[]");
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
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            dVarArr2[i9] = new i0.d(dVarArr[i9]);
        }
        return dVarArr2;
    }
}
