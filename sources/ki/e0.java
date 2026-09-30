package ki;

import org.telegram.ui.Components.r01;
public final class e0 implements Runnable {
    public final int f13691a;
    public final s0 f13692b;
    public final o0 f13693c;

    public e0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f13691a = i11;
        this.f13692b = s0Var;
        this.f13693c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f13691a) {
            case 0:
                s0 s0Var = this.f13692b;
                o0 o0Var = this.f13693c;
                ((r01) s0Var.e).c(o0Var.f13815a);
                return;
            case 1:
                s0 s0Var2 = this.f13692b;
                o0 o0Var2 = this.f13693c;
                ((r01) s0Var2.e).c(o0Var2.f13815a);
                return;
            default:
                s0 s0Var3 = this.f13692b;
                o0 o0Var3 = this.f13693c;
                p0 p0Var = s0Var3.e;
                long j3 = o0Var3.f13815a;
                r01 r01Var = (r01) p0Var;
                synchronized (r01Var) {
                    r01Var.c(j3);
                }
                return;
        }
    }

    public e0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f13691a = 2;
        this.f13692b = s0Var;
        this.f13693c = o0Var;
    }
}
