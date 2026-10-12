package ai;
public final class n5 implements Runnable {
    public final int f1462a;
    public final w5 f1463b;

    public n5(w5 w5Var, int i10) {
        this.f1462a = i10;
        this.f1463b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f1462a) {
            case 0:
                ((bc) this.f1463b.f1858l.Q1).g(false);
                return;
            case 1:
                f6 f6Var = this.f1463b.f1858l;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    kc kcVar = ((bc) y5Var).d;
                    kcVar.Z0 = false;
                    kcVar.P();
                }
                f6Var.f1(false);
                f6Var.f972h3 = true;
                f6Var.K0.D(true);
                return;
            case 2:
                f6 f6Var2 = this.f1463b.f1858l;
                f6Var2.U3 = true;
                f6Var2.setActive(false);
                return;
            default:
                f6 f6Var3 = this.f1463b.f1858l;
                f6Var3.U3 = true;
                f6Var3.setActive(false);
                return;
        }
    }
}
