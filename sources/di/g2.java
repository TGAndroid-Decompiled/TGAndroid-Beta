package di;
public final class g2 implements org.telegram.ui.ActionBar.q1 {
    public final int f8883a;
    public final f6 f8884b;

    public g2(f6 f6Var, int i7) {
        this.f8883a = i7;
        this.f8884b = f6Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f8883a) {
            case 0:
                this.f8884b.g2();
                return;
            case 1:
                f6 f6Var = this.f8884b;
                org.telegram.ui.Wallet.n6.N0(f6Var.f30170a, f6Var.getContext(), f6Var.J0);
                return;
            default:
                this.f8884b.g2();
                return;
        }
    }
}
