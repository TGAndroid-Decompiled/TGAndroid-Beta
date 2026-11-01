package li;

import org.telegram.ui.Components.mz0;
public final class k0 implements Runnable {
    public final int f12103a;
    public final x0 f12104b;
    public final t0 f12105c;

    public k0(x0 x0Var, t0 t0Var, int i10, int i11) {
        this.f12103a = i11;
        this.f12104b = x0Var;
        this.f12105c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f12103a) {
            case 0:
                x0 x0Var = this.f12104b;
                t0 t0Var = this.f12105c;
                ((mz0) x0Var.e).c(t0Var.f12248a);
                return;
            case 1:
                x0 x0Var2 = this.f12104b;
                t0 t0Var2 = this.f12105c;
                u0 u0Var = x0Var2.e;
                long j10 = t0Var2.f12248a;
                mz0 mz0Var = (mz0) u0Var;
                synchronized (mz0Var) {
                    mz0Var.c(j10);
                }
                return;
            default:
                x0 x0Var3 = this.f12104b;
                t0 t0Var3 = this.f12105c;
                ((mz0) x0Var3.e).c(t0Var3.f12248a);
                return;
        }
    }

    public k0(x0 x0Var, t0 t0Var, Exception exc) {
        this.f12103a = 1;
        this.f12104b = x0Var;
        this.f12105c = t0Var;
    }
}
