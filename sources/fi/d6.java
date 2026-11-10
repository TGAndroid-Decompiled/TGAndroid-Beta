package fi;

import android.os.SystemClock;
public final class d6 implements Runnable {
    public final int f11794a;
    public final g6 f11795b;

    public d6(g6 g6Var, int i7) {
        this.f11794a = i7;
        this.f11795b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f11794a) {
            case 0:
                g6 g6Var = this.f11795b;
                g6Var.f12098r0 = false;
                g6Var.f12110z0 = false;
                g6Var.f12103v0 = SystemClock.elapsedRealtime();
                g6Var.f12102u0 = true;
                g6Var.f12105w0 = false;
                g6Var.J.c(false);
                g6Var.K.c(false);
                g6Var.L.c(false);
                ((r9) g6Var.f12075a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                g6 g6Var2 = this.f11795b;
                g6Var2.Q = currentTimeMillis;
                g6Var2.R = 0L;
                g6Var2.f12098r0 = true;
                ((r9) g6Var2.f12075a).f12762a.J0.a(0L, true);
                return;
            case 2:
                g6 g6Var3 = this.f11795b;
                if (!g6Var3.f12098r0 && !g6Var3.b()) {
                    if (!va.c(((r9) g6Var3.f12075a).f12762a)) {
                        g6Var3.f12105w0 = false;
                        g6Var3.J.c(false);
                        g6Var3.K.c(false);
                        g6Var3.L.c(false);
                        return;
                    }
                    g6Var3.f12110z0 = true;
                    g6Var3.A0 = true;
                    ((r9) g6Var3.f12075a).f(new d6(g6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                g6 g6Var4 = this.f11795b;
                if (!g6Var4.f12098r0 && !g6Var4.b()) {
                    y9 y9Var = ((r9) g6Var4.f12075a).f12762a.B0;
                    if (y9Var != null) {
                        y9Var.toggleDual();
                    }
                    g6Var4.d(360.0f);
                    g6Var4.f12105w0 = false;
                    g6Var4.J.c(false);
                    g6Var4.K.c(false);
                    g6Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                g6 g6Var5 = this.f11795b;
                g6Var5.Q = currentTimeMillis2;
                g6Var5.f12098r0 = true;
                e6 e6Var = g6Var5.f12075a;
                g6Var5.R = 0L;
                ((r9) e6Var).f12762a.J0.a(0L, true);
                return;
        }
    }
}
