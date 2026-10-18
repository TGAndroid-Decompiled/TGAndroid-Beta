package ci;
public final class a4 implements Runnable {
    public final int f5142a;
    public final h4 f5143b;

    public a4(h4 h4Var, int i10) {
        this.f5142a = i10;
        this.f5143b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f5142a) {
            case 0:
                ((r9) this.f5143b.f5464l.Q1).g(false);
                return;
            case 1:
                q4 q4Var = this.f5143b.f5464l;
                j4 j4Var = q4Var.Q1;
                if (j4Var != null) {
                    aa aaVar = ((r9) j4Var).d;
                    aaVar.Z0 = false;
                    aaVar.P();
                }
                q4Var.f1(false);
                q4Var.f5791h3 = true;
                q4Var.K0.D(true);
                return;
            case 2:
                q4 q4Var2 = this.f5143b.f5464l;
                q4Var2.U3 = true;
                q4Var2.setActive(false);
                return;
            default:
                q4 q4Var3 = this.f5143b.f5464l;
                q4Var3.U3 = true;
                q4Var3.setActive(false);
                return;
        }
    }
}
