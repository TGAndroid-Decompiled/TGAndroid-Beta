package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ew;
public final class c2 extends ew {
    public final e2 f4440g0;

    public c2(e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19390v6, e6Var), false);
        this.f4440g0 = e2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        k2 k2Var;
        e2 e2Var = this.f4440g0;
        p1 p1Var = e2Var.f4604b;
        d2 d2Var = e2Var.f4605c;
        l2 l2Var = e2Var.f4606f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (l2Var != null && (k2Var = l2Var.f5089f) != null) {
            if (k2Var.getSelectedCategory() != null) {
                p1.x1(p1Var, 0, 0);
                l2Var.f5089f.G1(null);
            }
            l2Var.f5089f.E1();
            l2Var.b();
        }
        if (d2Var != null) {
            d2Var.D(null);
        }
        while (true) {
            if (i12 < d2Var.f4536y.size()) {
                i11 = d2Var.f4536y.keyAt(i12);
                if (d2Var.f4536y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = e2Var.f4607n;
            if (f7 >= 0.0f) {
                paddingTop = p1Var.getPaddingTop();
            } else {
                f7 = e2Var.b();
                e2Var.f4607n = f7;
                paddingTop = p1Var.getPaddingTop();
            }
            p1.x1(p1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
