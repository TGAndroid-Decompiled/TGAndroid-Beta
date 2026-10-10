package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tw;
public final class b2 extends tw {
    public final d2 f4748g0;

    public b2(d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21132v6, e6Var), false);
        this.f4748g0 = d2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        j2 j2Var;
        d2 d2Var = this.f4748g0;
        o1 o1Var = d2Var.f4895b;
        c2 c2Var = d2Var.f4896c;
        k2 k2Var = d2Var.f4898f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (k2Var != null && (j2Var = k2Var.f5310f) != null) {
            if (j2Var.getSelectedCategory() != null) {
                o1.x1(o1Var, 0, 0);
                k2Var.f5310f.G1(null);
            }
            k2Var.f5310f.E1();
            k2Var.b();
        }
        if (c2Var != null) {
            c2Var.D(null);
        }
        while (true) {
            if (i12 < c2Var.f4832y.size()) {
                i11 = c2Var.f4832y.keyAt(i12);
                if (c2Var.f4832y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = d2Var.f4899n;
            if (f7 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f7 = d2Var.b();
                d2Var.f4899n = f7;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.x1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
