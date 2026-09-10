package jh;

import gg.v1;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.wr;
public final class a implements d {
    public final e f11938a;
    public final e f11939b;
    public final le.b f11940c;
    public final le.b d;
    public final u2 e;
    public final v1 f11941f;
    public boolean h;

    public a(u2 u2Var, v1 v1Var) {
        wr wrVar = wr.h;
        this.f11938a = new e(1, this, wrVar, 350L);
        this.f11939b = new e(2, this, wrVar, 350L);
        this.f11940c = new le.b(0, this, wrVar, 350L, true);
        this.d = new le.b(3, this, wrVar, 350L, true);
        this.h = true;
        this.e = u2Var;
        this.f11941f = v1Var;
    }

    @Override
    public final void G(int i10, float f7, float f10, e eVar) {
        int i11;
        u2 u2Var = this.e;
        if (i10 == 1) {
            u2Var.setTranslationX(this.f11938a.e);
        }
        if (i10 == 2) {
            u2Var.setTranslationY(this.f11939b.e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.f11940c;
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
        v1 v1Var = this.f11941f;
        if (v1Var != null) {
            v1Var.run();
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
