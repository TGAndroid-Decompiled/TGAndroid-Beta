package ai;
public final class h4 implements Runnable {
    public final int f1409a;
    public final yh.j0 f1410b;

    public h4(yh.j0 j0Var, int i10) {
        this.f1409a = i10;
        this.f1410b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f1409a) {
            case 0:
                this.f1410b.dismiss();
                return;
            case 1:
                yh.j0 j0Var = this.f1410b;
                qh.i iVar = j0Var.h;
                ih.f fVar = j0Var.f50349f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = j0Var.f50353w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                j0Var.p();
                return;
            default:
                this.f1410b.H.performClick();
                return;
        }
    }
}
