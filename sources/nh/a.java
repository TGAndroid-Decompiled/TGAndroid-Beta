package nh;

import lg.n;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.xq;
import qe.c;
public final class a implements qe.b {
    public final c f20388a;
    public final c f20389b;
    public final qe.a f20390c;
    public final qe.a d;
    public final c2 f20391e;
    public final n f20392f;
    public boolean h;

    public a(c2 c2Var, n nVar) {
        xq xqVar = xq.h;
        this.f20388a = new c(1, this, xqVar, 350L);
        this.f20389b = new c(2, this, xqVar, 350L);
        this.f20390c = new qe.a(0, this, xqVar, 350L, true);
        this.d = new qe.a(3, this, xqVar, 350L, true);
        this.h = true;
        this.f20391e = c2Var;
        this.f20392f = nVar;
    }

    @Override
    public final void Y(int i3, float f10, float f11, c cVar) {
        int i10;
        c2 c2Var = this.f20391e;
        if (i3 == 1) {
            c2Var.setTranslationX(this.f20388a.f53846f);
        }
        if (i3 == 2) {
            c2Var.setTranslationY(this.f20389b.f53846f);
        }
        qe.a aVar = this.d;
        qe.a aVar2 = this.f20390c;
        if (i3 == 0) {
            c2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f53840e) * aVar2.f53840e);
            c2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            c2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            c2Var.setVisibility(i10);
        }
        if (i3 == 3) {
            c2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f53840e) * aVar2.f53840e);
        }
        n nVar = this.f20392f;
        if (nVar != null) {
            nVar.run();
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
