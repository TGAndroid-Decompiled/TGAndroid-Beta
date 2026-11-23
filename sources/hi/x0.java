package hi;

import org.telegram.messenger.gd;
public final class x0 implements Runnable {
    public final int f15701a;
    public final d1 f15702b;

    public x0(d1 d1Var, int i7) {
        this.f15701a = i7;
        this.f15702b = d1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15701a;
        d1 d1Var = this.f15702b;
        switch (i7) {
            case 0:
                d1Var.b();
                return;
            case 1:
                d1Var.f14299e = false;
                a1 a1Var = d1Var.f14303s;
                if (a1Var != null) {
                    a1Var.a(true);
                    d1Var.f14303s = null;
                }
                c1 c1Var = d1Var.f14301n;
                if (c1Var != null) {
                    c1Var.a();
                }
                d1Var.f14298c = false;
                d1Var.d();
                return;
            default:
                if (d1Var.f14298c && d1Var.f14302r != null) {
                    d1Var.f14301n.b(2131624012, 3500, gd.O0("VideoConvertFail"));
                    d1Var.f14298c = false;
                    d1Var.d();
                    return;
                }
                return;
        }
    }
}
