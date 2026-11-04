package gi;
public final class a1 implements Runnable {
    public final int f12382a;
    public final b1 f12383b;

    public a1(b1 b1Var, int i3) {
        this.f12382a = i3;
        this.f12383b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f12382a) {
            case 0:
                b1 b1Var = this.f12383b;
                if (b1Var.L > 0) {
                    b1Var.dualToggleShape();
                    try {
                        b1Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                b1 b1Var2 = this.f12383b;
                b1Var2.focusToPoint((int) b1Var2.J, (int) b1Var2.K);
                return;
        }
    }
}
