package bi;
public final class h1 implements Runnable {
    public final int f2777a;
    public final i1 f2778b;

    public h1(i1 i1Var, int i10) {
        this.f2777a = i10;
        this.f2778b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f2777a) {
            case 0:
                i1 i1Var = this.f2778b;
                if (i1Var.K > 0) {
                    i1Var.dualToggleShape();
                    try {
                        i1Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                i1 i1Var2 = this.f2778b;
                i1Var2.focusToPoint((int) i1Var2.I, (int) i1Var2.J);
                return;
        }
    }
}
