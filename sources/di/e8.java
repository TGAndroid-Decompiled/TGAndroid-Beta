package di;
public final class e8 implements Runnable {
    public final int f8962a;
    public final g8 f8963b;

    public e8(g8 g8Var, int i7) {
        this.f8962a = i7;
        this.f8963b = g8Var;
    }

    @Override
    public final void run() {
        switch (this.f8962a) {
            case 0:
                h8 h8Var = this.f8963b.v;
                h8Var.f9084s = 0;
                h8Var.requestLayout();
                i8 i8Var = h8Var.J;
                i8Var.L(i8Var.getWidth(), i8Var.getHeight());
                i8Var.requestLayout();
                return;
            case 1:
                h8 h8Var2 = this.f8963b.v;
                h8Var2.f9084s = 0;
                h8Var2.requestLayout();
                i8 i8Var2 = h8Var2.J;
                i8Var2.L(i8Var2.getWidth(), i8Var2.getHeight());
                i8Var2.requestLayout();
                return;
            case 2:
                g8 g8Var = this.f8963b;
                g8Var.v.post(new e8(g8Var, 3));
                return;
            default:
                this.f8963b.v.f9087y = true;
                return;
        }
    }
}
