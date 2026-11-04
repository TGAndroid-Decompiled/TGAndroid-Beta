package o4;
public final class i0 implements Runnable {
    public final int f20675a;
    public final o0 f20676b;
    public final l1 f20677c;

    public i0(o0 o0Var, l1 l1Var, int i3) {
        this.f20675a = i3;
        this.f20676b = o0Var;
        this.f20677c = l1Var;
    }

    @Override
    public final void run() {
        d2.n1 n1Var;
        switch (this.f20675a) {
            case 0:
                o0 o0Var = this.f20676b;
                p4.q qVar = o0Var.f20779n;
                l1 l1Var = this.f20677c;
                qVar.G(o0Var.h0(l1Var));
                m0 m0Var = o0Var.f20775j;
                if (l1Var.t().a(17)) {
                    n1Var = l1Var.y0();
                } else {
                    n1Var = d2.n1.f8245a;
                }
                m0Var.v(n1Var);
                return;
            default:
                o0 o0Var2 = this.f20676b;
                o0Var2.f20779n.G(o0Var2.h0(this.f20677c));
                return;
        }
    }
}
