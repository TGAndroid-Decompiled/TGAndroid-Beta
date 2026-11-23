package hi;
public final class b1 implements Runnable {
    public final int f14207a;
    public final c1 f14208b;

    public b1(c1 c1Var, int i7) {
        this.f14207a = i7;
        this.f14208b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f14207a) {
            case 0:
                c1 c1Var = this.f14208b;
                if (c1Var.L > 0) {
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
                c1 c1Var2 = this.f14208b;
                c1Var2.focusToPoint((int) c1Var2.J, (int) c1Var2.K);
                return;
        }
    }
}
