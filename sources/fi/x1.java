package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kw;
public final class x1 extends kw {
    public final z1 f11952g0;

    public x1(z1 z1Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23692v6, u6Var), false);
        this.f11952g0 = z1Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        e2 e2Var;
        z1 z1Var = this.f11952g0;
        n1 n1Var = z1Var.f12050b;
        y1 y1Var = z1Var.f12051c;
        f2 f2Var = z1Var.f12052f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (f2Var != null && (e2Var = f2Var.h) != null) {
            if (e2Var.getSelectedCategory() != null) {
                n1.C1(n1Var, 0, 0);
                f2Var.h.L1(null);
            }
            f2Var.h.J1();
            f2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i12 < y1Var.f11991y.size()) {
                i11 = y1Var.f11991y.keyAt(i12);
                if (y1Var.f11991y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = z1Var.f12053n;
            if (f7 >= 0.0f) {
                paddingTop = n1Var.getPaddingTop();
            } else {
                f7 = z1Var.b();
                z1Var.f12053n = f7;
                paddingTop = n1Var.getPaddingTop();
            }
            n1.C1(n1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
