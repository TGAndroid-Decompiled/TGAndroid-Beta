package eg;
public final class y1 implements Runnable {
    public final int f6197a;
    public final g2 f6198b;

    public y1(g2 g2Var, int i10) {
        this.f6197a = i10;
        this.f6198b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f6197a) {
            case 0:
                this.f6198b.W(true);
                return;
            case 1:
                this.f6198b.b0(true, false);
                return;
            case 2:
                this.f6198b.R();
                return;
            case 3:
                this.f6198b.b0(true, false);
                return;
            case 4:
                this.f6198b.b0(true, false);
                return;
            case 5:
                this.f6198b.b0(true, false);
                return;
            case 6:
                g2 g2Var = this.f6198b;
                g2Var.f6003a0.clear();
                g2Var.f6004b0.clear();
                g2Var.dismiss();
                return;
            default:
                this.f6198b.dismiss();
                return;
        }
    }
}
