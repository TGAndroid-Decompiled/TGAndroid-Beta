package di;
public final class e8 implements Runnable {
    public final int f8969a;
    public final f8 f8970b;

    public e8(f8 f8Var, int i7) {
        this.f8969a = i7;
        this.f8970b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f8969a) {
            case 0:
                g8 g8Var = this.f8970b.v;
                g8Var.f9058s = 0;
                g8Var.requestLayout();
                h8 h8Var = g8Var.J;
                h8Var.L(h8Var.getWidth(), h8Var.getHeight());
                h8Var.requestLayout();
                return;
            case 1:
                g8 g8Var2 = this.f8970b.v;
                g8Var2.f9058s = 0;
                g8Var2.requestLayout();
                h8 h8Var2 = g8Var2.J;
                h8Var2.L(h8Var2.getWidth(), h8Var2.getHeight());
                h8Var2.requestLayout();
                return;
            case 2:
                f8 f8Var = this.f8970b;
                f8Var.v.post(new e8(f8Var, 3));
                return;
            default:
                this.f8970b.v.f9061y = true;
                return;
        }
    }
}
