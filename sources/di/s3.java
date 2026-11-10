package di;
public final class s3 implements Runnable {
    public final int f9731a;
    public final a4 f9732b;

    public s3(a4 a4Var, int i7) {
        this.f9731a = i7;
        this.f9732b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f9731a) {
            case 0:
                ((h9) this.f9732b.f8813x.f9258z1).g(false);
                return;
            case 1:
                j4 j4Var = this.f9732b.f8813x;
                c4 c4Var = j4Var.f9258z1;
                if (c4Var != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.Y0 = false;
                    q9Var.V();
                }
                j4Var.d1(false);
                j4Var.Q2 = true;
                j4Var.f9233t0.E(true);
                return;
            case 2:
                j4 j4Var2 = this.f9732b.f8813x;
                j4Var2.D3 = true;
                j4Var2.setActive(false);
                return;
            default:
                j4 j4Var3 = this.f9732b.f8813x;
                j4Var3.D3 = true;
                j4Var3.setActive(false);
                return;
        }
    }
}
