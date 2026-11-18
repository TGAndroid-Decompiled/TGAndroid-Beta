package hi;

import android.content.Context;
import org.telegram.ui.Components.lv;
public final class x1 extends lv {
    public final z1 f15708h0;

    public x1(z1 z1Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29729v6, i6Var), false);
        this.f15708h0 = z1Var;
    }

    @Override
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        d2 d2Var;
        z1 z1Var = this.f15708h0;
        o1 o1Var = z1Var.f15799b;
        y1 y1Var = z1Var.f15800c;
        e2 e2Var = z1Var.f15802f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (e2Var != null && (d2Var = e2Var.h) != null) {
            if (d2Var.getSelectedCategory() != null) {
                o1.z1(o1Var, 0, 0);
                e2Var.h.I1(null);
            }
            e2Var.h.G1();
            e2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i11 < y1Var.E.size()) {
                i10 = y1Var.E.keyAt(i11);
                if (y1Var.E.valueAt(i11) == i7) {
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            float f10 = z1Var.f15803n;
            if (f10 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f10 = z1Var.b();
                z1Var.f15803n = f10;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.z1(o1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
