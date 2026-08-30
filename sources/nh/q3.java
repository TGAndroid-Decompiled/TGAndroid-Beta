package nh;
public final class q3 implements Runnable {
    public final int f15799a;
    public final w3 f15800b;

    public q3(w3 w3Var, int i10) {
        this.f15799a = i10;
        this.f15800b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f15799a) {
            case 0:
                ((z8) this.f15800b.f16027l.N1).g(false);
                return;
            case 1:
                d4 d4Var = this.f15800b.f16027l;
                x3 x3Var = d4Var.N1;
                if (x3Var != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.W0 = false;
                    i9Var.P();
                }
                d4Var.f1(false);
                d4Var.f15195e3 = true;
                d4Var.H0.D(true);
                return;
            case 2:
                d4 d4Var2 = this.f15800b.f16027l;
                d4Var2.R3 = true;
                d4Var2.setActive(false);
                return;
            default:
                d4 d4Var3 = this.f15800b.f16027l;
                d4Var3.R3 = true;
                d4Var3.setActive(false);
                return;
        }
    }
}
