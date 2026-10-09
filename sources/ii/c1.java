package ii;
public final class c1 implements Runnable {
    public final int f12303a;
    public final i1 f12304b;

    public c1(i1 i1Var, int i10) {
        this.f12303a = i10;
        this.f12304b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f12303a) {
            case 0:
                i1 i1Var = this.f12304b;
                m4 m4Var = i1Var.R;
                if (m4Var != null && i1Var.d != null) {
                    i1Var.S = true;
                    m4Var.b().setPressed(false);
                    try {
                        i1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((u2) i1Var.d).a(i1Var, i1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f12304b.n();
                return;
            default:
                this.f12304b.s();
                return;
        }
    }
}
