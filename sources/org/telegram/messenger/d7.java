package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f23052a;
    public final i7 f23053b;
    public final boolean f23054c;

    public d7(i7 i7Var, boolean z10, int i7) {
        this.f23052a = i7;
        this.f23053b = i7Var;
        this.f23054c = z10;
    }

    @Override
    public final void run() {
        switch (this.f23052a) {
            case 0:
                i7 i7Var = this.f23053b;
                try {
                    i7Var.k(0, this.f23054c, false);
                    return;
                } catch (Exception unused) {
                    i7Var.j(0, false);
                    return;
                }
            case 1:
                i7 i7Var2 = this.f23053b;
                i7Var2.Q = 0L;
                i7Var2.e(null, true, true);
                i7Var2.f24348y = this.f23054c;
                if (i7Var2.f24320j0 != 0 && !i7Var2.f24305e && !i7Var2.f24319j && !i7Var2.f24336r0) {
                    i7Var2.t();
                }
                i7Var2.s(-1);
                return;
            default:
                i7 i7Var3 = this.f23053b;
                String str = i7Var3.P0;
                if (r2.f26206a) {
                    a8.b("finished downloading file to " + i7Var3.L0 + " time = " + (System.currentTimeMillis() - i7Var3.f24304d1) + " dc = " + i7Var3.T + " size = " + g0.i0(i7Var3.f24298b0, false, false));
                }
                if (this.f23054c) {
                    int i7 = i7Var3.f24299b1;
                    if (i7 == 50331648) {
                        hz.e(i7Var3.R).i(t0.f(), 3, 1);
                    } else if (i7 == 33554432) {
                        hz.e(i7Var3.R).i(t0.f(), 2, 1);
                    } else if (i7 == 16777216) {
                        hz.e(i7Var3.R).i(t0.f(), 4, 1);
                    } else if (i7 == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            hz.e(i7Var3.R).i(t0.f(), 7, 1);
                        } else {
                            hz.e(i7Var3.R).i(t0.f(), 5, 1);
                        }
                    }
                }
                i7Var3.f24312g0.c(i7Var3, i7Var3.L0);
                return;
        }
    }
}
