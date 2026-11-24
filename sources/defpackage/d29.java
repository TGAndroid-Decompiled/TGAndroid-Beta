package defpackage;

import android.os.SystemClock;
public final class d29 implements Runnable {
    public final byte a;
    public final f29 b;

    public d29(f29 f29Var, byte b) {
        this.a = b;
        this.b = f29Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f29 f29Var = this.b;
        switch (b) {
            case 0:
                f29Var.s0 = false;
                f29Var.A0 = false;
                f29Var.w0 = SystemClock.elapsedRealtime();
                f29Var.v0 = true;
                f29Var.x0 = false;
                f29Var.K.c(false);
                f29Var.L.c(false);
                f29Var.M.c(false);
                ((t6b) f29Var.a).e(true);
                return;
            case 1:
                f29Var.R = System.currentTimeMillis();
                f29Var.S = 0L;
                f29Var.s0 = true;
                ((t6b) f29Var.a).a.K0.a(0L, true);
                return;
            case 2:
                if (!f29Var.s0 && !f29Var.b()) {
                    if (!((t6b) f29Var.a).a.Y()) {
                        f29Var.x0 = false;
                        f29Var.K.c(false);
                        f29Var.L.c(false);
                        f29Var.M.c(false);
                        return;
                    }
                    f29Var.A0 = true;
                    f29Var.B0 = true;
                    ((t6b) f29Var.a).f(new d29(f29Var, (byte) 4), true);
                    return;
                }
                return;
            case 3:
                if (!f29Var.s0 && !f29Var.b()) {
                    y6b y6bVar = ((t6b) f29Var.a).a.C0;
                    if (y6bVar != null) {
                        y6bVar.toggleDual();
                    }
                    f29Var.d(360.0f);
                    f29Var.x0 = false;
                    f29Var.K.c(false);
                    f29Var.L.c(false);
                    f29Var.M.c(false);
                    return;
                }
                return;
            default:
                f29Var.R = System.currentTimeMillis();
                f29Var.s0 = true;
                e29 e29Var = f29Var.a;
                f29Var.S = 0L;
                ((t6b) e29Var).a.K0.a(0L, true);
                return;
        }
    }
}
