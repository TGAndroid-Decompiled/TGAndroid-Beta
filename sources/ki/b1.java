package ki;
public final class b1 implements Runnable {
    public final int f15138a;
    public final h1 f15139b;

    public b1(h1 h1Var, int i10) {
        this.f15138a = i10;
        this.f15139b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f15138a) {
            case 0:
                h1 h1Var = this.f15139b;
                k4 k4Var = h1Var.R;
                if (k4Var != null && h1Var.d != null) {
                    h1Var.S = true;
                    k4Var.b().setPressed(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((t2) h1Var.d).a(h1Var, h1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f15139b.n();
                return;
            default:
                this.f15139b.s();
                return;
        }
    }
}
