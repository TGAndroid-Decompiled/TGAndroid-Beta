package ki;

import org.telegram.ui.Components.i11;
public final class f0 implements Runnable {
    public final int f14921a;
    public final t0 f14922b;
    public final p0 f14923c;

    public f0(t0 t0Var, p0 p0Var, int i10, int i11) {
        this.f14921a = i11;
        this.f14922b = t0Var;
        this.f14923c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f14921a) {
            case 0:
                t0 t0Var = this.f14922b;
                p0 p0Var = this.f14923c;
                ((i11) t0Var.f15119e).c(p0Var.f15070a);
                return;
            case 1:
                t0 t0Var2 = this.f14922b;
                p0 p0Var2 = this.f14923c;
                ((i11) t0Var2.f15119e).c(p0Var2.f15070a);
                return;
            default:
                t0 t0Var3 = this.f14922b;
                p0 p0Var3 = this.f14923c;
                q0 q0Var = t0Var3.f15119e;
                long j3 = p0Var3.f15070a;
                i11 i11Var = (i11) q0Var;
                synchronized (i11Var) {
                    i11Var.c(j3);
                }
                return;
        }
    }

    public f0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f14921a = 2;
        this.f14922b = t0Var;
        this.f14923c = p0Var;
    }
}
