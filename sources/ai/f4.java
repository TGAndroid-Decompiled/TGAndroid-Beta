package ai;
public final class f4 implements Runnable {
    public final int f1255a;
    public final yh.i0 f1256b;

    public f4(yh.i0 i0Var, int i10) {
        this.f1255a = i10;
        this.f1256b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f1255a) {
            case 0:
                this.f1256b.dismiss();
                return;
            case 1:
                yh.i0 i0Var = this.f1256b;
                qh.i iVar = i0Var.h;
                ih.f fVar = i0Var.f50299f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = i0Var.f50303w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                i0Var.p();
                return;
            case 2:
                this.f1256b.H.performClick();
                return;
            default:
                this.f1256b.f50300n.G0();
                return;
        }
    }
}
