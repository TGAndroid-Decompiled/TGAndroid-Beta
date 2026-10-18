package ei;
public final class b1 implements Runnable {
    public final int f8768a;
    public final c1 f8769b;

    public b1(c1 c1Var, int i10) {
        this.f8768a = i10;
        this.f8769b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f8768a) {
            case 0:
                c1 c1Var = this.f8769b;
                if (c1Var.K > 0) {
                    c1Var.dualToggleShape();
                    try {
                        c1Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                c1 c1Var2 = this.f8769b;
                c1Var2.focusToPoint((int) c1Var2.I, (int) c1Var2.J);
                return;
        }
    }
}
