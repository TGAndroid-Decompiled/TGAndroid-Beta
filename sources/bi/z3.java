package bi;
public final class z3 implements Runnable {
    public final int f5146a;
    public final zh.i0 f5147b;

    public z3(zh.i0 i0Var, int i7) {
        this.f5146a = i7;
        this.f5147b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f5146a) {
            case 0:
                this.f5147b.dismiss();
                return;
            case 1:
                zh.i0 i0Var = this.f5147b;
                rh.h hVar = i0Var.n1;
                jh.f fVar = i0Var.f60266m1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.h0 h0Var = i0Var.f60277y1;
                if (h0Var != null) {
                    h0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.j6 j6Var = i0Var.f60271s1;
                if (j6Var != null) {
                    j6Var.setTranslationY(-hVar.d());
                }
                i0Var.I0();
                return;
            case 2:
                this.f5147b.f60277y1.performClick();
                return;
            default:
                this.f5147b.f60267o1.I0();
                return;
        }
    }
}
