package hi;
public final class e1 implements Runnable {
    public final int f9535a;
    public final k1 f9536b;

    public e1(k1 k1Var, int i10) {
        this.f9535a = i10;
        this.f9536b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f9535a) {
            case 0:
                k1 k1Var = this.f9536b;
                n4 n4Var = k1Var.R;
                if (n4Var != null && k1Var.d != null) {
                    k1Var.S = true;
                    n4Var.b().setPressed(false);
                    try {
                        k1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((w2) k1Var.d).a(k1Var, k1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f9536b.n();
                return;
            default:
                this.f9536b.s();
                return;
        }
    }
}
