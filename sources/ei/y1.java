package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iw;
public final class y1 extends iw {
    public final b2 f10143g0;

    public y1(b2 b2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21517v6, g6Var), false);
        this.f10143g0 = b2Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        g2 g2Var;
        b2 b2Var = this.f10143g0;
        o1 o1Var = b2Var.f8778b;
        a2 a2Var = b2Var.f8779c;
        h2 h2Var = b2Var.f8780f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (h2Var != null && (g2Var = h2Var.h) != null) {
            if (g2Var.getSelectedCategory() != null) {
                o1.C1(o1Var, 0, 0);
                h2Var.h.L1(null);
            }
            h2Var.h.J1();
            h2Var.b();
        }
        if (a2Var != null) {
            a2Var.D(null);
        }
        while (true) {
            if (i12 < a2Var.f8693y.size()) {
                i11 = a2Var.f8693y.keyAt(i12);
                if (a2Var.f8693y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = b2Var.f8781n;
            if (f7 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f7 = b2Var.b();
                b2Var.f8781n = f7;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.C1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
