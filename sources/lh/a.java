package lh;

import ig.t0;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.voip.t2;
public final class a implements d {
    public final e f15463a;
    public final e f15464b;
    public final le.b f15465c;
    public final le.b d;
    public final t2 f15466e;
    public final t0 f15467f;
    public boolean h;

    public a(t2 t2Var, t0 t0Var) {
        pr prVar = pr.h;
        this.f15463a = new e(1, this, prVar, 350L);
        this.f15464b = new e(2, this, prVar, 350L);
        this.f15465c = new le.b(0, this, prVar, 350L, true);
        this.d = new le.b(3, this, prVar, 350L, true);
        this.h = true;
        this.f15466e = t2Var;
        this.f15467f = t0Var;
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        int i11;
        t2 t2Var = this.f15466e;
        if (i10 == 1) {
            t2Var.setTranslationX(this.f15463a.f15376e);
        }
        if (i10 == 2) {
            t2Var.setTranslationY(this.f15464b.f15376e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.f15465c;
        if (i10 == 0) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f15368e) * bVar2.f15368e);
            t2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            t2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            t2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f15368e) * bVar2.f15368e);
        }
        t0 t0Var = this.f15467f;
        if (t0Var != null) {
            t0Var.run();
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
