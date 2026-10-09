package ai;
public final class n5 implements Runnable {
    public final int f1464a;
    public final w5 f1465b;

    public n5(w5 w5Var, int i10) {
        this.f1464a = i10;
        this.f1465b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f1464a) {
            case 0:
                ((bc) this.f1465b.f1860l.Q1).g(false);
                return;
            case 1:
                f6 f6Var = this.f1465b.f1860l;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    kc kcVar = ((bc) y5Var).d;
                    kcVar.Z0 = false;
                    kcVar.P();
                }
                f6Var.f1(false);
                f6Var.f974h3 = true;
                f6Var.K0.D(true);
                return;
            case 2:
                f6 f6Var2 = this.f1465b.f1860l;
                f6Var2.U3 = true;
                f6Var2.setActive(false);
                return;
            default:
                f6 f6Var3 = this.f1465b.f1860l;
                f6Var3.U3 = true;
                f6Var3.setActive(false);
                return;
        }
    }
}
