package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vw;
public final class b2 extends vw {
    public final d2 f4746g0;

    public b2(d2 d2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20892v6, c6Var), false);
        this.f4746g0 = d2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        j2 j2Var;
        d2 d2Var = this.f4746g0;
        o1 o1Var = d2Var.f4893b;
        c2 c2Var = d2Var.f4894c;
        k2 k2Var = d2Var.f4896f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (k2Var != null && (j2Var = k2Var.f5308f) != null) {
            if (j2Var.getSelectedCategory() != null) {
                o1.x1(o1Var, 0, 0);
                k2Var.f5308f.G1(null);
            }
            k2Var.f5308f.E1();
            k2Var.b();
        }
        if (c2Var != null) {
            c2Var.D(null);
        }
        while (true) {
            if (i12 < c2Var.f4830y.size()) {
                i11 = c2Var.f4830y.keyAt(i12);
                if (c2Var.f4830y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = d2Var.f4897n;
            if (f7 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f7 = d2Var.b();
                d2Var.f4897n = f7;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.x1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
