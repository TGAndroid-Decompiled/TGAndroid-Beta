package kh;

import i2.h0;
import me.d;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.voip.v2;
public final class a implements d {
    public final e f14867a;
    public final e f14868b;
    public final me.b f14869c;
    public final me.b d;
    public final v2 f14870e;
    public final h0 f14871f;
    public boolean h;

    public a(v2 v2Var, h0 h0Var) {
        hs hsVar = hs.h;
        this.f14867a = new e(1, this, hsVar, 350L);
        this.f14868b = new e(2, this, hsVar, 350L);
        this.f14869c = new me.b(0, this, hsVar, 350L, true);
        this.d = new me.b(3, this, hsVar, 350L, true);
        this.h = true;
        this.f14870e = v2Var;
        this.f14871f = h0Var;
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        int i11;
        v2 v2Var = this.f14870e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.f14867a.f16345e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.f14868b.f16345e);
        }
        me.b bVar = this.d;
        me.b bVar2 = this.f14869c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f16337e) * bVar2.f16337e);
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
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f16337e) * bVar2.f16337e);
        }
        h0 h0Var = this.f14871f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
