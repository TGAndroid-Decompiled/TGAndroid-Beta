package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.zf0;
public final class r9 implements o1.g {
    public final int f18530a;
    public final float f18531b;
    public final Object f18532c;

    public r9(Object obj, float f9, int i10) {
        this.f18530a = i10;
        this.f18532c = obj;
        this.f18531b = f9;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        float dp;
        switch (this.f18530a) {
            case 0:
                gb gbVar = (gb) this.f18532c;
                if (!z10) {
                    gbVar.I0.setTranslationY(this.f18531b);
                    gbVar.I0.G = false;
                    gbVar.f17772k2 = null;
                    gbVar.f17774l2 = null;
                    return;
                }
                return;
            case 1:
                zf0 zf0Var = (zf0) this.f18532c;
                if (!z10) {
                    bg0 bg0Var = zf0Var.d;
                    o1.l lVar = bg0Var.I.f19045u;
                    int i10 = bg0Var.D;
                    float f11 = (i10 / 2.0f) + this.f18531b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f11 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f19052i = dp;
                    return;
                }
                return;
            default:
                ph.m3 m3Var = (ph.m3) this.f18532c;
                m3Var.v = null;
                float f12 = this.f18531b;
                if (!z10) {
                    m3Var.f45906f = f12;
                    m3Var.c();
                    return;
                }
                m3Var.h = f12;
                return;
        }
    }
}
