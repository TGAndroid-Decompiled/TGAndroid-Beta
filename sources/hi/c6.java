package hi;

import android.os.SystemClock;
public final class c6 implements Runnable {
    public final int f13981a;
    public final f6 f13982b;

    public c6(f6 f6Var, int i7) {
        this.f13981a = i7;
        this.f13982b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f13981a) {
            case 0:
                f6 f6Var = this.f13982b;
                f6Var.f14300s0 = false;
                f6Var.A0 = false;
                f6Var.f14305w0 = SystemClock.elapsedRealtime();
                f6Var.f14303v0 = true;
                f6Var.f14307x0 = false;
                f6Var.K.c(false);
                f6Var.L.c(false);
                f6Var.M.c(false);
                ((p9) f6Var.f14275a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                f6 f6Var2 = this.f13982b;
                f6Var2.R = currentTimeMillis;
                f6Var2.S = 0L;
                f6Var2.f14300s0 = true;
                ((p9) f6Var2.f14275a).f14881a.K0.a(0L, true);
                return;
            case 2:
                f6 f6Var3 = this.f13982b;
                if (!f6Var3.f14300s0 && !f6Var3.b()) {
                    if (!sa.c(((p9) f6Var3.f14275a).f14881a)) {
                        f6Var3.f14307x0 = false;
                        f6Var3.K.c(false);
                        f6Var3.L.c(false);
                        f6Var3.M.c(false);
                        return;
                    }
                    f6Var3.A0 = true;
                    f6Var3.B0 = true;
                    ((p9) f6Var3.f14275a).f(new c6(f6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                f6 f6Var4 = this.f13982b;
                if (!f6Var4.f14300s0 && !f6Var4.b()) {
                    v9 v9Var = ((p9) f6Var4.f14275a).f14881a.C0;
                    if (v9Var != null) {
                        v9Var.toggleDual();
                    }
                    f6Var4.d(360.0f);
                    f6Var4.f14307x0 = false;
                    f6Var4.K.c(false);
                    f6Var4.L.c(false);
                    f6Var4.M.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                f6 f6Var5 = this.f13982b;
                f6Var5.R = currentTimeMillis2;
                f6Var5.f14300s0 = true;
                d6 d6Var = f6Var5.f14275a;
                f6Var5.S = 0L;
                ((p9) d6Var).f14881a.K0.a(0L, true);
                return;
        }
    }
}
