package oh;
public final class r3 implements Runnable {
    public final int f17683a;
    public final y3 f17684b;

    public r3(y3 y3Var, int i10) {
        this.f17683a = i10;
        this.f17684b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f17683a) {
            case 0:
                ((z8) this.f17684b.f17950l.N1).g(false);
                return;
            case 1:
                f4 f4Var = this.f17684b.f17950l;
                z3 z3Var = f4Var.N1;
                if (z3Var != null) {
                    i9 i9Var = ((z8) z3Var).d;
                    i9Var.W0 = false;
                    i9Var.P();
                }
                f4Var.f1(false);
                f4Var.f17065e3 = true;
                f4Var.H0.D(true);
                return;
            case 2:
                f4 f4Var2 = this.f17684b.f17950l;
                f4Var2.R3 = true;
                f4Var2.setActive(false);
                return;
            default:
                f4 f4Var3 = this.f17684b.f17950l;
                f4Var3.R3 = true;
                f4Var3.setActive(false);
                return;
        }
    }
}
