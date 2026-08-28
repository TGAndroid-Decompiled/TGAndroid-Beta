package fh;
public final class s0 implements Runnable {
    public final int f6747a;
    public final z0 f6748b;

    public s0(z0 z0Var, int i9) {
        this.f6747a = i9;
        this.f6748b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f6747a) {
            case 0:
                z0 z0Var = this.f6748b;
                xg.i iVar = z0Var.h;
                pg.f fVar = z0Var.f6900f;
                if (fVar != null) {
                    fVar.d();
                }
                x0 x0Var = z0Var.D;
                if (x0Var != null) {
                    x0Var.setTranslationY(-iVar.c());
                }
                org.telegram.ui.Components.j6 j6Var = z0Var.f6904w;
                if (j6Var != null) {
                    j6Var.setTranslationY(-iVar.c());
                }
                z0Var.o();
                return;
            case 1:
                this.f6748b.D.performClick();
                return;
            default:
                this.f6748b.dismiss();
                return;
        }
    }
}
