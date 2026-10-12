package kh;

import i2.h0;
import me.d;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.voip.w2;
public final class a implements d {
    public final e f14864a;
    public final e f14865b;
    public final me.b f14866c;
    public final me.b d;
    public final w2 f14867e;
    public final h0 f14868f;
    public boolean h;

    public a(w2 w2Var, h0 h0Var) {
        js jsVar = js.h;
        this.f14864a = new e(1, this, jsVar, 350L);
        this.f14865b = new e(2, this, jsVar, 350L);
        this.f14866c = new me.b(0, this, jsVar, 350L, true);
        this.d = new me.b(3, this, jsVar, 350L, true);
        this.h = true;
        this.f14867e = w2Var;
        this.f14868f = h0Var;
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        int i11;
        w2 w2Var = this.f14867e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.f14864a.f16096e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.f14865b.f16096e);
        }
        me.b bVar = this.d;
        me.b bVar2 = this.f14866c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f16088e) * bVar2.f16088e);
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
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f16088e) * bVar2.f16088e);
        }
        h0 h0Var = this.f14868f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
