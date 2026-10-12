package ci;

import android.os.SystemClock;
public final class g7 implements Runnable {
    public final int f5120a;
    public final j7 f5121b;

    public g7(j7 j7Var, int i10) {
        this.f5120a = i10;
        this.f5121b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f5120a) {
            case 0:
                j7 j7Var = this.f5121b;
                j7Var.f5271r0 = false;
                j7Var.f5283z0 = false;
                j7Var.f5276v0 = SystemClock.elapsedRealtime();
                j7Var.f5275u0 = true;
                j7Var.f5278w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((gb) j7Var.f5248a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.f5121b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.f5271r0 = true;
                ((gb) j7Var2.f5248a).f5130a.J0.a(0L, true);
                return;
            case 2:
                j7 j7Var3 = this.f5121b;
                if (!j7Var3.f5271r0 && !j7Var3.b()) {
                    if (!lc.c(((gb) j7Var3.f5248a).f5130a)) {
                        j7Var3.f5278w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        return;
                    }
                    j7Var3.f5283z0 = true;
                    j7Var3.A0 = true;
                    ((gb) j7Var3.f5248a).f(new g7(j7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                j7 j7Var4 = this.f5121b;
                if (!j7Var4.f5271r0 && !j7Var4.b()) {
                    ob obVar = ((gb) j7Var4.f5248a).f5130a.B0;
                    if (obVar != null) {
                        obVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.f5278w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.f5121b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.f5271r0 = true;
                h7 h7Var = j7Var5.f5248a;
                j7Var5.R = 0L;
                ((gb) h7Var).f5130a.J0.a(0L, true);
                return;
        }
    }
}
