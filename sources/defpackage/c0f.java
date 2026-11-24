package defpackage;

import java.nio.charset.StandardCharsets;
public abstract class c0f {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static cf9 b(yw7 yw7Var, boolean z, boolean z2) {
        if (z) {
            c(3, yw7Var, false);
        }
        yw7Var.y((int) yw7Var.r(), StandardCharsets.UTF_8);
        long r = yw7Var.r();
        String[] strArr = new String[(int) r];
        for (int i = 0; i < r; i++) {
            strArr[i] = yw7Var.y((int) yw7Var.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (yw7Var.A() & 1) == 0) {
            throw bx7.a("framing bit expected to be set", null);
        }
        return new cf9(strArr, (byte) 17);
    }

    public static boolean c(int i, yw7 yw7Var, boolean z) {
        if (yw7Var.a() < 7) {
            if (!z) {
                throw bx7.a("too short header: " + yw7Var.a(), null);
            }
            return false;
        } else if (yw7Var.A() != i) {
            if (!z) {
                throw bx7.a("expected header type " + Integer.toHexString(i), null);
            }
            return false;
        } else if (yw7Var.A() == 118 && yw7Var.A() == 111 && yw7Var.A() == 114 && yw7Var.A() == 98 && yw7Var.A() == 105 && yw7Var.A() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw bx7.a("expected characters 'vorbis'", null);
        }
    }
}
