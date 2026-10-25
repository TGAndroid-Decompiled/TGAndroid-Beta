package di;
public final class m8 implements Runnable {
    public final int f8794a;
    public final n8 f8795b;

    public m8(n8 n8Var, int i10) {
        this.f8794a = i10;
        this.f8795b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f8794a) {
            case 0:
                o8 o8Var = this.f8795b.v;
                o8Var.f8889s = 0;
                o8Var.requestLayout();
                p8 p8Var = o8Var.J;
                p8Var.L(p8Var.getWidth(), p8Var.getHeight());
                p8Var.requestLayout();
                return;
            case 1:
                o8 o8Var2 = this.f8795b.v;
                o8Var2.f8889s = 0;
                o8Var2.requestLayout();
                p8 p8Var2 = o8Var2.J;
                p8Var2.L(p8Var2.getWidth(), p8Var2.getHeight());
                p8Var2.requestLayout();
                return;
            case 2:
                n8 n8Var = this.f8795b;
                n8Var.v.post(new m8(n8Var, 3));
                return;
            default:
                this.f8795b.v.f8891x = true;
                return;
        }
    }
}
