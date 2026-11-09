package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.c20;
public final class c1 implements c20 {
    public final int f11722a;
    public final k2 f11723b;

    public c1(k2 k2Var, int i7) {
        this.f11722a = i7;
        this.f11723b = k2Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f11722a;
        k2 k2Var = this.f11723b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.l2 l2Var = k2Var.f28627c;
                boolean z9 = k2Var.f12259r1;
                boolean z10 = k2Var.d;
                if (z9 != z10) {
                    k2Var.f12259r1 = z10;
                    l2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (k2Var.d) {
                        int i10 = org.telegram.messenger.g0.f22563q.y;
                        int i11 = k2Var.f28635f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - k2Var.f12262u1, (-i11) / 3.0f));
                    }
                    l2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27519w).start();
                    return;
                }
                return;
            case 1:
                g1 g1Var = k2Var.f12255m1;
                ValueAnimator valueAnimator = g1Var.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && g1Var.getCurrentPosition() != num.intValue()) {
                    g1Var.E(num.intValue());
                    j2 j2Var = k2Var.n1;
                    j2Var.F = num.intValue();
                    j2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i12 = k2.f12251y1;
                k2Var.M0(intValue);
                return;
        }
    }
}
