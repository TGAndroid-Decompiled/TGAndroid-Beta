package lh;
public final class u5 implements Runnable {
    public final int f13024a;
    public final e6 f13025b;

    public u5(e6 e6Var, int i10) {
        this.f13024a = i10;
        this.f13025b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f13024a) {
            case 0:
                this.f13025b.Y(false);
                return;
            case 1:
                this.f13025b.Y(true);
                return;
            case 2:
                e6.U(this.f13025b);
                return;
            case 3:
                e6.T(this.f13025b);
                return;
            case 4:
                e6.R(this.f13025b);
                return;
            default:
                this.f13025b.dismiss();
                return;
        }
    }
}
