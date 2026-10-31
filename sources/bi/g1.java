package bi;
public final class g1 implements Runnable {
    public final int f3027a;
    public final n1 f3028b;

    public g1(n1 n1Var, int i10) {
        this.f3027a = i10;
        this.f3028b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f3027a) {
            case 0:
                n1 n1Var = this.f3028b;
                u4 u4Var = n1Var.C2;
                if (u4Var != null && n1Var.Z1 != null) {
                    n1Var.D2 = true;
                    u4Var.b().f18107a.m(false);
                    try {
                        n1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((a3) n1Var.Z1).a(n1Var, n1Var.C2, true);
                    return;
                }
                return;
            case 1:
                this.f3028b.J();
                return;
            default:
                this.f3028b.O();
                return;
        }
    }
}
