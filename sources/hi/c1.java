package hi;
public final class c1 implements Runnable {
    public final int f14317a;
    public final d1 f14318b;

    public c1(d1 d1Var, int i7) {
        this.f14317a = i7;
        this.f14318b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f14317a) {
            case 0:
                d1 d1Var = this.f14318b;
                if (d1Var.L > 0) {
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
                d1 d1Var2 = this.f14318b;
                d1Var2.focusToPoint((int) d1Var2.J, (int) d1Var2.K);
                return;
        }
    }
}
