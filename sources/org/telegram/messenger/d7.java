package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f22160a;
    public final i7 f22161b;
    public final boolean f22162c;

    public d7(i7 i7Var, boolean z10, int i3) {
        this.f22160a = i3;
        this.f22161b = i7Var;
        this.f22162c = z10;
    }

    @Override
    public final void run() {
        switch (this.f22160a) {
            case 0:
                i7 i7Var = this.f22161b;
                try {
                    i7Var.k(0, this.f22162c, false);
                    return;
                } catch (Exception unused) {
                    i7Var.j(0, false);
                    return;
                }
            case 1:
                i7 i7Var2 = this.f22161b;
                i7Var2.Q = 0L;
                i7Var2.e(null, true, true);
                i7Var2.f23514y = this.f22162c;
                if (i7Var2.f23486j0 != 0 && !i7Var2.f23471e && !i7Var2.f23485j && !i7Var2.f23502r0) {
                    i7Var2.t();
                }
                i7Var2.s(-1);
                return;
            default:
                i7 i7Var3 = this.f22161b;
                String str = i7Var3.P0;
                if (r2.f25040a) {
                    a8.b("finished downloading file to " + i7Var3.L0 + " time = " + (System.currentTimeMillis() - i7Var3.f23470d1) + " dc = " + i7Var3.T + " size = " + g0.i0(i7Var3.f23464b0, false, false));
                }
                if (this.f22162c) {
                    int i3 = i7Var3.f23465b1;
                    if (i3 == 50331648) {
                        bz.e(i7Var3.R).i(t0.f(), 3, 1);
                    } else if (i3 == 33554432) {
                        bz.e(i7Var3.R).i(t0.f(), 2, 1);
                    } else if (i3 == 16777216) {
                        bz.e(i7Var3.R).i(t0.f(), 4, 1);
                    } else if (i3 == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            bz.e(i7Var3.R).i(t0.f(), 7, 1);
                        } else {
                            bz.e(i7Var3.R).i(t0.f(), 5, 1);
                        }
                    }
                }
                i7Var3.f23478g0.c(i7Var3, i7Var3.L0);
                return;
        }
    }
}
