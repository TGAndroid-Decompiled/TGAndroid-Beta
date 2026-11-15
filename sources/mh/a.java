package mh;

import kg.j1;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.voip.r2;
import te.c;
public final class a implements te.b {
    public final c f20635a;
    public final c f20636b;
    public final te.a f20637c;
    public final te.a d;
    public final r2 f20638e;
    public final j1 f20639f;
    public boolean h;

    public a(r2 r2Var, j1 j1Var) {
        er erVar = er.h;
        this.f20635a = new c(1, this, erVar, 350L);
        this.f20636b = new c(2, this, erVar, 350L);
        this.f20637c = new te.a(0, this, erVar, 350L, true);
        this.d = new te.a(3, this, erVar, 350L, true);
        this.h = true;
        this.f20638e = r2Var;
        this.f20639f = j1Var;
    }

    @Override
    public final void G(int i7, float f10, float f11, c cVar) {
        int i10;
        r2 r2Var = this.f20638e;
        if (i7 == 1) {
            r2Var.setTranslationX(this.f20635a.f57091f);
        }
        if (i7 == 2) {
            r2Var.setTranslationY(this.f20636b.f57091f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f20637c;
        if (i7 == 0) {
            r2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57085e) * aVar2.f57085e);
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
            r2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57085e) * aVar2.f57085e);
        }
        j1 j1Var = this.f20639f;
        if (j1Var != null) {
            j1Var.run();
        }
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
