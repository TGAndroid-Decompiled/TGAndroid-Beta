package lh;

import ki.u;
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.voip.t2;
public final class a implements d {
    public final e f16071a;
    public final e f16072b;
    public final ne.b f16073c;
    public final ne.b d;
    public final t2 e;
    public final u f16074f;
    public boolean h;

    public a(t2 t2Var, u uVar) {
        bs bsVar = bs.h;
        this.f16071a = new e(1, this, bsVar, 350L);
        this.f16072b = new e(2, this, bsVar, 350L);
        this.f16073c = new ne.b(0, this, bsVar, 350L, true);
        this.d = new ne.b(3, this, bsVar, 350L, true);
        this.h = true;
        this.e = t2Var;
        this.f16074f = uVar;
    }

    @Override
    public final void u(int i10, float f7, float f10, e eVar) {
        int i11;
        t2 t2Var = this.e;
        if (i10 == 1) {
            t2Var.setTranslationX(this.f16071a.e);
        }
        if (i10 == 2) {
            t2Var.setTranslationY(this.f16072b.e);
        }
        ne.b bVar = this.d;
        ne.b bVar2 = this.f16073c;
        if (i10 == 0) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
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
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        u uVar = this.f16074f;
        if (uVar != null) {
            uVar.run();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
