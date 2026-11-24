package defpackage;

import java.util.Arrays;
public abstract class qge {
    public static ld7 a(ja3 ja3Var, boolean z, boolean z2) {
        wn4 wn4Var;
        if (!z) {
            wn4Var = tj5.b;
        } else if (z2) {
            wn4Var = tj5.c;
        } else {
            wn4Var = null;
        }
        ld7 M = new s34((byte) 8).M(ja3Var, wn4Var, 0);
        if (M == null || M.a.length == 0) {
            return null;
        }
        return M;
    }

    public static lv6 b(xu7 xu7Var) {
        xu7Var.O(1);
        int D = xu7Var.D();
        long j = xu7Var.b + D;
        int i = D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long u = xu7Var.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = u;
            jArr2[i2] = xu7Var.u();
            xu7Var.O(2);
            i2++;
        }
        xu7Var.O((int) (j - xu7Var.b));
        return new lv6(jArr, jArr2, false, (byte) 28);
    }
}
