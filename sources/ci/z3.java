package ci;
public final class z3 implements Runnable {
    public final int f6174a;
    public final g4 f6175b;

    public z3(g4 g4Var, int i10) {
        this.f6174a = i10;
        this.f6175b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f6174a) {
            case 0:
                ((q9) this.f6175b.f5357l.Q1).g(false);
                return;
            case 1:
                p4 p4Var = this.f6175b.f5357l;
                i4 i4Var = p4Var.Q1;
                if (i4Var != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Z0 = false;
                    z9Var.P();
                }
                p4Var.f1(false);
                p4Var.f5671h3 = true;
                p4Var.K0.D(true);
                return;
            case 2:
                p4 p4Var2 = this.f6175b.f5357l;
                p4Var2.U3 = true;
                p4Var2.setActive(false);
                return;
            default:
                p4 p4Var3 = this.f6175b.f5357l;
                p4Var3.U3 = true;
                p4Var3.setActive(false);
                return;
        }
    }
}
