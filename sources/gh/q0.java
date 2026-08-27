package gh;

public final class q0 implements Runnable {

    public final int f7500a;

    public final x0 f7501b;

    public q0(x0 x0Var, int i10) {
        this.f7500a = i10;
        this.f7501b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f7500a) {
            case 0:
                x0 x0Var = this.f7501b;
                yg.i iVar = x0Var.h;
                qg.g gVar = x0Var.f7617f;
                if (gVar != null) {
                    gVar.d();
                }
                v0 v0Var = x0Var.D;
                if (v0Var != null) {
                    v0Var.setTranslationY(-iVar.c());
                }
                org.telegram.ui.Components.j6 j6Var = x0Var.f7621w;
                if (j6Var != null) {
                    j6Var.setTranslationY(-iVar.c());
                }
                x0Var.p();
                break;
            case 1:
                this.f7501b.D.performClick();
                break;
            default:
                this.f7501b.dismiss();
                break;
        }
    }
}
