package hi;

import android.os.SystemClock;
public final class a6 implements Runnable {
    public final int f14253a;
    public final d6 f14254b;

    public a6(d6 d6Var, int i7) {
        this.f14253a = i7;
        this.f14254b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f14253a) {
            case 0:
                d6 d6Var = this.f14254b;
                d6Var.f14537s0 = false;
                d6Var.A0 = false;
                d6Var.f14542w0 = SystemClock.elapsedRealtime();
                d6Var.f14540v0 = true;
                d6Var.f14544x0 = false;
                d6Var.K.c(false);
                d6Var.L.c(false);
                d6Var.M.c(false);
                ((p9) d6Var.f14512a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                d6 d6Var2 = this.f14254b;
                d6Var2.R = currentTimeMillis;
                d6Var2.S = 0L;
                d6Var2.f14537s0 = true;
                ((p9) d6Var2.f14512a).f15282a.K0.a(0L, true);
                return;
            case 2:
                d6 d6Var3 = this.f14254b;
                if (!d6Var3.f14537s0 && !d6Var3.b()) {
                    if (!sa.c(((p9) d6Var3.f14512a).f15282a)) {
                        d6Var3.f14544x0 = false;
                        d6Var3.K.c(false);
                        d6Var3.L.c(false);
                        d6Var3.M.c(false);
                        return;
                    }
                    d6Var3.A0 = true;
                    d6Var3.B0 = true;
                    ((p9) d6Var3.f14512a).f(new a6(d6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                d6 d6Var4 = this.f14254b;
                if (!d6Var4.f14537s0 && !d6Var4.b()) {
                    v9 v9Var = ((p9) d6Var4.f14512a).f15282a.C0;
                    if (v9Var != null) {
                        v9Var.toggleDual();
                    }
                    d6Var4.d(360.0f);
                    d6Var4.f14544x0 = false;
                    d6Var4.K.c(false);
                    d6Var4.L.c(false);
                    d6Var4.M.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                d6 d6Var5 = this.f14254b;
                d6Var5.R = currentTimeMillis2;
                d6Var5.f14537s0 = true;
                b6 b6Var = d6Var5.f14512a;
                d6Var5.S = 0L;
                ((p9) b6Var).f15282a.K0.a(0L, true);
                return;
        }
    }
}
