package ci;
public final class p8 implements Runnable {
    public final int f5736a;
    public final q8 f5737b;

    public p8(q8 q8Var, int i10) {
        this.f5736a = i10;
        this.f5737b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f5736a) {
            case 0:
                r8 r8Var = this.f5737b.v;
                r8Var.f5936s = 0;
                r8Var.requestLayout();
                s8 s8Var = r8Var.J;
                s8Var.L(s8Var.getWidth(), s8Var.getHeight());
                s8Var.requestLayout();
                return;
            case 1:
                r8 r8Var2 = this.f5737b.v;
                r8Var2.f5936s = 0;
                r8Var2.requestLayout();
                s8 s8Var2 = r8Var2.J;
                s8Var2.L(s8Var2.getWidth(), s8Var2.getHeight());
                s8Var2.requestLayout();
                return;
            case 2:
                q8 q8Var = this.f5737b;
                q8Var.v.post(new p8(q8Var, 3));
                return;
            default:
                this.f5737b.v.f5938x = true;
                return;
        }
    }
}
