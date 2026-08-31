package hg;
public final class x1 implements Runnable {
    public final int f7667a;
    public final f2 f7668b;

    public x1(f2 f2Var, int i10) {
        this.f7667a = i10;
        this.f7668b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f7667a) {
            case 0:
                this.f7668b.W(true);
                return;
            case 1:
                this.f7668b.b0(true, false);
                return;
            case 2:
                this.f7668b.R();
                return;
            case 3:
                this.f7668b.b0(true, false);
                return;
            case 4:
                this.f7668b.b0(true, false);
                return;
            case 5:
                this.f7668b.b0(true, false);
                return;
            case 6:
                f2 f2Var = this.f7668b;
                f2Var.f7471b0.clear();
                f2Var.f7472c0.clear();
                f2Var.dismiss();
                return;
            default:
                this.f7668b.dismiss();
                return;
        }
    }
}
