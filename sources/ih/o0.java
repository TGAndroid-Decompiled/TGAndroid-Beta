package ih;

import org.telegram.ui.Components.o6;
public final class o0 implements Runnable {
    public final int f9306a;
    public final v0 f9307b;

    public o0(v0 v0Var, int i10) {
        this.f9306a = i10;
        this.f9307b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f9306a) {
            case 0:
                v0 v0Var = this.f9307b;
                ah.i iVar = v0Var.h;
                sg.f fVar = v0Var.f9427f;
                if (fVar != null) {
                    fVar.d();
                }
                t0 t0Var = v0Var.D;
                if (t0Var != null) {
                    t0Var.setTranslationY(-iVar.c());
                }
                o6 o6Var = v0Var.f9431w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
                }
                v0Var.o();
                return;
            case 1:
                this.f9307b.D.performClick();
                return;
            default:
                this.f9307b.dismiss();
                return;
        }
    }
}
