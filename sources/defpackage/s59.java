package defpackage;

import android.os.SystemClock;
public final class s59 implements Runnable {
    public final byte a;
    public final u59 b;

    public s59(u59 u59Var, byte b) {
        this.a = b;
        this.b = u59Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        u59 u59Var = this.b;
        switch (b) {
            case 0:
                u59Var.s0 = false;
                u59Var.A0 = false;
                u59Var.w0 = SystemClock.elapsedRealtime();
                u59Var.v0 = true;
                u59Var.x0 = false;
                u59Var.K.c(false);
                u59Var.L.c(false);
                u59Var.M.c(false);
                ((sab) u59Var.a).e(true);
                return;
            case 1:
                u59Var.R = System.currentTimeMillis();
                u59Var.S = 0L;
                u59Var.s0 = true;
                ((sab) u59Var.a).a.K0.a(0L, true);
                return;
            case 2:
                if (!u59Var.s0 && !u59Var.b()) {
                    if (!((sab) u59Var.a).a.Y()) {
                        u59Var.x0 = false;
                        u59Var.K.c(false);
                        u59Var.L.c(false);
                        u59Var.M.c(false);
                        return;
                    }
                    u59Var.A0 = true;
                    u59Var.B0 = true;
                    ((sab) u59Var.a).f(new s59(u59Var, (byte) 4), true);
                    return;
                }
                return;
            case 3:
                if (!u59Var.s0 && !u59Var.b()) {
                    xab xabVar = ((sab) u59Var.a).a.C0;
                    if (xabVar != null) {
                        xabVar.toggleDual();
                    }
                    u59Var.d(360.0f);
                    u59Var.x0 = false;
                    u59Var.K.c(false);
                    u59Var.L.c(false);
                    u59Var.M.c(false);
                    return;
                }
                return;
            default:
                u59Var.R = System.currentTimeMillis();
                u59Var.s0 = true;
                t59 t59Var = u59Var.a;
                u59Var.S = 0L;
                ((sab) t59Var).a.K0.a(0L, true);
                return;
        }
    }
}
