package mh;

import l2.w;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import te.c;
public final class a implements te.b {
    public final c f20035a;
    public final c f20036b;
    public final te.a f20037c;
    public final te.a d;
    public final n2 f20038e;
    public final w f20039f;
    public boolean h;

    public a(n2 n2Var, w wVar) {
        xq xqVar = xq.h;
        this.f20035a = new c(1, this, xqVar, 350L);
        this.f20036b = new c(2, this, xqVar, 350L);
        this.f20037c = new te.a(0, this, xqVar, 350L, true);
        this.d = new te.a(3, this, xqVar, 350L, true);
        this.h = true;
        this.f20038e = n2Var;
        this.f20039f = wVar;
    }

    @Override
    public final void Y(int i7, float f10, float f11, c cVar) {
        int i10;
        n2 n2Var = this.f20038e;
        if (i7 == 1) {
            n2Var.setTranslationX(this.f20035a.f55401f);
        }
        if (i7 == 2) {
            n2Var.setTranslationY(this.f20036b.f55401f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f20037c;
        if (i7 == 0) {
            n2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f55395e) * aVar2.f55395e);
            n2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            n2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n2Var.setVisibility(i10);
        }
        if (i7 == 3) {
            n2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f55395e) * aVar2.f55395e);
        }
        w wVar = this.f20039f;
        if (wVar != null) {
            wVar.run();
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
