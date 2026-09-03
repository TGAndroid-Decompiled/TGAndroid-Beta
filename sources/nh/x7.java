package nh;
public final class x7 implements Runnable {
    public final int f16042a;
    public final y7 f16043b;

    public x7(y7 y7Var, int i10) {
        this.f16042a = i10;
        this.f16043b = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f16042a) {
            case 0:
                z7 z7Var = this.f16043b.v;
                z7Var.f16109s = 0;
                z7Var.requestLayout();
                a8 a8Var = z7Var.G;
                a8Var.L(a8Var.getWidth(), a8Var.getHeight());
                a8Var.requestLayout();
                return;
            case 1:
                z7 z7Var2 = this.f16043b.v;
                z7Var2.f16109s = 0;
                z7Var2.requestLayout();
                a8 a8Var2 = z7Var2.G;
                a8Var2.L(a8Var2.getWidth(), a8Var2.getHeight());
                a8Var2.requestLayout();
                return;
            case 2:
                y7 y7Var = this.f16043b;
                y7Var.v.post(new x7(y7Var, 3));
                return;
            default:
                this.f16043b.v.f16111x = true;
                return;
        }
    }
}
