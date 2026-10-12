package ci;
public final class b1 implements Runnable {
    public final int f4744a;
    public final c1 f4745b;

    public b1(c1 c1Var, int i10) {
        this.f4744a = i10;
        this.f4745b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f4744a) {
            case 0:
                c1 c1Var = this.f4745b;
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
                c1 c1Var2 = this.f4745b;
                c1Var2.focusToPoint((int) c1Var2.I, (int) c1Var2.J);
                return;
        }
    }
}
