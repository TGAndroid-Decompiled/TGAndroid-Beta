package li;

import org.telegram.ui.Components.c11;
public final class i0 implements Runnable {
    public final int f14804a;
    public final u0 f14805b;
    public final q0 f14806c;

    public i0(u0 u0Var, q0 q0Var, int i10, int i11) {
        this.f14804a = i11;
        this.f14805b = u0Var;
        this.f14806c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f14804a) {
            case 0:
                u0 u0Var = this.f14805b;
                q0 q0Var = this.f14806c;
                ((c11) u0Var.e).c(q0Var.f14945a);
                return;
            case 1:
                u0 u0Var2 = this.f14805b;
                q0 q0Var2 = this.f14806c;
                ((c11) u0Var2.e).c(q0Var2.f14945a);
                return;
            default:
                u0 u0Var3 = this.f14805b;
                q0 q0Var3 = this.f14806c;
                r0 r0Var = u0Var3.e;
                long j10 = q0Var3.f14945a;
                c11 c11Var = (c11) r0Var;
                synchronized (c11Var) {
                    c11Var.c(j10);
                }
                return;
        }
    }

    public i0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f14804a = 2;
        this.f14805b = u0Var;
        this.f14806c = q0Var;
    }
}
