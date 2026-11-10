package fi;
public final class a1 implements Runnable {
    public final int f11592a;
    public final b1 f11593b;

    public a1(b1 b1Var, int i7) {
        this.f11592a = i7;
        this.f11593b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f11592a) {
            case 0:
                b1 b1Var = this.f11593b;
                if (b1Var.K > 0) {
                    b1Var.dualToggleShape();
                    try {
                        b1Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                b1 b1Var2 = this.f11593b;
                b1Var2.focusToPoint((int) b1Var2.I, (int) b1Var2.J);
                return;
        }
    }
}
