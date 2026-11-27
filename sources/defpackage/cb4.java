package defpackage;

import org.telegram.messenger.a;
public final class cb4 implements Runnable {
    public final byte a;
    public final hb4 b;
    public final boolean c;

    public cb4(hb4 hb4Var, boolean z, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                try {
                    hb4Var.i(0, z, false);
                    return;
                } catch (Exception unused) {
                    hb4Var.h(0, false);
                    return;
                }
            case 1:
                String str = hb4Var.P0;
                if (f11.a) {
                    cc4.b("finished downloading file to " + hb4Var.L0 + " time = " + (System.currentTimeMillis() - hb4Var.d1) + " dc = " + hb4Var.T + " size = " + hl.i0(hb4Var.b0, false, false));
                }
                if (z) {
                    int i = hb4Var.b1;
                    if (i == 50331648) {
                        a2b.c(hb4Var.R).g(a.f(), 3, 1);
                    } else if (i == 33554432) {
                        a2b.c(hb4Var.R).g(a.f(), 2, 1);
                    } else if (i == 16777216) {
                        a2b.c(hb4Var.R).g(a.f(), 4, 1);
                    } else if (i == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            a2b.c(hb4Var.R).g(a.f(), 7, 1);
                        } else {
                            a2b.c(hb4Var.R).g(a.f(), 5, 1);
                        }
                    }
                }
                hb4Var.g0.c(hb4Var, hb4Var.L0);
                return;
            default:
                hb4Var.Q = 0L;
                hb4Var.c(null, true, true);
                hb4Var.y = z;
                if (hb4Var.j0 != 0 && !hb4Var.e && !hb4Var.j && !hb4Var.r0) {
                    hb4Var.r();
                }
                hb4Var.q(-1);
                return;
        }
    }
}
