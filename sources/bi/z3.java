package bi;
public final class z3 implements Runnable {
    public final int f5149a;
    public final zh.h0 f5150b;

    public z3(zh.h0 h0Var, int i7) {
        this.f5149a = i7;
        this.f5150b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f5149a) {
            case 0:
                this.f5150b.dismiss();
                return;
            case 1:
                zh.h0 h0Var = this.f5150b;
                rh.h hVar = h0Var.f60364q1;
                jh.f fVar = h0Var.f60363p1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.g0 g0Var = h0Var.B1;
                if (g0Var != null) {
                    g0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.i6 i6Var = h0Var.f60369v1;
                if (i6Var != null) {
                    i6Var.setTranslationY(-hVar.d());
                }
                h0Var.I0();
                return;
            case 2:
                this.f5150b.B1.performClick();
                return;
            default:
                this.f5150b.f60365r1.I0();
                return;
        }
    }
}
