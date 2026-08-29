package nh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv;
public final class w1 extends tv {
    public final y1 f18776c0;

    public w1(y1 y1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, c6Var), false);
        this.f18776c0 = y1Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        c2 c2Var;
        y1 y1Var = this.f18776c0;
        n1 n1Var = y1Var.f18853b;
        x1 x1Var = y1Var.f18854c;
        d2 d2Var = y1Var.f18856f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (d2Var != null && (c2Var = d2Var.f17524f) != null) {
            if (c2Var.getSelectedCategory() != null) {
                n1.w1(n1Var, 0, 0);
                d2Var.f17524f.F1(null);
            }
            d2Var.f17524f.D1();
            d2Var.b();
        }
        if (x1Var != null) {
            x1Var.D(null);
        }
        while (true) {
            if (i12 < x1Var.f18822y.size()) {
                i11 = x1Var.f18822y.keyAt(i12);
                if (x1Var.f18822y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f9 = y1Var.f18857n;
            if (f9 >= 0.0f) {
                paddingTop = n1Var.getPaddingTop();
            } else {
                f9 = y1Var.b();
                y1Var.f18857n = f9;
                paddingTop = n1Var.getPaddingTop();
            }
            n1.w1(n1Var, i11, ((int) (f9 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
