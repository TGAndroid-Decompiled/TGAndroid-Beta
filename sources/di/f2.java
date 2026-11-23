package di;
public final class f2 implements org.telegram.ui.ActionBar.q1 {
    public final int f8744a;
    public final f6 f8745b;

    public f2(f6 f6Var, int i7) {
        this.f8744a = i7;
        this.f8745b = f6Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f8744a) {
            case 0:
                this.f8745b.g2();
                return;
            case 1:
                f6 f6Var = this.f8745b;
                org.telegram.ui.Wallet.n6.N0(f6Var.f30139a, f6Var.getContext(), f6Var.J0);
                return;
            default:
                this.f8745b.g2();
                return;
        }
    }
}
