package oi;
public final class y0 implements Runnable {
    public final int f22533a;
    public final f1 f22534b;

    public y0(f1 f1Var, int i7) {
        this.f22533a = i7;
        this.f22534b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f22533a) {
            case 0:
                f1 f1Var = this.f22534b;
                i4 i4Var = f1Var.L2;
                if (i4Var != null && f1Var.f22098f2 != null) {
                    f1Var.M2 = true;
                    i4Var.b().f23447a.m(false);
                    try {
                        f1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((s2) f1Var.f22098f2).a(f1Var, f1Var.L2, true);
                    return;
                }
                return;
            case 1:
                this.f22534b.K();
                return;
            default:
                this.f22534b.P();
                return;
        }
    }
}
