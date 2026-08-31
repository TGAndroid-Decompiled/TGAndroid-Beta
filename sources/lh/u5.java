package lh;
public final class u5 implements Runnable {
    public final int f13022a;
    public final e6 f13023b;

    public u5(e6 e6Var, int i10) {
        this.f13022a = i10;
        this.f13023b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f13022a) {
            case 0:
                this.f13023b.Y(false);
                return;
            case 1:
                this.f13023b.Y(true);
                return;
            case 2:
                e6.U(this.f13023b);
                return;
            case 3:
                e6.T(this.f13023b);
                return;
            case 4:
                e6.R(this.f13023b);
                return;
            default:
                this.f13023b.dismiss();
                return;
        }
    }
}
