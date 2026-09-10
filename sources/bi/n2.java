package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gw;
public final class n2 extends gw {
    public final q2 f3230g0;

    public n2(q2 q2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, f6Var), false);
        this.f3230g0 = q2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        w2 w2Var;
        q2 q2Var = this.f3230g0;
        w1 w1Var = q2Var.f3442b;
        p2 p2Var = q2Var.f3443c;
        x2 x2Var = q2Var.f3444f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (x2Var != null && (w2Var = x2Var.f3871f) != null) {
            if (w2Var.getSelectedCategory() != null) {
                w1.v1(w1Var, 0, 0);
                x2Var.f3871f.E1(null);
            }
            x2Var.f3871f.C1();
            x2Var.b();
        }
        if (p2Var != null) {
            p2Var.D(null);
        }
        while (true) {
            if (i12 < p2Var.f3364y.size()) {
                i11 = p2Var.f3364y.keyAt(i12);
                if (p2Var.f3364y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = q2Var.f3445n;
            if (f7 >= 0.0f) {
                paddingTop = w1Var.getPaddingTop();
            } else {
                f7 = q2Var.b();
                q2Var.f3445n = f7;
                paddingTop = w1Var.getPaddingTop();
            }
            w1.v1(w1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
