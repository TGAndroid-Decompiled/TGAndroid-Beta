package ki;

import org.telegram.ui.Components.q01;
public final class a0 implements Runnable {
    public final int f13652a = 0;
    public final h0 f13653b;
    public final e0 f13654c;

    public a0(h0 h0Var, e0 e0Var, int i10) {
        this.f13653b = h0Var;
        this.f13654c = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f13652a) {
            case 0:
                h0 h0Var = this.f13653b;
                e0 e0Var = this.f13654c;
                ((q01) h0Var.d).a(e0Var.f13670a);
                return;
            default:
                h0 h0Var2 = this.f13653b;
                e0 e0Var2 = this.f13654c;
                f0 f0Var = h0Var2.d;
                long j3 = e0Var2.f13670a;
                q01 q01Var = (q01) f0Var;
                synchronized (q01Var) {
                    q01Var.a(j3);
                }
                return;
        }
    }

    public a0(h0 h0Var, e0 e0Var, Exception exc) {
        this.f13653b = h0Var;
        this.f13654c = e0Var;
    }
}
