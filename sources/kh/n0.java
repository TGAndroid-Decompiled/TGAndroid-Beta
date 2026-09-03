package kh;

import org.telegram.ui.Components.k6;
public final class n0 implements Runnable {
    public final int f10829a;
    public final u0 f10830b;

    public n0(u0 u0Var, int i10) {
        this.f10829a = i10;
        this.f10830b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f10829a) {
            case 0:
                u0 u0Var = this.f10830b;
                ch.i iVar = u0Var.h;
                ug.f fVar = u0Var.f10945f;
                if (fVar != null) {
                    fVar.d();
                }
                s0 s0Var = u0Var.E;
                if (s0Var != null) {
                    s0Var.setTranslationY(-iVar.c());
                }
                k6 k6Var = u0Var.f10949w;
                if (k6Var != null) {
                    k6Var.setTranslationY(-iVar.c());
                }
                u0Var.o();
                return;
            case 1:
                this.f10830b.E.performClick();
                return;
            default:
                this.f10830b.dismiss();
                return;
        }
    }
}
