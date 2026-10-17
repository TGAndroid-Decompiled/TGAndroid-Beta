package ei;

import android.os.SystemClock;
public final class w6 implements Runnable {
    public final int f10043a;
    public final z6 f10044b;

    public w6(z6 z6Var, int i10) {
        this.f10043a = i10;
        this.f10044b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f10043a) {
            case 0:
                z6 z6Var = this.f10044b;
                z6Var.f10228r0 = false;
                z6Var.f10240z0 = false;
                z6Var.f10233v0 = SystemClock.elapsedRealtime();
                z6Var.f10232u0 = true;
                z6Var.f10235w0 = false;
                z6Var.J.c(false);
                z6Var.K.c(false);
                z6Var.L.c(false);
                ((qa) z6Var.f10206a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                z6 z6Var2 = this.f10044b;
                z6Var2.Q = currentTimeMillis;
                z6Var2.R = 0L;
                z6Var2.f10228r0 = true;
                ((qa) z6Var2.f10206a).f9664a.J0.a(0L, true);
                return;
            case 2:
                z6 z6Var3 = this.f10044b;
                if (!z6Var3.f10228r0 && !z6Var3.b()) {
                    if (!vb.c(((qa) z6Var3.f10206a).f9664a)) {
                        z6Var3.f10235w0 = false;
                        z6Var3.J.c(false);
                        z6Var3.K.c(false);
                        z6Var3.L.c(false);
                        return;
                    }
                    z6Var3.f10240z0 = true;
                    z6Var3.A0 = true;
                    ((qa) z6Var3.f10206a).f(new w6(z6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                z6 z6Var4 = this.f10044b;
                if (!z6Var4.f10228r0 && !z6Var4.b()) {
                    ya yaVar = ((qa) z6Var4.f10206a).f9664a.B0;
                    if (yaVar != null) {
                        yaVar.toggleDual();
                    }
                    z6Var4.d(360.0f);
                    z6Var4.f10235w0 = false;
                    z6Var4.J.c(false);
                    z6Var4.K.c(false);
                    z6Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                z6 z6Var5 = this.f10044b;
                z6Var5.Q = currentTimeMillis2;
                z6Var5.f10228r0 = true;
                x6 x6Var = z6Var5.f10206a;
                z6Var5.R = 0L;
                ((qa) x6Var).f9664a.J0.a(0L, true);
                return;
        }
    }
}
