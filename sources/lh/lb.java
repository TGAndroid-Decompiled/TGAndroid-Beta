package lh;

import org.telegram.ui.iz0;

public final class lb extends nb {

    public final int f16326g;
    public final Object h;

    public lb(Object obj, int i10) {
        this.f16326g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f16326g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = false;
                iz0Var.invalidate();
                break;
            case 1:
                jh.e4 e4VarT = ((jh.i9) this.h).t();
                if (e4VarT != null) {
                    e4VarT.m0(true);
                }
                break;
            default:
                org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) this.h;
                n9Var.post(new kh.c(n9Var, 24));
                break;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f16326g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = true;
                iz0Var.invalidate();
                break;
            case 1:
                jh.e4 e4VarT = ((jh.i9) this.h).t();
                if (e4VarT != null) {
                    e4VarT.m0(false);
                }
                jh.j3 j3Var = this.f16458f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f16458f.setTranslationY(0.0f);
                }
                break;
            default:
                ((org.telegram.ui.Components.n9) this.h).setVisibility(0);
                break;
        }
    }
}
