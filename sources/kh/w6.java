package kh;

import android.os.SystemClock;
public final class w6 implements Runnable {
    public final int f16239a;
    public final z6 f16240b;

    public w6(z6 z6Var, int i9) {
        this.f16239a = i9;
        this.f16240b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f16239a) {
            case 0:
                z6 z6Var = this.f16240b;
                z6Var.f16446n0 = false;
                z6Var.f16456v0 = false;
                z6Var.f16451r0 = SystemClock.elapsedRealtime();
                z6Var.f16449q0 = true;
                z6Var.f16453s0 = false;
                z6Var.F.c(false);
                z6Var.G.c(false);
                z6Var.H.c(false);
                ((ra) z6Var.f16428a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                z6 z6Var2 = this.f16240b;
                z6Var2.M = currentTimeMillis;
                z6Var2.N = 0L;
                z6Var2.f16446n0 = true;
                ((ra) z6Var2.f16428a).f15971a.F0.a(0L, true);
                return;
            case 2:
                z6 z6Var3 = this.f16240b;
                if (!z6Var3.f16446n0 && !z6Var3.b()) {
                    if (!wb.d(((ra) z6Var3.f16428a).f15971a)) {
                        z6Var3.f16453s0 = false;
                        z6Var3.F.c(false);
                        z6Var3.G.c(false);
                        z6Var3.H.c(false);
                        return;
                    }
                    z6Var3.f16456v0 = true;
                    z6Var3.f16458w0 = true;
                    ((ra) z6Var3.f16428a).e(new w6(z6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                z6 z6Var4 = this.f16240b;
                if (!z6Var4.f16446n0 && !z6Var4.b()) {
                    za zaVar = ((ra) z6Var4.f16428a).f15971a.f16322x0;
                    if (zaVar != null) {
                        zaVar.toggleDual();
                    }
                    z6Var4.d(360.0f);
                    z6Var4.f16453s0 = false;
                    z6Var4.F.c(false);
                    z6Var4.G.c(false);
                    z6Var4.H.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                z6 z6Var5 = this.f16240b;
                z6Var5.M = currentTimeMillis2;
                z6Var5.f16446n0 = true;
                x6 x6Var = z6Var5.f16428a;
                z6Var5.N = 0L;
                ((ra) x6Var).f15971a.F0.a(0L, true);
                return;
        }
    }
}
