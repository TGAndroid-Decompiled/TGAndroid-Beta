package ji;
public final class b1 implements Runnable {
    public final int f13144a;
    public final h1 f13145b;

    public b1(h1 h1Var, int i10) {
        this.f13144a = i10;
        this.f13145b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f13144a) {
            case 0:
                h1 h1Var = this.f13145b;
                m4 m4Var = h1Var.R;
                if (m4Var != null && h1Var.d != null) {
                    h1Var.S = true;
                    m4Var.b().setPressed(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((t2) h1Var.d).a(h1Var, h1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f13145b.n();
                return;
            default:
                this.f13145b.s();
                return;
        }
    }
}
