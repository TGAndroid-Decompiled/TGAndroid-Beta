package lh;
public final class p3 implements Runnable {
    public final int f16088a;
    public final w3 f16089b;

    public p3(w3 w3Var, int i10) {
        this.f16088a = i10;
        this.f16089b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f16088a) {
            case 0:
                ((z8) this.f16089b.f16362l.M1).g(false);
                return;
            case 1:
                d4 d4Var = this.f16089b.f16362l;
                x3 x3Var = d4Var.M1;
                if (x3Var != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.V0 = false;
                    i9Var.P();
                }
                d4Var.f1(false);
                d4Var.f15477d3 = true;
                d4Var.G0.D(true);
                return;
            case 2:
                d4 d4Var2 = this.f16089b.f16362l;
                d4Var2.Q3 = true;
                d4Var2.setActive(false);
                return;
            default:
                d4 d4Var3 = this.f16089b.f16362l;
                d4Var3.Q3 = true;
                d4Var3.setActive(false);
                return;
        }
    }
}
