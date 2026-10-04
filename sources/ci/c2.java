package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gw;
public final class c2 extends gw {
    public final e2 f4799g0;

    public c2(e2 e2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21152v6, d6Var), false);
        this.f4799g0 = e2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        k2 k2Var;
        e2 e2Var = this.f4799g0;
        p1 p1Var = e2Var.f4973b;
        d2 d2Var = e2Var.f4974c;
        l2 l2Var = e2Var.f4976f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (l2Var != null && (k2Var = l2Var.f5483f) != null) {
            if (k2Var.getSelectedCategory() != null) {
                p1.y1(p1Var, 0, 0);
                l2Var.f5483f.H1(null);
            }
            l2Var.f5483f.F1();
            l2Var.b();
        }
        if (d2Var != null) {
            d2Var.D(null);
        }
        while (true) {
            if (i12 < d2Var.f4902y.size()) {
                i11 = d2Var.f4902y.keyAt(i12);
                if (d2Var.f4902y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = e2Var.f4977n;
            if (f7 >= 0.0f) {
                paddingTop = p1Var.getPaddingTop();
            } else {
                f7 = e2Var.b();
                e2Var.f4977n = f7;
                paddingTop = p1Var.getPaddingTop();
            }
            p1.y1(p1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
