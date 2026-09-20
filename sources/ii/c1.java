package ii;
public final class c1 implements Runnable {
    public final int f11281a;
    public final i1 f11282b;

    public c1(i1 i1Var, int i10) {
        this.f11281a = i10;
        this.f11282b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f11281a) {
            case 0:
                i1 i1Var = this.f11282b;
                k4 k4Var = i1Var.R;
                if (k4Var != null && i1Var.d != null) {
                    i1Var.S = true;
                    k4Var.b().setPressed(false);
                    try {
                        i1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((t2) i1Var.d).a(i1Var, i1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f11282b.n();
                return;
            default:
                this.f11282b.s();
                return;
        }
    }
}
