package bi;
public final class x4 implements Runnable {
    public final int f3979a;
    public final f5 f3980b;

    public x4(f5 f5Var, int i10) {
        this.f3979a = i10;
        this.f3980b = f5Var;
    }

    @Override
    public final void run() {
        switch (this.f3979a) {
            case 0:
                ((gb) this.f3980b.f2972l.Q1).g(false);
                return;
            case 1:
                o5 o5Var = this.f3980b.f2972l;
                h5 h5Var = o5Var.Q1;
                if (h5Var != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Z0 = false;
                    pbVar.P();
                }
                o5Var.f1(false);
                o5Var.f3428h3 = true;
                o5Var.K0.D(true);
                return;
            case 2:
                o5 o5Var2 = this.f3980b.f2972l;
                o5Var2.U3 = true;
                o5Var2.setActive(false);
                return;
            default:
                o5 o5Var3 = this.f3980b.f2972l;
                o5Var3.U3 = true;
                o5Var3.setActive(false);
                return;
        }
    }
}
