package mh;

import kg.i0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.voip.r2;
import te.c;
public final class a implements te.b {
    public final c f21089a;
    public final c f21090b;
    public final te.a f21091c;
    public final te.a d;
    public final r2 f21092e;
    public final i0 f21093f;
    public boolean h;

    public a(r2 r2Var, i0 i0Var) {
        kr krVar = kr.h;
        this.f21089a = new c(1, this, krVar, 350L);
        this.f21090b = new c(2, this, krVar, 350L);
        this.f21091c = new te.a(0, this, krVar, 350L, true);
        this.d = new te.a(3, this, krVar, 350L, true);
        this.h = true;
        this.f21092e = r2Var;
        this.f21093f = i0Var;
    }

    @Override
    public final void K(int i7, float f10, float f11, c cVar) {
        int i10;
        r2 r2Var = this.f21092e;
        if (i7 == 1) {
            r2Var.setTranslationX(this.f21089a.f57785f);
        }
        if (i7 == 2) {
            r2Var.setTranslationY(this.f21090b.f57785f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f21091c;
        if (i7 == 0) {
            r2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57779e) * aVar2.f57779e);
            r2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            r2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r2Var.setVisibility(i10);
        }
        if (i7 == 3) {
            r2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57779e) * aVar2.f57779e);
        }
        i0 i0Var = this.f21093f;
        if (i0Var != null) {
            i0Var.run();
        }
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
