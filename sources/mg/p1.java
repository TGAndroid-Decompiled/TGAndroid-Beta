package mg;
public final class p1 implements Runnable {
    public final int f13206a;
    public final v1 f13207b;

    public p1(v1 v1Var, int i10) {
        this.f13206a = i10;
        this.f13207b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f13206a) {
            case 0:
                this.f13207b.i1(true);
                return;
            case 1:
                this.f13207b.n1(true, false);
                return;
            case 2:
                this.f13207b.e1();
                return;
            case 3:
                this.f13207b.n1(true, false);
                return;
            case 4:
                this.f13207b.n1(true, false);
                return;
            case 5:
                this.f13207b.n1(true, false);
                return;
            case 6:
                v1 v1Var = this.f13207b;
                v1Var.W1.clear();
                v1Var.X1.clear();
                v1Var.dismiss();
                return;
            default:
                this.f13207b.dismiss();
                return;
        }
    }
}
