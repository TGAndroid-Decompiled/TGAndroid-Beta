package ki;

import org.telegram.ui.Components.z01;
public final class e0 implements Runnable {
    public final int f14867a;
    public final s0 f14868b;
    public final o0 f14869c;

    public e0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f14867a = i11;
        this.f14868b = s0Var;
        this.f14869c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f14867a) {
            case 0:
                s0 s0Var = this.f14868b;
                o0 o0Var = this.f14869c;
                ((z01) s0Var.f15046e).c(o0Var.f14997a);
                return;
            case 1:
                s0 s0Var2 = this.f14868b;
                o0 o0Var2 = this.f14869c;
                ((z01) s0Var2.f15046e).c(o0Var2.f14997a);
                return;
            default:
                s0 s0Var3 = this.f14868b;
                o0 o0Var3 = this.f14869c;
                p0 p0Var = s0Var3.f15046e;
                long j3 = o0Var3.f14997a;
                z01 z01Var = (z01) p0Var;
                synchronized (z01Var) {
                    z01Var.c(j3);
                }
                return;
        }
    }

    public e0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f14867a = 2;
        this.f14868b = s0Var;
        this.f14869c = o0Var;
    }
}
