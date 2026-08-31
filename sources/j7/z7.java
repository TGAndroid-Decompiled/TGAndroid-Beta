package j7;

import android.graphics.Path;
public abstract class z7 {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            i0.d dVar = dVarArr[i10];
            char c3 = dVar.f7761a;
            i0.d dVar2 = dVarArr2[i10];
            if (c3 != dVar2.f7761a || dVar.f7762b.length != dVar2.f7762b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i10, length);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static i0.d[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: j7.z7.c(java.lang.String):i0.d[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.d.b(c(str), path);
            return path;
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing ".concat(str), e6);
        }
    }

    public static i0.d[] e(i0.d[] dVarArr) {
        i0.d[] dVarArr2 = new i0.d[dVarArr.length];
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10] = new i0.d(dVarArr[i10]);
        }
        return dVarArr2;
    }
}
