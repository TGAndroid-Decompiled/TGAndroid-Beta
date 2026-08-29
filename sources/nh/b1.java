package nh;
public final class b1 implements Runnable {
    public final int f17409a;
    public final c1 f17410b;

    public b1(c1 c1Var, int i10) {
        this.f17409a = i10;
        this.f17410b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f17409a) {
            case 0:
                c1 c1Var = this.f17410b;
                if (c1Var.G > 0) {
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
                c1 c1Var2 = this.f17410b;
                c1Var2.focusToPoint((int) c1Var2.E, (int) c1Var2.F);
                return;
        }
    }
}
