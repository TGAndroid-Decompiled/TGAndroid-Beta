package ki;

import org.telegram.ui.Components.p01;
public final class e0 implements Runnable {
    public final int f13676a;
    public final s0 f13677b;
    public final o0 f13678c;

    public e0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f13676a = i11;
        this.f13677b = s0Var;
        this.f13678c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f13676a) {
            case 0:
                s0 s0Var = this.f13677b;
                o0 o0Var = this.f13678c;
                ((p01) s0Var.d).c(o0Var.f13799a);
                return;
            case 1:
                s0 s0Var2 = this.f13677b;
                o0 o0Var2 = this.f13678c;
                ((p01) s0Var2.d).c(o0Var2.f13799a);
                return;
            default:
                s0 s0Var3 = this.f13677b;
                o0 o0Var3 = this.f13678c;
                p0 p0Var = s0Var3.d;
                long j3 = o0Var3.f13799a;
                p01 p01Var = (p01) p0Var;
                synchronized (p01Var) {
                    p01Var.c(j3);
                }
                return;
        }
    }

    public e0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f13676a = 2;
        this.f13677b = s0Var;
        this.f13678c = o0Var;
    }
}
