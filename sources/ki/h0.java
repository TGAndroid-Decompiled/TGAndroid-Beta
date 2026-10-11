package ki;

import org.telegram.ui.Components.h11;
public final class h0 implements Runnable {
    public final int f14932a;
    public final v0 f14933b;
    public final r0 f14934c;

    public h0(v0 v0Var, r0 r0Var, int i10, int i11) {
        this.f14932a = i11;
        this.f14933b = v0Var;
        this.f14934c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f14932a) {
            case 0:
                v0 v0Var = this.f14933b;
                r0 r0Var = this.f14934c;
                ((h11) v0Var.f15161e).c(r0Var.f15094a);
                return;
            case 1:
                v0 v0Var2 = this.f14933b;
                r0 r0Var2 = this.f14934c;
                ((h11) v0Var2.f15161e).c(r0Var2.f15094a);
                return;
            default:
                v0 v0Var3 = this.f14933b;
                r0 r0Var3 = this.f14934c;
                s0 s0Var = v0Var3.f15161e;
                long j3 = r0Var3.f15094a;
                h11 h11Var = (h11) s0Var;
                synchronized (h11Var) {
                    h11Var.c(j3);
                }
                return;
        }
    }

    public h0(v0 v0Var, r0 r0Var, Exception exc) {
        this.f14932a = 2;
        this.f14933b = v0Var;
        this.f14934c = r0Var;
    }
}
