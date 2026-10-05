package ki;

import org.telegram.ui.Components.a11;
public final class e0 implements Runnable {
    public final int f14868a;
    public final s0 f14869b;
    public final o0 f14870c;

    public e0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f14868a = i11;
        this.f14869b = s0Var;
        this.f14870c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f14868a) {
            case 0:
                s0 s0Var = this.f14869b;
                o0 o0Var = this.f14870c;
                ((a11) s0Var.f15047e).c(o0Var.f14998a);
                return;
            case 1:
                s0 s0Var2 = this.f14869b;
                o0 o0Var2 = this.f14870c;
                ((a11) s0Var2.f15047e).c(o0Var2.f14998a);
                return;
            default:
                s0 s0Var3 = this.f14869b;
                o0 o0Var3 = this.f14870c;
                p0 p0Var = s0Var3.f15047e;
                long j3 = o0Var3.f14998a;
                a11 a11Var = (a11) p0Var;
                synchronized (a11Var) {
                    a11Var.c(j3);
                }
                return;
        }
    }

    public e0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f14868a = 2;
        this.f14869b = s0Var;
        this.f14870c = o0Var;
    }
}
