package ki;
public final class b1 implements Runnable {
    public final int f15139a;
    public final h1 f15140b;

    public b1(h1 h1Var, int i10) {
        this.f15139a = i10;
        this.f15140b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f15139a) {
            case 0:
                h1 h1Var = this.f15140b;
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
                this.f15140b.n();
                return;
            default:
                this.f15140b.s();
                return;
        }
    }
}
