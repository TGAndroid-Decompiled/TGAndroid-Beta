package bi;
public final class z3 implements Runnable {
    public final int f5146a;
    public final zh.h0 f5147b;

    public z3(zh.h0 h0Var, int i7) {
        this.f5146a = i7;
        this.f5147b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f5146a) {
            case 0:
                this.f5147b.dismiss();
                return;
            case 1:
                zh.h0 h0Var = this.f5147b;
                rh.h hVar = h0Var.n1;
                jh.f fVar = h0Var.f60349m1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.g0 g0Var = h0Var.f60360y1;
                if (g0Var != null) {
                    g0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.j6 j6Var = h0Var.f60354s1;
                if (j6Var != null) {
                    j6Var.setTranslationY(-hVar.d());
                }
                h0Var.I0();
                return;
            case 2:
                this.f5147b.f60360y1.performClick();
                return;
            default:
                this.f5147b.f60350o1.I0();
                return;
        }
    }
}
