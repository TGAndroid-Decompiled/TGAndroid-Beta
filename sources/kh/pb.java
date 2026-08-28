package kh;

import org.telegram.ui.iz0;
public final class pb extends rb {
    public final int f15848g;
    public final Object h;

    public pb(Object obj, int i9) {
        this.f15848g = i9;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f15848g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = false;
                iz0Var.invalidate();
                return;
            case 1:
                ih.i4 t10 = ((ih.m9) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) this.h;
                o9Var.post(new f1(o9Var, 17));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f15848g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = true;
                iz0Var.invalidate();
                return;
            case 1:
                ih.i4 t10 = ((ih.m9) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ih.l3 l3Var = this.f15976f;
                if (l3Var != null) {
                    l3Var.setTranslationX(0.0f);
                    this.f15976f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.o9) this.h).setVisibility(0);
                return;
        }
    }
}
