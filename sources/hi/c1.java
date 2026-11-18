package hi;
public final class c1 implements Runnable {
    public final int f14302a;
    public final d1 f14303b;

    public c1(d1 d1Var, int i7) {
        this.f14302a = i7;
        this.f14303b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f14302a) {
            case 0:
                d1 d1Var = this.f14303b;
                if (d1Var.L > 0) {
                    d1Var.dualToggleShape();
                    try {
                        d1Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                d1 d1Var2 = this.f14303b;
                d1Var2.focusToPoint((int) d1Var2.J, (int) d1Var2.K);
                return;
        }
    }
}
