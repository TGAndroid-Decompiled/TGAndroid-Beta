package hi;

import android.os.SystemClock;
public final class b6 implements Runnable {
    public final int f14218a;
    public final e6 f14219b;

    public b6(e6 e6Var, int i7) {
        this.f14218a = i7;
        this.f14219b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f14218a) {
            case 0:
                e6 e6Var = this.f14219b;
                e6Var.f14535s0 = false;
                e6Var.A0 = false;
                e6Var.f14540w0 = SystemClock.elapsedRealtime();
                e6Var.f14538v0 = true;
                e6Var.f14542x0 = false;
                e6Var.K.c(false);
                e6Var.L.c(false);
                e6Var.M.c(false);
                ((q9) e6Var.f14510a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                e6 e6Var2 = this.f14219b;
                e6Var2.R = currentTimeMillis;
                e6Var2.S = 0L;
                e6Var2.f14535s0 = true;
                ((q9) e6Var2.f14510a).f15255a.K0.a(0L, true);
                return;
            case 2:
                e6 e6Var3 = this.f14219b;
                if (!e6Var3.f14535s0 && !e6Var3.b()) {
                    if (!ta.c(((q9) e6Var3.f14510a).f15255a)) {
                        e6Var3.f14542x0 = false;
                        e6Var3.K.c(false);
                        e6Var3.L.c(false);
                        e6Var3.M.c(false);
                        return;
                    }
                    e6Var3.A0 = true;
                    e6Var3.B0 = true;
                    ((q9) e6Var3.f14510a).f(new b6(e6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                e6 e6Var4 = this.f14219b;
                if (!e6Var4.f14535s0 && !e6Var4.b()) {
                    w9 w9Var = ((q9) e6Var4.f14510a).f15255a.C0;
                    if (w9Var != null) {
                        w9Var.toggleDual();
                    }
                    e6Var4.d(360.0f);
                    e6Var4.f14542x0 = false;
                    e6Var4.K.c(false);
                    e6Var4.L.c(false);
                    e6Var4.M.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                e6 e6Var5 = this.f14219b;
                e6Var5.R = currentTimeMillis2;
                e6Var5.f14535s0 = true;
                c6 c6Var = e6Var5.f14510a;
                e6Var5.S = 0L;
                ((q9) c6Var).f15255a.K0.a(0L, true);
                return;
        }
    }
}
