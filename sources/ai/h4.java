package ai;
public final class h4 implements Runnable {
    public final int f1404a;
    public final yh.i0 f1405b;

    public h4(yh.i0 i0Var, int i10) {
        this.f1404a = i10;
        this.f1405b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f1404a) {
            case 0:
                this.f1405b.dismiss();
                return;
            case 1:
                yh.i0 i0Var = this.f1405b;
                qh.i iVar = i0Var.h;
                ih.f fVar = i0Var.f50288f;
                if (fVar != null) {
                    fVar.d();
                }
                yh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.q6 q6Var = i0Var.f50292w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.d());
                }
                i0Var.p();
                return;
            case 2:
                this.f1405b.H.performClick();
                return;
            default:
                this.f1405b.f50289n.G0();
                return;
        }
    }
}
