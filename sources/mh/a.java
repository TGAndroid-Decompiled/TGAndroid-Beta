package mh;

import l2.w;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import te.c;
public final class a implements te.b {
    public final c f20038a;
    public final c f20039b;
    public final te.a f20040c;
    public final te.a d;
    public final n2 f20041e;
    public final w f20042f;
    public boolean h;

    public a(n2 n2Var, w wVar) {
        xq xqVar = xq.h;
        this.f20038a = new c(1, this, xqVar, 350L);
        this.f20039b = new c(2, this, xqVar, 350L);
        this.f20040c = new te.a(0, this, xqVar, 350L, true);
        this.d = new te.a(3, this, xqVar, 350L, true);
        this.h = true;
        this.f20041e = n2Var;
        this.f20042f = wVar;
    }

    @Override
    public final void Y(int i7, float f10, float f11, c cVar) {
        int i10;
        n2 n2Var = this.f20041e;
        if (i7 == 1) {
            n2Var.setTranslationX(this.f20038a.f55492f);
        }
        if (i7 == 2) {
            n2Var.setTranslationY(this.f20039b.f55492f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f20040c;
        if (i7 == 0) {
            n2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f55486e) * aVar2.f55486e);
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
            n2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f55486e) * aVar2.f55486e);
        }
        w wVar = this.f20042f;
        if (wVar != null) {
            wVar.run();
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
