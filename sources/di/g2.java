package di;
public final class g2 implements org.telegram.ui.ActionBar.q1 {
    public final int f8886a;
    public final f6 f8887b;

    public g2(f6 f6Var, int i7) {
        this.f8886a = i7;
        this.f8887b = f6Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f8886a) {
            case 0:
                this.f8887b.g2();
                return;
            case 1:
                f6 f6Var = this.f8887b;
                org.telegram.ui.Wallet.n6.N0(f6Var.f30173a, f6Var.getContext(), f6Var.J0);
                return;
            default:
                this.f8887b.g2();
                return;
        }
    }
}
