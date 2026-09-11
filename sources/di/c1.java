package di;
public final class c1 implements Runnable {
    public final int f6983a;
    public final d1 f6984b;

    public c1(d1 d1Var, int i10) {
        this.f6983a = i10;
        this.f6984b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f6983a) {
            case 0:
                d1 d1Var = this.f6984b;
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
                d1 d1Var2 = this.f6984b;
                d1Var2.focusToPoint((int) d1Var2.I, (int) d1Var2.J);
                return;
        }
    }
}
