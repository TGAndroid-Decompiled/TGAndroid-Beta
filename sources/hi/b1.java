package hi;
public final class b1 implements Runnable {
    public final int f13918a;
    public final c1 f13919b;

    public b1(c1 c1Var, int i7) {
        this.f13918a = i7;
        this.f13919b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f13918a) {
            case 0:
                c1 c1Var = this.f13919b;
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
                c1 c1Var2 = this.f13919b;
                c1Var2.focusToPoint((int) c1Var2.J, (int) c1Var2.K);
                return;
        }
    }
}
