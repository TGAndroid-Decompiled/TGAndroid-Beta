package m4;
public final class g0 implements Runnable {
    public final int f13369a;
    public final l0 f13370b;
    public final l1 f13371c;

    public g0(l0 l0Var, l1 l1Var, int i10) {
        this.f13369a = i10;
        this.f13370b = l0Var;
        this.f13371c = l1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f13369a) {
            case 0:
                l0 l0Var = this.f13370b;
                n4.y yVar = l0Var.f13433k;
                l1 l1Var = this.f13371c;
                yVar.w(l0Var.G(l1Var));
                j0 j0Var = l0Var.f13431i;
                if (l1Var.t().a(17)) {
                    k1Var = l1Var.w0();
                } else {
                    k1Var = b2.k1.f1774a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f13370b;
                l0Var2.f13433k.w(l0Var2.G(this.f13371c));
                return;
        }
    }
}
