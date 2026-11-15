package fi;
public final class x7 implements Runnable {
    public final int f12511a;
    public final y7 f12512b;

    public x7(y7 y7Var, int i7) {
        this.f12511a = i7;
        this.f12512b = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f12511a) {
            case 0:
                z7 z7Var = this.f12512b.v;
                z7Var.f12601s = 0;
                z7Var.requestLayout();
                a8 a8Var = z7Var.K;
                a8Var.L(a8Var.getWidth(), a8Var.getHeight());
                a8Var.requestLayout();
                return;
            case 1:
                z7 z7Var2 = this.f12512b.v;
                z7Var2.f12601s = 0;
                z7Var2.requestLayout();
                a8 a8Var2 = z7Var2.K;
                a8Var2.L(a8Var2.getWidth(), a8Var2.getHeight());
                a8Var2.requestLayout();
                return;
            case 2:
                y7 y7Var = this.f12512b;
                y7Var.v.post(new x7(y7Var, 3));
                return;
            default:
                this.f12512b.v.f12604y = true;
                return;
        }
    }
}
