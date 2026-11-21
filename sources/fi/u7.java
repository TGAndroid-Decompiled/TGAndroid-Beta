package fi;
public final class u7 implements Runnable {
    public final int f12667a;
    public final v7 f12668b;

    public u7(v7 v7Var, int i7) {
        this.f12667a = i7;
        this.f12668b = v7Var;
    }

    @Override
    public final void run() {
        switch (this.f12667a) {
            case 0:
                w7 w7Var = this.f12668b.v;
                w7Var.f12749s = 0;
                w7Var.requestLayout();
                x7 x7Var = w7Var.K;
                x7Var.L(x7Var.getWidth(), x7Var.getHeight());
                x7Var.requestLayout();
                return;
            case 1:
                w7 w7Var2 = this.f12668b.v;
                w7Var2.f12749s = 0;
                w7Var2.requestLayout();
                x7 x7Var2 = w7Var2.K;
                x7Var2.L(x7Var2.getWidth(), x7Var2.getHeight());
                x7Var2.requestLayout();
                return;
            case 2:
                v7 v7Var = this.f12668b;
                v7Var.v.post(new u7(v7Var, 3));
                return;
            default:
                this.f12668b.v.f12752y = true;
                return;
        }
    }
}
