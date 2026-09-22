package ii;
public final class c1 implements Runnable {
    public final int f11279a;
    public final i1 f11280b;

    public c1(i1 i1Var, int i10) {
        this.f11279a = i10;
        this.f11280b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f11279a) {
            case 0:
                i1 i1Var = this.f11280b;
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
                this.f11280b.n();
                return;
            default:
                this.f11280b.s();
                return;
        }
    }
}
