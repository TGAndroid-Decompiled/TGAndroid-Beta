package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f22003a;
    public final i7 f22004b;
    public final boolean f22005c;

    public d7(i7 i7Var, boolean z9, int i7) {
        this.f22003a = i7;
        this.f22004b = i7Var;
        this.f22005c = z9;
    }

    @Override
    public final void run() {
        switch (this.f22003a) {
            case 0:
                i7 i7Var = this.f22004b;
                try {
                    i7Var.k(0, this.f22005c, false);
                    return;
                } catch (Exception unused) {
                    i7Var.j(0, false);
                    return;
                }
            case 1:
                i7 i7Var2 = this.f22004b;
                i7Var2.Q = 0L;
                i7Var2.e(null, true, true);
                i7Var2.f23125y = this.f22005c;
                if (i7Var2.f23097j0 != 0 && !i7Var2.f23082e && !i7Var2.f23096j && !i7Var2.f23113r0) {
                    i7Var2.t();
                }
                i7Var2.s(-1);
                return;
            default:
                i7 i7Var3 = this.f22004b;
                String str = i7Var3.P0;
                if (r2.f25216a) {
                    a8.b("finished downloading file to " + i7Var3.L0 + " time = " + (System.currentTimeMillis() - i7Var3.f23081d1) + " dc = " + i7Var3.T + " size = " + g0.i0(i7Var3.f23075b0, false, false));
                }
                if (this.f22005c) {
                    int i7 = i7Var3.f23076b1;
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
                i7Var3.f23089g0.c(i7Var3, i7Var3.L0);
                return;
        }
    }
}
