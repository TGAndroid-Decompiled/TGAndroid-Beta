package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bw;
public final class c2 extends bw {
    public final e2 f7013g0;

    public c2(e2 e2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21017v6, f6Var), false);
        this.f7013g0 = e2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        k2 k2Var;
        e2 e2Var = this.f7013g0;
        p1 p1Var = e2Var.f7182b;
        d2 d2Var = e2Var.f7183c;
        l2 l2Var = e2Var.f7185f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (l2Var != null && (k2Var = l2Var.f7542f) != null) {
            if (k2Var.getSelectedCategory() != null) {
                p1.v1(p1Var, 0, 0);
                l2Var.f7542f.E1(null);
            }
            l2Var.f7542f.C1();
            l2Var.b();
        }
        if (d2Var != null) {
            d2Var.D(null);
        }
        while (true) {
            if (i12 < d2Var.f7087y.size()) {
                i11 = d2Var.f7087y.keyAt(i12);
                if (d2Var.f7087y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = e2Var.f7186n;
            if (f7 >= 0.0f) {
                paddingTop = p1Var.getPaddingTop();
            } else {
                f7 = e2Var.b();
                e2Var.f7186n = f7;
                paddingTop = p1Var.getPaddingTop();
            }
            p1.v1(p1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
