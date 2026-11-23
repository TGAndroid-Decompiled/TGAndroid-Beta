package di;
public final class g2 implements org.telegram.ui.ActionBar.q1 {
    public final int f8847a;
    public final f6 f8848b;

    public g2(f6 f6Var, int i7) {
        this.f8847a = i7;
        this.f8848b = f6Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f8847a) {
            case 0:
                this.f8848b.g2();
                return;
            case 1:
                f6 f6Var = this.f8848b;
                org.telegram.ui.Wallet.o6.N0(f6Var.f30223a, f6Var.getContext(), f6Var.J0);
                return;
            default:
                this.f8848b.g2();
                return;
        }
    }
}
