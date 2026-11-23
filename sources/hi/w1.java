package hi;

import android.content.Context;
import org.telegram.ui.Components.nv;
public final class w1 extends nv {
    public final y1 f15577h0;

    public w1(y1 y1Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, h6Var), false);
        this.f15577h0 = y1Var;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        c2 c2Var;
        y1 y1Var = this.f15577h0;
        n1 n1Var = y1Var.f15709b;
        x1 x1Var = y1Var.f15710c;
        d2 d2Var = y1Var.f15712f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (d2Var != null && (c2Var = d2Var.h) != null) {
            if (c2Var.getSelectedCategory() != null) {
                n1.z1(n1Var, 0, 0);
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
            float f10 = y1Var.f15713n;
            if (f10 >= 0.0f) {
                paddingTop = n1Var.getPaddingTop();
            } else {
                f10 = y1Var.b();
                y1Var.f15713n = f10;
                paddingTop = n1Var.getPaddingTop();
            }
            n1.z1(n1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
