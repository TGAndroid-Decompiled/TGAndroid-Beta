package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f21976a;
    public final i7 f21977b;
    public final boolean f21978c;

    public d7(i7 i7Var, boolean z9, int i7) {
        this.f21976a = i7;
        this.f21977b = i7Var;
        this.f21978c = z9;
    }

    @Override
    public final void run() {
        switch (this.f21976a) {
            case 0:
                i7 i7Var = this.f21977b;
                try {
                    i7Var.k(0, this.f21978c, false);
                    return;
                } catch (Exception unused) {
                    i7Var.j(0, false);
                    return;
                }
            case 1:
                i7 i7Var2 = this.f21977b;
                i7Var2.Q = 0L;
                i7Var2.e(null, true, true);
                i7Var2.f23131y = this.f21978c;
                if (i7Var2.f23103j0 != 0 && !i7Var2.f23088e && !i7Var2.f23102j && !i7Var2.f23119r0) {
                    i7Var2.t();
                }
                i7Var2.s(-1);
                return;
            default:
                i7 i7Var3 = this.f21977b;
                String str = i7Var3.P0;
                if (r2.f25199a) {
                    a8.b("finished downloading file to " + i7Var3.L0 + " time = " + (System.currentTimeMillis() - i7Var3.f23087d1) + " dc = " + i7Var3.T + " size = " + g0.i0(i7Var3.f23081b0, false, false));
                }
                if (this.f21978c) {
                    int i7 = i7Var3.f23082b1;
                    if (i7 == 50331648) {
                        jz.e(i7Var3.R).i(t0.f(), 3, 1);
                    } else if (i7 == 33554432) {
                        jz.e(i7Var3.R).i(t0.f(), 2, 1);
                    } else if (i7 == 16777216) {
                        jz.e(i7Var3.R).i(t0.f(), 4, 1);
                    } else if (i7 == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            jz.e(i7Var3.R).i(t0.f(), 7, 1);
                        } else {
                            jz.e(i7Var3.R).i(t0.f(), 5, 1);
                        }
                    }
                }
                i7Var3.f23095g0.c(i7Var3, i7Var3.L0);
                return;
        }
    }
}
