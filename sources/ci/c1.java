package ci;
public final class c1 implements Runnable {
    public final int f4430a;
    public final d1 f4431b;

    public c1(d1 d1Var, int i10) {
        this.f4430a = i10;
        this.f4431b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f4430a) {
            case 0:
                d1 d1Var = this.f4431b;
                if (d1Var.K > 0) {
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
                d1 d1Var2 = this.f4431b;
                d1Var2.focusToPoint((int) d1Var2.I, (int) d1Var2.J);
                return;
        }
    }
}
