package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.wh0;
public final class g2 extends vh.d {
    public final int f13122k0;
    public final ha f13123l0;

    public g2(ha haVar, Context context, p6 p6Var, int i10) {
        super(context, p6Var, true);
        this.f13122k0 = i10;
        this.f13123l0 = haVar;
    }

    @Override
    public final float b(float f7, float f10) {
        boolean z10;
        boolean z11;
        switch (this.f13122k0) {
            case 0:
                i2 i2Var = (i2) this.f13123l0;
                if (i2Var.f13148l2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i2Var.f13148l2 = f7;
                if (z10) {
                    i2Var.f13149m2 = new d2(i2Var, 0);
                    i2Var.n1(false);
                }
                return f7;
            default:
                wh0 wh0Var = (wh0) this.f13123l0;
                if (wh0Var.f43310f2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wh0Var.f43310f2 = f7;
                if (z11) {
                    wh0Var.f43311g2 = new d2(wh0Var, 3);
                    wh0Var.e1(false);
                }
                return f7;
        }
    }
}
