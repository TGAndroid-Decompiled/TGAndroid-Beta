package hi;

import android.content.Context;
import org.telegram.ui.Components.gv;
public final class w1 extends gv {
    public final y1 f15272h0;

    public w1(y1 y1Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var), false);
        this.f15272h0 = y1Var;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        c2 c2Var;
        y1 y1Var = this.f15272h0;
        o1 o1Var = y1Var.f15408b;
        x1 x1Var = y1Var.f15409c;
        d2 d2Var = y1Var.f15411f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (d2Var != null && (c2Var = d2Var.h) != null) {
            if (c2Var.getSelectedCategory() != null) {
                o1.z1(o1Var, 0, 0);
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
                if (x1Var.E.valueAt(i11) == i7) {
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            float f10 = y1Var.f15412n;
            if (f10 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f10 = y1Var.b();
                y1Var.f15412n = f10;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.z1(o1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
