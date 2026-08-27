package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sf0;

public final class da implements o1.f {

    public final int f15876a;

    public final float f15877b;

    public final Object f15878c;

    public da(Object obj, float f10, int i10) {
        this.f15876a = i10;
        this.f15878c = obj;
        this.f15877b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f15876a) {
            case 0:
                sb sbVar = (sb) this.f15878c;
                if (!z10) {
                    sbVar.I0.setTranslationY(this.f15877b);
                    sbVar.I0.G = false;
                    sbVar.f16778k2 = null;
                    sbVar.f16780l2 = null;
                    break;
                }
                break;
            case 1:
                nh.d4 d4Var = (nh.d4) this.f15878c;
                d4Var.v = null;
                float f12 = this.f15877b;
                if (!z10) {
                    d4Var.f18648f = f12;
                    d4Var.c();
                } else {
                    d4Var.h = f12;
                }
                break;
            default:
                qf0 qf0Var = (qf0) this.f15878c;
                if (!z10) {
                    sf0 sf0Var = qf0Var.d;
                    o1.k kVar = sf0Var.I.f19147u;
                    int i10 = sf0Var.D;
                    float f13 = (i10 / 2.0f) + this.f15877b;
                    int i11 = AndroidUtilities.displaySize.x;
                    kVar.f19154i = f13 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                }
                break;
        }
    }
}
