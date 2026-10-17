package ci;
public final class a4 implements Runnable {
    public final int f5141a;
    public final h4 f5142b;

    public a4(h4 h4Var, int i10) {
        this.f5141a = i10;
        this.f5142b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f5141a) {
            case 0:
                ((r9) this.f5142b.f5463l.Q1).g(false);
                return;
            case 1:
                q4 q4Var = this.f5142b.f5463l;
                j4 j4Var = q4Var.Q1;
                if (j4Var != null) {
                    aa aaVar = ((r9) j4Var).d;
                    aaVar.Z0 = false;
                    aaVar.P();
                }
                q4Var.f1(false);
                q4Var.f5790h3 = true;
                q4Var.K0.D(true);
                return;
            case 2:
                q4 q4Var2 = this.f5142b.f5463l;
                q4Var2.U3 = true;
                q4Var2.setActive(false);
                return;
            default:
                q4 q4Var3 = this.f5142b.f5463l;
                q4Var3.U3 = true;
                q4Var3.setActive(false);
                return;
        }
    }
}
