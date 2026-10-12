package lh;

import ig.t0;
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.voip.u2;
public final class a implements d {
    public final e f14734a;
    public final e f14735b;
    public final ne.b f14736c;
    public final ne.b d;
    public final u2 e;
    public final t0 f14737f;
    public boolean h;

    public a(u2 u2Var, t0 t0Var) {
        es esVar = es.h;
        this.f14734a = new e(1, this, esVar, 350L);
        this.f14735b = new e(2, this, esVar, 350L);
        this.f14736c = new ne.b(0, this, esVar, 350L, true);
        this.d = new ne.b(3, this, esVar, 350L, true);
        this.h = true;
        this.e = u2Var;
        this.f14737f = t0Var;
    }

    @Override
    public final void p(int i10, float f7, float f10, e eVar) {
        int i11;
        u2 u2Var = this.e;
        if (i10 == 1) {
            u2Var.setTranslationX(this.f14734a.e);
        }
        if (i10 == 2) {
            u2Var.setTranslationY(this.f14735b.e);
        }
        ne.b bVar = this.d;
        ne.b bVar2 = this.f14736c;
        if (i10 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        t0 t0Var = this.f14737f;
        if (t0Var != null) {
            t0Var.run();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
