package bi;
public final class x4 implements Runnable {
    public final int f4006a;
    public final f5 f4007b;

    public x4(f5 f5Var, int i10) {
        this.f4006a = i10;
        this.f4007b = f5Var;
    }

    @Override
    public final void run() {
        switch (this.f4006a) {
            case 0:
                ((gb) this.f4007b.f2999l.Q1).g(false);
                return;
            case 1:
                o5 o5Var = this.f4007b.f2999l;
                h5 h5Var = o5Var.Q1;
                if (h5Var != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Z0 = false;
                    pbVar.P();
                }
                o5Var.f1(false);
                o5Var.f3455h3 = true;
                o5Var.K0.D(true);
                return;
            case 2:
                o5 o5Var2 = this.f4007b.f2999l;
                o5Var2.U3 = true;
                o5Var2.setActive(false);
                return;
            default:
                o5 o5Var3 = this.f4007b.f2999l;
                o5Var3.U3 = true;
                o5Var3.setActive(false);
                return;
        }
    }
}
