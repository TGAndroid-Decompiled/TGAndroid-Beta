package ji;
public final class b1 implements Runnable {
    public final int f13809a;
    public final h1 f13810b;

    public b1(h1 h1Var, int i10) {
        this.f13809a = i10;
        this.f13810b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f13809a) {
            case 0:
                h1 h1Var = this.f13810b;
                k4 k4Var = h1Var.R;
                if (k4Var != null && h1Var.d != null) {
                    h1Var.S = true;
                    k4Var.b().setPressed(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((s2) h1Var.d).a(h1Var, h1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f13810b.n();
                return;
            default:
                this.f13810b.s();
                return;
        }
    }
}
