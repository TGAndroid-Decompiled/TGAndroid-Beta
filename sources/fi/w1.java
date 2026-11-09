package fi;

import android.content.Context;
import org.telegram.ui.Components.bv;
public final class w1 extends bv {
    public final z1 f13025g0;

    public w1(z1 z1Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, g6Var), false);
        this.f13025g0 = z1Var;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        d2 d2Var;
        z1 z1Var = this.f13025g0;
        m1 m1Var = z1Var.f13235b;
        y1 y1Var = z1Var.f13236c;
        e2 e2Var = z1Var.f13238f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (e2Var != null && (d2Var = e2Var.h) != null) {
            if (d2Var.getSelectedCategory() != null) {
                m1.z1(m1Var, 0, 0);
                e2Var.h.I1(null);
            }
            e2Var.h.G1();
            e2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i11 < y1Var.D.size()) {
                i10 = y1Var.D.keyAt(i11);
                if (y1Var.D.valueAt(i11) == i7) {
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            float f10 = z1Var.f13239n;
            if (f10 >= 0.0f) {
                paddingTop = m1Var.getPaddingTop();
            } else {
                f10 = z1Var.b();
                z1Var.f13239n = f10;
                paddingTop = m1Var.getPaddingTop();
            }
            m1.z1(m1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
