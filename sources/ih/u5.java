package ih;
public final class u5 implements Runnable {
    public final int f9417a;
    public final e6 f9418b;

    public u5(e6 e6Var, int i10) {
        this.f9417a = i10;
        this.f9418b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f9417a) {
            case 0:
                this.f9418b.Y(false);
                return;
            case 1:
                this.f9418b.Y(true);
                return;
            case 2:
                e6.U(this.f9418b);
                return;
            case 3:
                e6.T(this.f9418b);
                return;
            case 4:
                e6.R(this.f9418b);
                return;
            default:
                this.f9418b.dismiss();
                return;
        }
    }
}
