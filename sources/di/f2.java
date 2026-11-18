package di;
public final class f2 implements org.telegram.ui.ActionBar.r1 {
    public final int f8755a;
    public final f6 f8756b;

    public f2(f6 f6Var, int i7) {
        this.f8755a = i7;
        this.f8756b = f6Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f8755a) {
            case 0:
                this.f8756b.g2();
                return;
            case 1:
                f6 f6Var = this.f8756b;
                org.telegram.ui.Wallet.n6.N0(f6Var.f30187a, f6Var.getContext(), f6Var.J0);
                return;
            default:
                this.f8756b.g2();
                return;
        }
    }
}
