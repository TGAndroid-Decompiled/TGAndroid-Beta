package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mv;

public final class x1 extends mv {

    public final z1 f17030e0;

    public x1(z1 z1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, c6Var), false);
        this.f17030e0 = z1Var;
    }

    @Override
    public final boolean h(int i10) {
        int iKeyAt;
        int paddingTop;
        d2 d2Var;
        z1 z1Var = this.f17030e0;
        o1 o1Var = z1Var.f17173b;
        y1 y1Var = z1Var.f17174c;
        e2 e2Var = z1Var.f17176f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (e2Var != null && (d2Var = e2Var.f15923f) != null) {
            if (d2Var.getSelectedCategory() != null) {
                o1.w1(o1Var, 0, 0);
                e2Var.f15923f.F1(null);
            }
            e2Var.f15923f.D1();
            e2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i11 >= y1Var.f17078y.size()) {
                iKeyAt = -1;
                break;
            }
            iKeyAt = y1Var.f17078y.keyAt(i11);
            if (y1Var.f17078y.valueAt(i11) == i10) {
                break;
            }
            i11++;
        }
        if (iKeyAt >= 0) {
            float fB = z1Var.f17177n;
            if (fB >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                fB = z1Var.b();
                z1Var.f17177n = fB;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.w1(o1Var, iKeyAt, ((int) (fB + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
