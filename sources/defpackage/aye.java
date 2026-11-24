package defpackage;

import java.nio.charset.StandardCharsets;
public abstract class aye {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static ln8 b(xu7 xu7Var, boolean z, boolean z2) {
        if (z) {
            c(3, xu7Var, false);
        }
        xu7Var.y((int) xu7Var.r(), StandardCharsets.UTF_8);
        long r = xu7Var.r();
        String[] strArr = new String[(int) r];
        for (int i = 0; i < r; i++) {
            strArr[i] = xu7Var.y((int) xu7Var.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (xu7Var.A() & 1) == 0) {
            throw av7.a("framing bit expected to be set", null);
        }
        return new ln8(strArr, (byte) 23);
    }

    public static boolean c(int i, xu7 xu7Var, boolean z) {
        if (xu7Var.a() < 7) {
            if (!z) {
                throw av7.a("too short header: " + xu7Var.a(), null);
            }
            return false;
        } else if (xu7Var.A() != i) {
            if (!z) {
                throw av7.a("expected header type " + Integer.toHexString(i), null);
            }
            return false;
        } else if (xu7Var.A() == 118 && xu7Var.A() == 111 && xu7Var.A() == 114 && xu7Var.A() == 98 && xu7Var.A() == 105 && xu7Var.A() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw av7.a("expected characters 'vorbis'", null);
        }
    }
}
