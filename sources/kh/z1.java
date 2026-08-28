package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nv;
public final class z1 extends nv {
    public final b2 f16423c0;

    public z1(b2 b2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23319v6, b6Var), false);
        this.f16423c0 = b2Var;
    }

    @Override
    public final boolean h(int i9) {
        int i10;
        int paddingTop;
        f2 f2Var;
        b2 b2Var = this.f16423c0;
        q1 q1Var = b2Var.f14982b;
        a2 a2Var = b2Var.f14983c;
        g2 g2Var = b2Var.f14985f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (g2Var != null && (f2Var = g2Var.f15260f) != null) {
            if (f2Var.getSelectedCategory() != null) {
                q1.w1(q1Var, 0, 0);
                g2Var.f15260f.F1(null);
            }
            g2Var.f15260f.D1();
            g2Var.b();
        }
        if (a2Var != null) {
            a2Var.D(null);
        }
        while (true) {
            if (i11 < a2Var.f14888y.size()) {
                i10 = a2Var.f14888y.keyAt(i11);
                if (a2Var.f14888y.valueAt(i11) == i9) {
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            float f10 = b2Var.f14986n;
            if (f10 >= 0.0f) {
                paddingTop = q1Var.getPaddingTop();
            } else {
                f10 = b2Var.b();
                b2Var.f14986n = f10;
                paddingTop = q1Var.getPaddingTop();
            }
            q1.w1(q1Var, i10, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
