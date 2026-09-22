package ai;
public final class n5 implements Runnable {
    public final int f1285a;
    public final w5 f1286b;

    public n5(w5 w5Var, int i10) {
        this.f1285a = i10;
        this.f1286b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f1285a) {
            case 0:
                ((ac) this.f1286b.f1655l.Q1).g(false);
                return;
            case 1:
                f6 f6Var = this.f1286b.f1655l;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Z0 = false;
                    jcVar.P();
                }
                f6Var.f1(false);
                f6Var.f819h3 = true;
                f6Var.K0.D(true);
                return;
            case 2:
                f6 f6Var2 = this.f1286b.f1655l;
                f6Var2.U3 = true;
                f6Var2.setActive(false);
                return;
            default:
                f6 f6Var3 = this.f1286b.f1655l;
                f6Var3.U3 = true;
                f6Var3.setActive(false);
                return;
        }
    }
}
