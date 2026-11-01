package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f16030a;
    public final m7 f16031b;
    public final boolean f16032c;

    public h7(m7 m7Var, boolean z10, int i10) {
        this.f16030a = i10;
        this.f16031b = m7Var;
        this.f16032c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16030a) {
            case 0:
                m7 m7Var = this.f16031b;
                try {
                    m7Var.k(0, this.f16032c, false);
                    return;
                } catch (Exception unused) {
                    m7Var.j(0, false);
                    return;
                }
            case 1:
                m7 m7Var2 = this.f16031b;
                m7Var2.Q = 0L;
                m7Var2.e(null, true, true);
                m7Var2.f17095y = this.f16032c;
                if (m7Var2.f17067j0 != 0 && !m7Var2.e && !m7Var2.f17066j && !m7Var2.f17083r0) {
                    m7Var2.t();
                }
                m7Var2.s(-1);
                return;
            default:
                m7 m7Var3 = this.f16031b;
                String str = m7Var3.P0;
                if (v2.f18578a) {
                    f8.b("finished downloading file to " + m7Var3.L0 + " time = " + (System.currentTimeMillis() - m7Var3.f17052d1) + " dc = " + m7Var3.T + " size = " + i0.i0(m7Var3.f17046b0, false, false));
                }
                if (this.f16032c) {
                    int i10 = m7Var3.f17047b1;
                    if (i10 == 50331648) {
                        vz.e(m7Var3.R).i(w0.f(), 3, 1);
                    } else if (i10 == 33554432) {
                        vz.e(m7Var3.R).i(w0.f(), 2, 1);
                    } else if (i10 == 16777216) {
                        vz.e(m7Var3.R).i(w0.f(), 4, 1);
                    } else if (i10 == 67108864) {
                        if (str != null && (str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            vz.e(m7Var3.R).i(w0.f(), 7, 1);
                        } else {
                            vz.e(m7Var3.R).i(w0.f(), 5, 1);
                        }
                    }
                }
                m7Var3.f17059g0.c(m7Var3, m7Var3.L0);
                return;
        }
    }
}
