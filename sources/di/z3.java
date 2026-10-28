package di;
public final class z3 implements Runnable {
    public final int f9482a;
    public final h4 f9483b;

    public z3(h4 h4Var, int i10) {
        this.f9482a = i10;
        this.f9483b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f9482a) {
            case 0:
                ((p9) this.f9483b.f8625l.F1).g(false);
                return;
            case 1:
                q4 q4Var = this.f9483b.f8625l;
                j4 j4Var = q4Var.F1;
                if (j4Var != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Z0 = false;
                    y9Var.Q();
                }
                q4Var.d1(false);
                q4Var.W2 = true;
                q4Var.f9049z0.E(true);
                return;
            case 2:
                q4 q4Var2 = this.f9483b.f8625l;
                q4Var2.J3 = true;
                q4Var2.setActive(false);
                return;
            default:
                q4 q4Var3 = this.f9483b.f8625l;
                q4Var3.J3 = true;
                q4Var3.setActive(false);
                return;
        }
    }
}
