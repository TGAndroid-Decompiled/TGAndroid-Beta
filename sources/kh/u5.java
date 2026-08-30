package kh;
public final class u5 implements Runnable {
    public final int f10870a;
    public final e6 f10871b;

    public u5(e6 e6Var, int i10) {
        this.f10870a = i10;
        this.f10871b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f10870a) {
            case 0:
                this.f10871b.Y(false);
                return;
            case 1:
                this.f10871b.Y(true);
                return;
            case 2:
                e6.U(this.f10871b);
                return;
            case 3:
                e6.T(this.f10871b);
                return;
            case 4:
                e6.R(this.f10871b);
                return;
            default:
                this.f10871b.dismiss();
                return;
        }
    }
}
