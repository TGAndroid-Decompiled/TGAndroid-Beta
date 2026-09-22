package kh;

import i2.g0;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.voip.v2;
public final class a implements d {
    public final e f13644a;
    public final e f13645b;
    public final le.b f13646c;
    public final le.b d;
    public final v2 e;
    public final g0 f13647f;
    public boolean h;

    public a(v2 v2Var, g0 g0Var) {
        qr qrVar = qr.h;
        this.f13644a = new e(1, this, qrVar, 350L);
        this.f13645b = new e(2, this, qrVar, 350L);
        this.f13646c = new le.b(0, this, qrVar, 350L, true);
        this.d = new le.b(3, this, qrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f13647f = g0Var;
    }

    @Override
    public final void D(int i10, float f7, float f10, e eVar) {
        int i11;
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.f13644a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.f13645b.e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.f13646c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
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
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        g0 g0Var = this.f13647f;
        if (g0Var != null) {
            g0Var.run();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
