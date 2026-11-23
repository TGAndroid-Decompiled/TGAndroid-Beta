package hi;

import android.content.Context;
import org.telegram.ui.Components.lv;
public final class e2 extends lv {
    public final g2 f14365h0;

    public e2(g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29786v6, i6Var), false);
        this.f14365h0 = g2Var;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        k2 k2Var;
        g2 g2Var = this.f14365h0;
        w1 w1Var = g2Var.f14520b;
        f2 f2Var = g2Var.f14521c;
        l2 l2Var = g2Var.f14523f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (l2Var != null && (k2Var = l2Var.h) != null) {
            if (k2Var.getSelectedCategory() != null) {
                w1.z1(w1Var, 0, 0);
                l2Var.h.I1(null);
            }
            l2Var.h.G1();
            l2Var.b();
        }
        if (f2Var != null) {
            f2Var.D(null);
        }
        while (true) {
            if (i11 < f2Var.E.size()) {
                i10 = f2Var.E.keyAt(i11);
                if (f2Var.E.valueAt(i11) == i7) {
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            float f10 = g2Var.f14524n;
            if (f10 >= 0.0f) {
                paddingTop = w1Var.getPaddingTop();
            } else {
                f10 = g2Var.b();
                g2Var.f14524n = f10;
                paddingTop = w1Var.getPaddingTop();
            }
            w1.z1(w1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
