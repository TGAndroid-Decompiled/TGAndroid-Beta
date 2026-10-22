package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kw;
public final class y1 extends kw {
    public final b2 f10126g0;

    public y1(b2 b2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21326v6, d6Var), false);
        this.f10126g0 = b2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        g2 g2Var;
        b2 b2Var = this.f10126g0;
        o1 o1Var = b2Var.f8769b;
        a2 a2Var = b2Var.f8770c;
        h2 h2Var = b2Var.f8771f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (h2Var != null && (g2Var = h2Var.f9147f) != null) {
            if (g2Var.getSelectedCategory() != null) {
                o1.x1(o1Var, 0, 0);
                h2Var.f9147f.G1(null);
            }
            h2Var.f9147f.E1();
            h2Var.b();
        }
        if (a2Var != null) {
            a2Var.D(null);
        }
        while (true) {
            if (i12 < a2Var.f8684y.size()) {
                i11 = a2Var.f8684y.keyAt(i12);
                if (a2Var.f8684y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = b2Var.f8772n;
            if (f7 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f7 = b2Var.b();
                b2Var.f8772n = f7;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.x1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
