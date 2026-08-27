package lh;

public final class b1 implements Runnable {

    public final int f15673a;

    public final c1 f15674b;

    public b1(c1 c1Var, int i10) {
        this.f15673a = i10;
        this.f15674b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f15673a) {
            case 0:
                c1 c1Var = this.f15674b;
                if (c1Var.G > 0) {
                    c1Var.dualToggleShape();
                    try {
                        c1Var.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                c1 c1Var2 = this.f15674b;
                c1Var2.focusToPoint((int) c1Var2.E, (int) c1Var2.F);
                break;
        }
    }
}
