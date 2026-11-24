package defpackage;

import org.telegram.messenger.a;
public final class gb4 implements Runnable {
    public final byte a;
    public final lb4 b;
    public final boolean c;

    public gb4(lb4 lb4Var, boolean z, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                try {
                    lb4Var.i(0, z, false);
                    return;
                } catch (Exception unused) {
                    lb4Var.h(0, false);
                    return;
                }
            case 1:
                lb4Var.Q = 0L;
                lb4Var.c(null, true, true);
                lb4Var.y = z;
                if (lb4Var.j0 != 0 && !lb4Var.e && !lb4Var.j && !lb4Var.r0) {
                    lb4Var.r();
                }
                lb4Var.q(-1);
                return;
            default:
                String str = lb4Var.P0;
                if (e21.a) {
                    fc4.b("finished downloading file to " + lb4Var.L0 + " time = " + (System.currentTimeMillis() - lb4Var.d1) + " dc = " + lb4Var.T + " size = " + gm.i0(lb4Var.b0, false, false));
                }
                if (z) {
                    int i = lb4Var.b1;
                    if (i == 50331648) {
                        b0b.c(lb4Var.R).g(a.f(), 3, 1);
                    } else if (i == 33554432) {
                        b0b.c(lb4Var.R).g(a.f(), 2, 1);
                    } else if (i == 16777216) {
                        b0b.c(lb4Var.R).g(a.f(), 4, 1);
                    } else if (i == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            b0b.c(lb4Var.R).g(a.f(), 7, 1);
                        } else {
                            b0b.c(lb4Var.R).g(a.f(), 5, 1);
                        }
                    }
                }
                lb4Var.g0.c(lb4Var, lb4Var.L0);
                return;
        }
    }
}
