package bg;
public final class h2 implements Runnable {
    public final int f1828a;
    public final q2 f1829b;

    public h2(q2 q2Var, int i9) {
        this.f1828a = i9;
        this.f1829b = q2Var;
    }

    @Override
    public final void run() {
        switch (this.f1828a) {
            case 0:
                this.f1829b.V(true);
                return;
            case 1:
                this.f1829b.a0(true, false);
                return;
            case 2:
                this.f1829b.Q();
                return;
            case 3:
                this.f1829b.a0(true, false);
                return;
            case 4:
                this.f1829b.a0(true, false);
                return;
            case 5:
                this.f1829b.a0(true, false);
                return;
            case 6:
                q2 q2Var = this.f1829b;
                q2Var.f1923a0.clear();
                q2Var.f1924b0.clear();
                q2Var.dismiss();
                return;
            default:
                this.f1829b.dismiss();
                return;
        }
    }
}
