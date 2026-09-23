package ci;

import android.os.SystemClock;
public final class g7 implements Runnable {
    public final int f4725a;
    public final j7 f4726b;

    public g7(j7 j7Var, int i10) {
        this.f4725a = i10;
        this.f4726b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f4725a) {
            case 0:
                j7 j7Var = this.f4726b;
                j7Var.f4850r0 = false;
                j7Var.f4862z0 = false;
                j7Var.f4855v0 = SystemClock.elapsedRealtime();
                j7Var.f4854u0 = true;
                j7Var.f4857w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((gb) j7Var.f4828a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.f4726b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.f4850r0 = true;
                ((gb) j7Var2.f4828a).f4734a.J0.a(0L, true);
                return;
            case 2:
                j7 j7Var3 = this.f4726b;
                if (!j7Var3.f4850r0 && !j7Var3.b()) {
                    if (!lc.d(((gb) j7Var3.f4828a).f4734a)) {
                        j7Var3.f4857w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        return;
                    }
                    j7Var3.f4862z0 = true;
                    j7Var3.A0 = true;
                    ((gb) j7Var3.f4828a).e(new g7(j7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                j7 j7Var4 = this.f4726b;
                if (!j7Var4.f4850r0 && !j7Var4.b()) {
                    ob obVar = ((gb) j7Var4.f4828a).f4734a.B0;
                    if (obVar != null) {
                        obVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.f4857w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.f4726b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.f4850r0 = true;
                h7 h7Var = j7Var5.f4828a;
                j7Var5.R = 0L;
                ((gb) h7Var).f4734a.J0.a(0L, true);
                return;
        }
    }
}
