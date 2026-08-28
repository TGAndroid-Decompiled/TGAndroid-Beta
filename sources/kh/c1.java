package kh;
public final class c1 implements Runnable {
    public final int f15028a;
    public final d1 f15029b;

    public c1(d1 d1Var, int i9) {
        this.f15028a = i9;
        this.f15029b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f15028a) {
            case 0:
                d1 d1Var = this.f15029b;
                if (d1Var.G > 0) {
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
                d1 d1Var2 = this.f15029b;
                d1Var2.focusToPoint((int) d1Var2.E, (int) d1Var2.F);
                return;
        }
    }
}
