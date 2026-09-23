package kh;

import i2.h0;
import le.c;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.voip.v2;
public final class a implements e {
    public final f f13632a;
    public final f f13633b;
    public final c f13634c;
    public final c d;
    public final v2 e;
    public final h0 f13635f;
    public boolean h;

    public a(v2 v2Var, h0 h0Var) {
        rr rrVar = rr.h;
        this.f13632a = new f(1, this, rrVar, 350L);
        this.f13633b = new f(2, this, rrVar, 350L);
        this.f13634c = new c(0, this, rrVar, 350L, true);
        this.d = new c(3, this, rrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f13635f = h0Var;
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        int i11;
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.f13632a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.f13633b.e);
        }
        c cVar = this.d;
        c cVar2 = this.f13634c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
            v2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            v2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
        }
        h0 h0Var = this.f13635f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
