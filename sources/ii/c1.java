package ii;
public final class c1 implements Runnable {
    public final int f11265a;
    public final i1 f11266b;

    public c1(i1 i1Var, int i10) {
        this.f11265a = i10;
        this.f11266b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f11265a) {
            case 0:
                i1 i1Var = this.f11266b;
                l4 l4Var = i1Var.R;
                if (l4Var != null && i1Var.d != null) {
                    i1Var.S = true;
                    l4Var.b().setPressed(false);
                    try {
                        i1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((u2) i1Var.d).a(i1Var, i1Var.R, true);
                    return;
                }
                return;
            case 1:
                this.f11266b.n();
                return;
            default:
                this.f11266b.s();
                return;
        }
    }
}
