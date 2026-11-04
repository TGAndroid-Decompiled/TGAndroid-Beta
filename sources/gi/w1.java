package gi;

import android.content.Context;
import org.telegram.ui.Components.zu;
public final class w1 extends zu {
    public final y1 f13789h0;

    public w1(y1 y1Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, e6Var), false);
        this.f13789h0 = y1Var;
    }

    @Override
    public final boolean h(int i3) {
        int i10;
        int paddingTop;
        c2 c2Var;
        y1 y1Var = this.f13789h0;
        m1 m1Var = y1Var.f13914b;
        x1 x1Var = y1Var.f13915c;
        d2 d2Var = y1Var.f13917f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (d2Var != null && (c2Var = d2Var.h) != null) {
            if (c2Var.getSelectedCategory() != null) {
                m1.z1(m1Var, 0, 0);
                d2Var.h.I1(null);
            }
            d2Var.h.G1();
            d2Var.b();
        }
        if (x1Var != null) {
            x1Var.D(null);
        }
        while (true) {
            if (i11 < x1Var.E.size()) {
                i10 = x1Var.E.keyAt(i11);
                if (x1Var.E.valueAt(i11) == i3) {
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            float f10 = y1Var.f13918n;
            if (f10 >= 0.0f) {
                paddingTop = m1Var.getPaddingTop();
            } else {
                f10 = y1Var.b();
                y1Var.f13918n = f10;
                paddingTop = m1Var.getPaddingTop();
            }
            m1.z1(m1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
