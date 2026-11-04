package gi;

import android.os.SystemClock;
public final class d6 implements Runnable {
    public final int f12584a;
    public final h6 f12585b;

    public d6(h6 h6Var, int i3) {
        this.f12584a = i3;
        this.f12585b = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f12584a) {
            case 0:
                h6 h6Var = this.f12585b;
                h6Var.f12908s0 = false;
                h6Var.A0 = false;
                h6Var.f12913w0 = SystemClock.elapsedRealtime();
                h6Var.f12911v0 = true;
                h6Var.f12915x0 = false;
                h6Var.K.c(false);
                h6Var.L.c(false);
                h6Var.M.c(false);
                ((s9) h6Var.f12883a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                h6 h6Var2 = this.f12585b;
                h6Var2.R = currentTimeMillis;
                h6Var2.S = 0L;
                h6Var2.f12908s0 = true;
                ((s9) h6Var2.f12883a).f13580a.K0.a(0L, true);
                return;
            case 2:
                h6 h6Var3 = this.f12585b;
                if (!h6Var3.f12908s0 && !h6Var3.b()) {
                    if (!va.c(((s9) h6Var3.f12883a).f13580a)) {
                        h6Var3.f12915x0 = false;
                        h6Var3.K.c(false);
                        h6Var3.L.c(false);
                        h6Var3.M.c(false);
                        return;
                    }
                    h6Var3.A0 = true;
                    h6Var3.B0 = true;
                    ((s9) h6Var3.f12883a).f(new d6(h6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                h6 h6Var4 = this.f12585b;
                if (!h6Var4.f12908s0 && !h6Var4.b()) {
                    y9 y9Var = ((s9) h6Var4.f12883a).f13580a.C0;
                    if (y9Var != null) {
                        y9Var.toggleDual();
                    }
                    h6Var4.d(360.0f);
                    h6Var4.f12915x0 = false;
                    h6Var4.K.c(false);
                    h6Var4.L.c(false);
                    h6Var4.M.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                h6 h6Var5 = this.f12585b;
                h6Var5.R = currentTimeMillis2;
                h6Var5.f12908s0 = true;
                e6 e6Var = h6Var5.f12883a;
                h6Var5.S = 0L;
                ((s9) e6Var).f13580a.K0.a(0L, true);
                return;
        }
    }
}
