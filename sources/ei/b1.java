package ei;
public final class b1 implements Runnable {
    public final int f8770a;
    public final c1 f8771b;

    public b1(c1 c1Var, int i10) {
        this.f8770a = i10;
        this.f8771b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f8770a) {
            case 0:
                c1 c1Var = this.f8771b;
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
                c1 c1Var2 = this.f8771b;
                c1Var2.focusToPoint((int) c1Var2.I, (int) c1Var2.J);
                return;
        }
    }
}
