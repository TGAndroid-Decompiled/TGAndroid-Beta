package b8;

import android.graphics.Path;
public abstract class rc {
    public static boolean a(i0.d[] dVarArr, i0.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            i0.d dVar = dVarArr[i3];
            char c2 = dVar.f14499a;
            i0.d dVar2 = dVarArr2[i3];
            if (c2 != dVar2.f14499a || dVar.f14500b.length != dVar2.f14500b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(int i3, float[] fArr) {
        if (i3 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i3, length);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static i0.d[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: b8.rc.c(java.lang.String):i0.d[]");
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
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            dVarArr2[i3] = new i0.d(dVarArr[i3]);
        }
        return dVarArr2;
    }
}
