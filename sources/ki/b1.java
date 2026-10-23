package ki;
public final class b1 implements Runnable {
    public final int f15183a;
    public final h1 f15184b;

    public b1(h1 h1Var, int i10) {
        this.f15183a = i10;
        this.f15184b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f15183a) {
            case 0:
                h1 h1Var = this.f15184b;
                k4 k4Var = h1Var.W;
                if (k4Var != null && h1Var.d != null) {
                    h1Var.f15357a0 = true;
                    k4Var.b().setPressed(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((t2) h1Var.d).a(h1Var, h1Var.W, true);
                    return;
                }
                return;
            case 1:
                this.f15184b.n();
                return;
            default:
                this.f15184b.s();
                return;
        }
    }
}
