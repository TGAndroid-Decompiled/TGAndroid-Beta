package di;
public final class m8 implements Runnable {
    public final int f8793a;
    public final n8 f8794b;

    public m8(n8 n8Var, int i10) {
        this.f8793a = i10;
        this.f8794b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f8793a) {
            case 0:
                o8 o8Var = this.f8794b.v;
                o8Var.f8888s = 0;
                o8Var.requestLayout();
                p8 p8Var = o8Var.J;
                p8Var.L(p8Var.getWidth(), p8Var.getHeight());
                p8Var.requestLayout();
                return;
            case 1:
                o8 o8Var2 = this.f8794b.v;
                o8Var2.f8888s = 0;
                o8Var2.requestLayout();
                p8 p8Var2 = o8Var2.J;
                p8Var2.L(p8Var2.getWidth(), p8Var2.getHeight());
                p8Var2.requestLayout();
                return;
            case 2:
                n8 n8Var = this.f8794b;
                n8Var.v.post(new m8(n8Var, 3));
                return;
            default:
                this.f8794b.v.f8890x = true;
                return;
        }
    }
}
