package ai;
public final class e4 implements Runnable {
    public final int f1208a;
    public final yh.i0 f1209b;

    public e4(yh.i0 i0Var, int i10) {
        this.f1208a = i10;
        this.f1209b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f1208a) {
            case 0:
                this.f1209b.dismiss();
                return;
            case 1:
                yh.i0 i0Var = this.f1209b;
                qh.i iVar = i0Var.h;
                ih.f fVar = i0Var.f50289f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = i0Var.f50293w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                i0Var.p();
                return;
            default:
                this.f1209b.H.performClick();
                return;
        }
    }
}
