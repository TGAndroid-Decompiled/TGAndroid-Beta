package defpackage;

import org.telegram.messenger.a;
public final class g94 implements Runnable {
    public final byte a;
    public final l94 b;
    public final boolean c;

    public g94(l94 l94Var, boolean z, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                try {
                    l94Var.i(0, z, false);
                    return;
                } catch (Exception unused) {
                    l94Var.h(0, false);
                    return;
                }
            case 1:
                l94Var.Q = 0L;
                l94Var.c(null, true, true);
                l94Var.y = z;
                if (l94Var.j0 != 0 && !l94Var.e && !l94Var.j && !l94Var.r0) {
                    l94Var.r();
                }
                l94Var.q(-1);
                return;
            default:
                String str = l94Var.P0;
                if (w01.a) {
                    fa4.b("finished downloading file to " + l94Var.L0 + " time = " + (System.currentTimeMillis() - l94Var.d1) + " dc = " + l94Var.T + " size = " + gl.i0(l94Var.b0, false, false));
                }
                if (z) {
                    int i = l94Var.b1;
                    if (i == 50331648) {
                        yxa.c(l94Var.R).g(a.f(), 3, 1);
                    } else if (i == 33554432) {
                        yxa.c(l94Var.R).g(a.f(), 2, 1);
                    } else if (i == 16777216) {
                        yxa.c(l94Var.R).g(a.f(), 4, 1);
                    } else if (i == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            yxa.c(l94Var.R).g(a.f(), 7, 1);
                        } else {
                            yxa.c(l94Var.R).g(a.f(), 5, 1);
                        }
                    }
                }
                l94Var.g0.c(l94Var, l94Var.L0);
                return;
        }
    }
}
