package mh;

import kg.j0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.voip.q2;
import te.c;
public final class a implements te.b {
    public final c f20996a;
    public final c f20997b;
    public final te.a f20998c;
    public final te.a d;
    public final q2 f20999e;
    public final j0 f21000f;
    public boolean h;

    public a(q2 q2Var, j0 j0Var) {
        lr lrVar = lr.h;
        this.f20996a = new c(1, this, lrVar, 350L);
        this.f20997b = new c(2, this, lrVar, 350L);
        this.f20998c = new te.a(0, this, lrVar, 350L, true);
        this.d = new te.a(3, this, lrVar, 350L, true);
        this.h = true;
        this.f20999e = q2Var;
        this.f21000f = j0Var;
    }

    @Override
    public final void H(int i7, float f10, float f11, c cVar) {
        int i10;
        q2 q2Var = this.f20999e;
        if (i7 == 1) {
            q2Var.setTranslationX(this.f20996a.f57663f);
        }
        if (i7 == 2) {
            q2Var.setTranslationY(this.f20997b.f57663f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f20998c;
        if (i7 == 0) {
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57657e) * aVar2.f57657e);
            q2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            q2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            q2Var.setVisibility(i10);
        }
        if (i7 == 3) {
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57657e) * aVar2.f57657e);
        }
        j0 j0Var = this.f21000f;
        if (j0Var != null) {
            j0Var.run();
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
