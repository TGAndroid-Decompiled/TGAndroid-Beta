package bi;
public final class z3 implements Runnable {
    public final int f5144a;
    public final zh.h0 f5145b;

    public z3(zh.h0 h0Var, int i7) {
        this.f5144a = i7;
        this.f5145b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f5144a) {
            case 0:
                this.f5145b.dismiss();
                return;
            case 1:
                zh.h0 h0Var = this.f5145b;
                rh.h hVar = h0Var.n1;
                jh.f fVar = h0Var.f60359m1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.g0 g0Var = h0Var.f60370y1;
                if (g0Var != null) {
                    g0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.j6 j6Var = h0Var.f60364s1;
                if (j6Var != null) {
                    j6Var.setTranslationY(-hVar.d());
                }
                h0Var.I0();
                return;
            case 2:
                this.f5145b.f60370y1.performClick();
                return;
            default:
                this.f5145b.f60360o1.I0();
                return;
        }
    }
}
