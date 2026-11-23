package mh;

import kg.i0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.voip.q2;
import te.c;
public final class a implements te.b {
    public final c f21027a;
    public final c f21028b;
    public final te.a f21029c;
    public final te.a d;
    public final q2 f21030e;
    public final i0 f21031f;
    public boolean h;

    public a(q2 q2Var, i0 i0Var) {
        nr nrVar = nr.h;
        this.f21027a = new c(1, this, nrVar, 350L);
        this.f21028b = new c(2, this, nrVar, 350L);
        this.f21029c = new te.a(0, this, nrVar, 350L, true);
        this.d = new te.a(3, this, nrVar, 350L, true);
        this.h = true;
        this.f21030e = q2Var;
        this.f21031f = i0Var;
    }

    @Override
    public final void H(int i7, float f10, float f11, c cVar) {
        int i10;
        q2 q2Var = this.f21030e;
        if (i7 == 1) {
            q2Var.setTranslationX(this.f21027a.f57706f);
        }
        if (i7 == 2) {
            q2Var.setTranslationY(this.f21028b.f57706f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f21029c;
        if (i7 == 0) {
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57700e) * aVar2.f57700e);
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
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57700e) * aVar2.f57700e);
        }
        i0 i0Var = this.f21031f;
        if (i0Var != null) {
            i0Var.run();
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
