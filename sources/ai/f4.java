package ai;
public final class f4 implements Runnable {
    public final int f1297a;
    public final yh.j0 f1298b;

    public f4(yh.j0 j0Var, int i10) {
        this.f1297a = i10;
        this.f1298b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f1297a) {
            case 0:
                this.f1298b.dismiss();
                return;
            case 1:
                yh.j0 j0Var = this.f1298b;
                qh.i iVar = j0Var.h;
                ih.f fVar = j0Var.f50324f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = j0Var.f50328w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                j0Var.p();
                return;
            default:
                this.f1298b.H.performClick();
                return;
        }
    }
}
