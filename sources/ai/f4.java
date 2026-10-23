package ai;
public final class f4 implements Runnable {
    public final int f1258a;
    public final yh.i0 f1259b;

    public f4(yh.i0 i0Var, int i10) {
        this.f1258a = i10;
        this.f1259b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f1258a) {
            case 0:
                this.f1259b.dismiss();
                return;
            case 1:
                yh.i0 i0Var = this.f1259b;
                qh.i iVar = i0Var.h;
                ih.f fVar = i0Var.f50751f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = i0Var.f50755w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                i0Var.r();
                return;
            case 2:
                this.f1259b.H.performClick();
                return;
            default:
                this.f1259b.f50752n.G0();
                return;
        }
    }
}
