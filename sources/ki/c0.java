package ki;

import org.telegram.ui.Components.r01;
public final class c0 implements Runnable {
    public final int f13661a = 0;
    public final q0 f13662b;
    public final m0 f13663c;

    public c0(q0 q0Var, m0 m0Var, int i10) {
        this.f13662b = q0Var;
        this.f13663c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f13661a) {
            case 0:
                q0 q0Var = this.f13662b;
                m0 m0Var = this.f13663c;
                ((r01) q0Var.d).a(m0Var.f13780a);
                return;
            default:
                q0 q0Var2 = this.f13662b;
                m0 m0Var2 = this.f13663c;
                n0 n0Var = q0Var2.d;
                long j3 = m0Var2.f13780a;
                r01 r01Var = (r01) n0Var;
                synchronized (r01Var) {
                    r01Var.a(j3);
                }
                return;
        }
    }

    public c0(q0 q0Var, m0 m0Var, Exception exc) {
        this.f13662b = q0Var;
        this.f13663c = m0Var;
    }
}
