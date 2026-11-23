package hi;
public final class k1 implements Runnable {
    public final int f14767a;
    public final l1 f14768b;

    public k1(l1 l1Var, int i7) {
        this.f14767a = i7;
        this.f14768b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f14767a) {
            case 0:
                l1 l1Var = this.f14768b;
                if (l1Var.L > 0) {
                    l1Var.dualToggleShape();
                    try {
                        l1Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                l1 l1Var2 = this.f14768b;
                l1Var2.focusToPoint((int) l1Var2.J, (int) l1Var2.K);
                return;
        }
    }
}
