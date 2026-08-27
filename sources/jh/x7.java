package jh;

public final class x7 implements Runnable {

    public final int f14141a;

    public final y7 f14142b;

    public x7(y7 y7Var, int i10) {
        this.f14141a = i10;
        this.f14142b = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f14141a) {
            case 0:
                z7 z7Var = this.f14142b.v;
                z7Var.f14199s = 0;
                z7Var.requestLayout();
                a8 a8Var = z7Var.F;
                a8Var.L(a8Var.getWidth(), a8Var.getHeight());
                a8Var.requestLayout();
                break;
            case 1:
                z7 z7Var2 = this.f14142b.v;
                z7Var2.f14199s = 0;
                z7Var2.requestLayout();
                a8 a8Var2 = z7Var2.F;
                a8Var2.L(a8Var2.getWidth(), a8Var2.getHeight());
                a8Var2.requestLayout();
                break;
            case 2:
                y7 y7Var = this.f14142b;
                y7Var.v.post(new x7(y7Var, 3));
                break;
            default:
                this.f14142b.v.f14201x = true;
                break;
        }
    }
}
