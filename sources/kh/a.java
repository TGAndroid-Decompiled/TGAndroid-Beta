package kh;

import i2.h0;
import le.c;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.voip.w2;
public final class a implements e {
    public final f f13645a;
    public final f f13646b;
    public final c f13647c;
    public final c d;
    public final w2 e;
    public final h0 f13648f;
    public boolean h;

    public a(w2 w2Var, h0 h0Var) {
        tr trVar = tr.h;
        this.f13645a = new f(1, this, trVar, 350L);
        this.f13646b = new f(2, this, trVar, 350L);
        this.f13647c = new c(0, this, trVar, 350L, true);
        this.d = new c(3, this, trVar, 350L, true);
        this.h = true;
        this.e = w2Var;
        this.f13648f = h0Var;
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        int i11;
        w2 w2Var = this.e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.f13645a.e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.f13646b.e);
        }
        c cVar = this.d;
        c cVar2 = this.f13647c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            w2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
        }
        h0 h0Var = this.f13648f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
