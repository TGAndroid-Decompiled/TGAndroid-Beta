package ki;

import org.telegram.ui.Components.p01;
public final class c0 implements Runnable {
    public final int f13663a = 0;
    public final o0 f13664b;
    public final k0 f13665c;

    public c0(o0 o0Var, k0 k0Var, int i10) {
        this.f13664b = o0Var;
        this.f13665c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f13663a) {
            case 0:
                o0 o0Var = this.f13664b;
                k0 k0Var = this.f13665c;
                ((p01) o0Var.d).a(k0Var.f13762a);
                return;
            default:
                o0 o0Var2 = this.f13664b;
                k0 k0Var2 = this.f13665c;
                l0 l0Var = o0Var2.d;
                long j3 = k0Var2.f13762a;
                p01 p01Var = (p01) l0Var;
                synchronized (p01Var) {
                    p01Var.a(j3);
                }
                return;
        }
    }

    public c0(o0 o0Var, k0 k0Var, Exception exc) {
        this.f13664b = o0Var;
        this.f13665c = k0Var;
    }
}
