package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f23625a;
    public final i7 f23626b;
    public final boolean f23627c;

    public d7(i7 i7Var, boolean z10, int i7) {
        this.f23625a = i7;
        this.f23626b = i7Var;
        this.f23627c = z10;
    }

    @Override
    public final void run() {
        switch (this.f23625a) {
            case 0:
                i7 i7Var = this.f23626b;
                try {
                    i7Var.k(0, this.f23627c, false);
                    return;
                } catch (Exception unused) {
                    i7Var.j(0, false);
                    return;
                }
            case 1:
                i7 i7Var2 = this.f23626b;
                i7Var2.Q = 0L;
                i7Var2.e(null, true, true);
                i7Var2.f24766y = this.f23627c;
                if (i7Var2.f24738j0 != 0 && !i7Var2.f24723e && !i7Var2.f24737j && !i7Var2.f24754r0) {
                    i7Var2.t();
                }
                i7Var2.s(-1);
                return;
            default:
                i7 i7Var3 = this.f23626b;
                String str = i7Var3.P0;
                if (s2.f26829a) {
                    a8.b("finished downloading file to " + i7Var3.L0 + " time = " + (System.currentTimeMillis() - i7Var3.f24722d1) + " dc = " + i7Var3.T + " size = " + g0.i0(i7Var3.f24716b0, false, false));
                }
                if (this.f23627c) {
                    int i7 = i7Var3.f24717b1;
                    if (i7 == 50331648) {
                        cz.e(i7Var3.R).i(t0.f(), 3, 1);
                    } else if (i7 == 33554432) {
                        cz.e(i7Var3.R).i(t0.f(), 2, 1);
                    } else if (i7 == 16777216) {
                        cz.e(i7Var3.R).i(t0.f(), 4, 1);
                    } else if (i7 == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            cz.e(i7Var3.R).i(t0.f(), 7, 1);
                        } else {
                            cz.e(i7Var3.R).i(t0.f(), 5, 1);
                        }
                    }
                }
                i7Var3.f24730g0.c(i7Var3, i7Var3.L0);
                return;
        }
    }
}
