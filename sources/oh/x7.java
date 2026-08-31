package oh;
public final class x7 implements Runnable {
    public final int f17932a;
    public final y7 f17933b;

    public x7(y7 y7Var, int i10) {
        this.f17932a = i10;
        this.f17933b = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f17932a) {
            case 0:
                z7 z7Var = this.f17933b.v;
                z7Var.f18004s = 0;
                z7Var.requestLayout();
                a8 a8Var = z7Var.G;
                a8Var.L(a8Var.getWidth(), a8Var.getHeight());
                a8Var.requestLayout();
                return;
            case 1:
                z7 z7Var2 = this.f17933b.v;
                z7Var2.f18004s = 0;
                z7Var2.requestLayout();
                a8 a8Var2 = z7Var2.G;
                a8Var2.L(a8Var2.getWidth(), a8Var2.getHeight());
                a8Var2.requestLayout();
                return;
            case 2:
                y7 y7Var = this.f17933b;
                y7Var.v.post(new x7(y7Var, 3));
                return;
            default:
                this.f17933b.v.f18006x = true;
                return;
        }
    }
}
