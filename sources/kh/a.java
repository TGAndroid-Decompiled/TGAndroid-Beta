package kh;

import i2.h0;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.voip.w2;
public final class a implements d {
    public final e f14819a;
    public final e f14820b;
    public final le.b f14821c;
    public final le.b d;
    public final w2 f14822e;
    public final h0 f14823f;
    public boolean h;

    public a(w2 w2Var, h0 h0Var) {
        tr trVar = tr.h;
        this.f14819a = new e(1, this, trVar, 350L);
        this.f14820b = new e(2, this, trVar, 350L);
        this.f14821c = new le.b(0, this, trVar, 350L, true);
        this.d = new le.b(3, this, trVar, 350L, true);
        this.h = true;
        this.f14822e = w2Var;
        this.f14823f = h0Var;
    }

    @Override
    public final void a0(int i10, float f7, float f10, e eVar) {
        int i11;
        w2 w2Var = this.f14822e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.f14819a.f15442e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.f14820b.f15442e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.f14821c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f15434e) * bVar2.f15434e);
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
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.f15434e) * bVar2.f15434e);
        }
        h0 h0Var = this.f14823f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
