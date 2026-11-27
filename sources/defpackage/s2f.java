package defpackage;

import java.nio.charset.StandardCharsets;
public abstract class s2f {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static j09 b(ey7 ey7Var, boolean z, boolean z2) {
        if (z) {
            c(3, ey7Var, false);
        }
        ey7Var.y((int) ey7Var.r(), StandardCharsets.UTF_8);
        long r = ey7Var.r();
        String[] strArr = new String[(int) r];
        for (int i = 0; i < r; i++) {
            strArr[i] = ey7Var.y((int) ey7Var.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (ey7Var.A() & 1) == 0) {
            throw hy7.a("framing bit expected to be set", null);
        }
        return new j09(strArr, (byte) 22);
    }

    public static boolean c(int i, ey7 ey7Var, boolean z) {
        if (ey7Var.a() < 7) {
            if (!z) {
                throw hy7.a("too short header: " + ey7Var.a(), null);
            }
            return false;
        } else if (ey7Var.A() != i) {
            if (!z) {
                throw hy7.a("expected header type " + Integer.toHexString(i), null);
            }
            return false;
        } else if (ey7Var.A() == 118 && ey7Var.A() == 111 && ey7Var.A() == 114 && ey7Var.A() == 98 && ey7Var.A() == 105 && ey7Var.A() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw hy7.a("expected characters 'vorbis'", null);
        }
    }
}
