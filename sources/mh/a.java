package mh;

import kg.s0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.voip.q2;
import te.c;
public final class a implements te.b {
    public final c f20993a;
    public final c f20994b;
    public final te.a f20995c;
    public final te.a d;
    public final q2 f20996e;
    public final s0 f20997f;
    public boolean h;

    public a(q2 q2Var, s0 s0Var) {
        nr nrVar = nr.h;
        this.f20993a = new c(1, this, nrVar, 350L);
        this.f20994b = new c(2, this, nrVar, 350L);
        this.f20995c = new te.a(0, this, nrVar, 350L, true);
        this.d = new te.a(3, this, nrVar, 350L, true);
        this.h = true;
        this.f20996e = q2Var;
        this.f20997f = s0Var;
    }

    @Override
    public final void H(int i7, float f10, float f11, c cVar) {
        int i10;
        q2 q2Var = this.f20996e;
        if (i7 == 1) {
            q2Var.setTranslationX(this.f20993a.f57671f);
        }
        if (i7 == 2) {
            q2Var.setTranslationY(this.f20994b.f57671f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.f20995c;
        if (i7 == 0) {
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57665e) * aVar2.f57665e);
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
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.f57665e) * aVar2.f57665e);
        }
        s0 s0Var = this.f20997f;
        if (s0Var != null) {
            s0Var.run();
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
