package hi;

import android.os.SystemClock;
public final class k6 implements Runnable {
    public final int f14779a;
    public final n6 f14780b;

    public k6(n6 n6Var, int i7) {
        this.f14779a = i7;
        this.f14780b = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f14779a) {
            case 0:
                n6 n6Var = this.f14780b;
                n6Var.f15038s0 = false;
                n6Var.A0 = false;
                n6Var.f15043w0 = SystemClock.elapsedRealtime();
                n6Var.f15041v0 = true;
                n6Var.f15045x0 = false;
                n6Var.K.c(false);
                n6Var.L.c(false);
                n6Var.M.c(false);
                ((ka) n6Var.f15013a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                n6 n6Var2 = this.f14780b;
                n6Var2.R = currentTimeMillis;
                n6Var2.S = 0L;
                n6Var2.f15038s0 = true;
                ((ka) n6Var2.f15013a).f14800a.K0.a(0L, true);
                return;
            case 2:
                n6 n6Var3 = this.f14780b;
                if (!n6Var3.f15038s0 && !n6Var3.b()) {
                    if (!nb.c(((ka) n6Var3.f15013a).f14800a)) {
                        n6Var3.f15045x0 = false;
                        n6Var3.K.c(false);
                        n6Var3.L.c(false);
                        n6Var3.M.c(false);
                        return;
                    }
                    n6Var3.A0 = true;
                    n6Var3.B0 = true;
                    ((ka) n6Var3.f15013a).f(new k6(n6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                n6 n6Var4 = this.f14780b;
                if (!n6Var4.f15038s0 && !n6Var4.b()) {
                    qa qaVar = ((ka) n6Var4.f15013a).f14800a.C0;
                    if (qaVar != null) {
                        qaVar.toggleDual();
                    }
                    n6Var4.d(360.0f);
                    n6Var4.f15045x0 = false;
                    n6Var4.K.c(false);
                    n6Var4.L.c(false);
                    n6Var4.M.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                n6 n6Var5 = this.f14780b;
                n6Var5.R = currentTimeMillis2;
                n6Var5.f15038s0 = true;
                l6 l6Var = n6Var5.f15013a;
                n6Var5.S = 0L;
                ((ka) l6Var).f14800a.K0.a(0L, true);
                return;
        }
    }
}
