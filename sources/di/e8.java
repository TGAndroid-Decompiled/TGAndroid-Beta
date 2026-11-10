package di;
public final class e8 implements Runnable {
    public final int f8967a;
    public final g8 f8968b;

    public e8(g8 g8Var, int i7) {
        this.f8967a = i7;
        this.f8968b = g8Var;
    }

    @Override
    public final void run() {
        switch (this.f8967a) {
            case 0:
                h8 h8Var = this.f8968b.v;
                h8Var.f9089s = 0;
                h8Var.requestLayout();
                i8 i8Var = h8Var.J;
                i8Var.L(i8Var.getWidth(), i8Var.getHeight());
                i8Var.requestLayout();
                return;
            case 1:
                h8 h8Var2 = this.f8968b.v;
                h8Var2.f9089s = 0;
                h8Var2.requestLayout();
                i8 i8Var2 = h8Var2.J;
                i8Var2.L(i8Var2.getWidth(), i8Var2.getHeight());
                i8Var2.requestLayout();
                return;
            case 2:
                g8 g8Var = this.f8968b;
                g8Var.v.post(new e8(g8Var, 3));
                return;
            default:
                this.f8968b.v.f9092y = true;
                return;
        }
    }
}
