package defpackage;

import java.util.Arrays;
public abstract class lle {
    public static vf7 a(cb3 cb3Var, boolean z, boolean z2) {
        xi4 xi4Var;
        if (!z) {
            xi4Var = vl5.b;
        } else if (z2) {
            xi4Var = vl5.c;
        } else {
            xi4Var = null;
        }
        vf7 c0 = new aj3((byte) 12).c0(cb3Var, xi4Var, 0);
        if (c0 == null || c0.a.length == 0) {
            return null;
        }
        return c0;
    }

    public static lh2 b(ey7 ey7Var) {
        ey7Var.O(1);
        int D = ey7Var.D();
        long j = ey7Var.b + D;
        int i = D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long u = ey7Var.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = u;
            jArr2[i2] = ey7Var.u();
            ey7Var.O(2);
            i2++;
        }
        ey7Var.O((int) (j - ey7Var.b));
        return new lh2(jArr, jArr2, (byte) 29);
    }
}
