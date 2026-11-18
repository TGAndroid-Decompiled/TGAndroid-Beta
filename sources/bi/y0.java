package bi;
public final class y0 implements Runnable {
    public final int f4214a;
    public final g1 f4215b;

    public y0(g1 g1Var, int i7) {
        this.f4214a = i7;
        this.f4215b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f4214a) {
            case 0:
                g1 g1Var = this.f4215b;
                rh.h hVar = g1Var.f3594r1;
                jh.f fVar = g1Var.f3593q1;
                if (fVar != null) {
                    fVar.d();
                }
                d1 d1Var = g1Var.C1;
                if (d1Var != null) {
                    d1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.n6 n6Var = g1Var.f3599w1;
                if (n6Var != null) {
                    n6Var.setTranslationY(-hVar.d());
                }
                g1Var.J0();
                return;
            case 1:
                this.f4215b.C1.performClick();
                return;
            case 2:
                this.f4215b.f3595s1.f1();
                return;
            default:
                this.f4215b.dismiss();
                return;
        }
    }
}
