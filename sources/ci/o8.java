package ci;
public final class o8 implements Runnable {
    public final int f5640a;
    public final p8 f5641b;

    public o8(p8 p8Var, int i10) {
        this.f5640a = i10;
        this.f5641b = p8Var;
    }

    @Override
    public final void run() {
        switch (this.f5640a) {
            case 0:
                q8 q8Var = this.f5641b.v;
                q8Var.f5804s = 0;
                q8Var.requestLayout();
                r8 r8Var = q8Var.J;
                r8Var.L(r8Var.getWidth(), r8Var.getHeight());
                r8Var.requestLayout();
                return;
            case 1:
                q8 q8Var2 = this.f5641b.v;
                q8Var2.f5804s = 0;
                q8Var2.requestLayout();
                r8 r8Var2 = q8Var2.J;
                r8Var2.L(r8Var2.getWidth(), r8Var2.getHeight());
                r8Var2.requestLayout();
                return;
            case 2:
                p8 p8Var = this.f5641b;
                p8Var.v.post(new o8(p8Var, 3));
                return;
            default:
                this.f5641b.v.f5806x = true;
                return;
        }
    }
}
