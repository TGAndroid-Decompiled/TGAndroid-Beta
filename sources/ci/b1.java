package ci;
public final class b1 implements Runnable {
    public final int f4746a;
    public final c1 f4747b;

    public b1(c1 c1Var, int i10) {
        this.f4746a = i10;
        this.f4747b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f4746a) {
            case 0:
                c1 c1Var = this.f4747b;
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
                c1 c1Var2 = this.f4747b;
                c1Var2.focusToPoint((int) c1Var2.I, (int) c1Var2.J);
                return;
        }
    }
}
