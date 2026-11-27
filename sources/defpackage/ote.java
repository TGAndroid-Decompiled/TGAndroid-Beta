package defpackage;
public abstract class ote {
    public static zf8 a(zf8 zf8Var, zf8 zf8Var2) {
        if (zf8Var != null) {
            lk4 lk4Var = zf8Var.a;
            if (zf8Var2 != null) {
                yf8 yf8Var = new yf8();
                for (int i = 0; i < lk4Var.a.size(); i++) {
                    if (zf8Var2.a(lk4Var.a(i))) {
                        yf8Var.a.b(lk4Var.a(i));
                    }
                }
                return yf8Var.b();
            }
        }
        return zf8.b;
    }

    public static void b(dg8 dg8Var, yw6 yw6Var) {
        int i = yw6Var.b;
        long j = yw6Var.c;
        po5 po5Var = yw6Var.a;
        if (i == -1) {
            if (dg8Var.m0(20)) {
                dg8Var.N0(po5Var);
            } else if (!po5Var.isEmpty()) {
                dg8Var.D0((ft6) po5Var.get(0));
            }
        } else if (dg8Var.m0(20)) {
            dg8Var.T(po5Var, yw6Var.b, j);
        } else if (!po5Var.isEmpty()) {
            dg8Var.r((ft6) po5Var.get(0), j);
        }
    }
}
