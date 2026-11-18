package bi;
public final class y0 implements Runnable {
    public final int f4246a;
    public final g1 f4247b;

    public y0(g1 g1Var, int i7) {
        this.f4246a = i7;
        this.f4247b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f4246a) {
            case 0:
                g1 g1Var = this.f4247b;
                rh.h hVar = g1Var.f3625r1;
                jh.f fVar = g1Var.f3624q1;
                if (fVar != null) {
                    fVar.d();
                }
                d1 d1Var = g1Var.C1;
                if (d1Var != null) {
                    d1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.n6 n6Var = g1Var.f3630w1;
                if (n6Var != null) {
                    n6Var.setTranslationY(-hVar.d());
                }
                g1Var.J0();
                return;
            case 1:
                this.f4247b.C1.performClick();
                return;
            case 2:
                this.f4247b.f3626s1.f1();
                return;
            default:
                this.f4247b.dismiss();
                return;
        }
    }
}
