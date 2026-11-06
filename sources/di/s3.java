package di;
public final class s3 implements Runnable {
    public final int f9748a;
    public final z3 f9749b;

    public s3(z3 z3Var, int i7) {
        this.f9748a = i7;
        this.f9749b = z3Var;
    }

    @Override
    public final void run() {
        switch (this.f9748a) {
            case 0:
                ((g9) this.f9749b.f10013x.f9221z1).g(false);
                return;
            case 1:
                i4 i4Var = this.f9749b.f10013x;
                b4 b4Var = i4Var.f9221z1;
                if (b4Var != null) {
                    p9 p9Var = ((g9) b4Var).d;
                    p9Var.Y0 = false;
                    p9Var.V();
                }
                i4Var.d1(false);
                i4Var.Q2 = true;
                i4Var.f9196t0.E(true);
                return;
            case 2:
                i4 i4Var2 = this.f9749b.f10013x;
                i4Var2.D3 = true;
                i4Var2.setActive(false);
                return;
            default:
                i4 i4Var3 = this.f9749b.f10013x;
                i4Var3.D3 = true;
                i4Var3.setActive(false);
                return;
        }
    }
}
