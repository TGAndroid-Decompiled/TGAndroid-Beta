package lh;

import org.telegram.ui.Components.k6;
public final class n0 implements Runnable {
    public final int f12855a;
    public final u0 f12856b;

    public n0(u0 u0Var, int i10) {
        this.f12855a = i10;
        this.f12856b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f12855a) {
            case 0:
                u0 u0Var = this.f12856b;
                dh.i iVar = u0Var.h;
                vg.f fVar = u0Var.f12985f;
                if (fVar != null) {
                    fVar.d();
                }
                s0 s0Var = u0Var.E;
                if (s0Var != null) {
                    s0Var.setTranslationY(-iVar.c());
                }
                k6 k6Var = u0Var.f12989w;
                if (k6Var != null) {
                    k6Var.setTranslationY(-iVar.c());
                }
                u0Var.o();
                return;
            case 1:
                this.f12856b.E.performClick();
                return;
            default:
                this.f12856b.dismiss();
                return;
        }
    }
}
