package jh;

public final class r3 implements Runnable {

    public final int f13899a;

    public final x3 f13900b;

    public r3(x3 x3Var, int i10) {
        this.f13899a = i10;
        this.f13900b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f13899a) {
            case 0:
                ((z8) this.f13900b.f14128l.M1).g(false);
                break;
            case 1:
                e4 e4Var = this.f13900b.f14128l;
                y3 y3Var = e4Var.M1;
                if (y3Var != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.V0 = false;
                    i9Var.P();
                }
                e4Var.f1(false);
                e4Var.f13228d3 = true;
                e4Var.G0.D(true);
                break;
            case 2:
                e4 e4Var2 = this.f13900b.f14128l;
                e4Var2.Q3 = true;
                e4Var2.setActive(false);
                break;
            default:
                e4 e4Var3 = this.f13900b.f14128l;
                e4Var3.Q3 = true;
                e4Var3.setActive(false);
                break;
        }
    }
}
