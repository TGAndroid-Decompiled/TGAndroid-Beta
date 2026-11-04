package ei;
public final class e8 implements Runnable {
    public final int f10236a;
    public final f8 f10237b;

    public e8(f8 f8Var, int i3) {
        this.f10236a = i3;
        this.f10237b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f10236a) {
            case 0:
                g8 g8Var = this.f10237b.v;
                g8Var.f10345s = 0;
                g8Var.requestLayout();
                h8 h8Var = g8Var.K;
                h8Var.L(h8Var.getWidth(), h8Var.getHeight());
                h8Var.requestLayout();
                return;
            case 1:
                g8 g8Var2 = this.f10237b.v;
                g8Var2.f10345s = 0;
                g8Var2.requestLayout();
                h8 h8Var2 = g8Var2.K;
                h8Var2.L(h8Var2.getWidth(), h8Var2.getHeight());
                h8Var2.requestLayout();
                return;
            case 2:
                f8 f8Var = this.f10237b;
                f8Var.v.post(new e8(f8Var, 3));
                return;
            default:
                this.f10237b.v.f10348y = true;
                return;
        }
    }
}
