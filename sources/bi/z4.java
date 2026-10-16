package bi;
public final class z4 implements Runnable {
    public final int f4064a;
    public final h5 f4065b;

    public z4(h5 h5Var, int i10) {
        this.f4064a = i10;
        this.f4065b = h5Var;
    }

    @Override
    public final void run() {
        switch (this.f4064a) {
            case 0:
                ((jb) this.f4065b.f3126l.Q1).g(false);
                return;
            case 1:
                q5 q5Var = this.f4065b.f3126l;
                j5 j5Var = q5Var.Q1;
                if (j5Var != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Z0 = false;
                    sbVar.P();
                }
                q5Var.f1(false);
                q5Var.f3534h3 = true;
                q5Var.K0.D(true);
                return;
            case 2:
                q5 q5Var2 = this.f4065b.f3126l;
                q5Var2.U3 = true;
                q5Var2.setActive(false);
                return;
            default:
                q5 q5Var3 = this.f4065b.f3126l;
                q5Var3.U3 = true;
                q5Var3.setActive(false);
                return;
        }
    }
}
