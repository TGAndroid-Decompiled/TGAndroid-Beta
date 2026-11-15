package bi;
public final class y0 implements Runnable {
    public final int f4006a;
    public final f1 f4007b;

    public y0(f1 f1Var, int i7) {
        this.f4006a = i7;
        this.f4007b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f4006a) {
            case 0:
                f1 f1Var = this.f4007b;
                rh.h hVar = f1Var.f3500r1;
                jh.f fVar = f1Var.f3499q1;
                if (fVar != null) {
                    fVar.d();
                }
                d1 d1Var = f1Var.C1;
                if (d1Var != null) {
                    d1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.h6 h6Var = f1Var.f3505w1;
                if (h6Var != null) {
                    h6Var.setTranslationY(-hVar.d());
                }
                f1Var.I0();
                return;
            case 1:
                this.f4007b.C1.performClick();
                return;
            case 2:
                this.f4007b.f3501s1.X0();
                return;
            default:
                this.f4007b.dismiss();
                return;
        }
    }
}
