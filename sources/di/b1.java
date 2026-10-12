package di;
public final class b1 implements Runnable {
    public final int f6648a;
    public final c1 f6649b;

    public b1(c1 c1Var, int i10) {
        this.f6648a = i10;
        this.f6649b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f6648a) {
            case 0:
                c1 c1Var = this.f6649b;
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
                c1 c1Var2 = this.f6649b;
                c1Var2.focusToPoint((int) c1Var2.I, (int) c1Var2.J);
                return;
        }
    }
}
