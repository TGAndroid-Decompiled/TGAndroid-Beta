package kh;

import i2.h0;
import me.d;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.voip.w2;
public final class a implements d {
    public final e f14866a;
    public final e f14867b;
    public final me.b f14868c;
    public final me.b d;
    public final w2 f14869e;
    public final h0 f14870f;
    public boolean h;

    public a(w2 w2Var, h0 h0Var) {
        is isVar = is.h;
        this.f14866a = new e(1, this, isVar, 350L);
        this.f14867b = new e(2, this, isVar, 350L);
        this.f14868c = new me.b(0, this, isVar, 350L, true);
        this.d = new me.b(3, this, isVar, 350L, true);
        this.h = true;
        this.f14869e = w2Var;
        this.f14870f = h0Var;
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        int i11;
        w2 w2Var = this.f14869e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.f14866a.f16409e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.f14867b.f16409e);
        }
        me.b bVar = this.d;
        me.b bVar2 = this.f14868c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f16401e) * bVar2.f16401e);
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
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f16401e) * bVar2.f16401e);
        }
        h0 h0Var = this.f14870f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
