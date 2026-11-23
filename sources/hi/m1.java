package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.w10;
public final class m1 implements w10 {
    public final int f14878a;
    public final r2 f14879b;

    public m1(r2 r2Var, int i7) {
        this.f14878a = i7;
        this.f14879b = r2Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14878a;
        r2 r2Var = this.f14879b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = r2Var.f30229c;
                boolean z10 = r2Var.f15284v1;
                boolean z11 = r2Var.d;
                if (z10 != z11) {
                    r2Var.f15284v1 = z11;
                    m2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (r2Var.d) {
                        int i10 = org.telegram.messenger.g0.f24226q.y;
                        int i11 = r2Var.f30237f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - r2Var.f15287y1, (-i11) / 3.0f));
                    }
                    m2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29066w).start();
                    return;
                }
                return;
            case 1:
                q1 q1Var = r2Var.f15279q1;
                ValueAnimator valueAnimator = q1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && q1Var.getCurrentPosition() != num.intValue()) {
                    q1Var.C(num.intValue());
                    q2 q2Var = r2Var.f15280r1;
                    q2Var.G = num.intValue();
                    q2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i12 = r2.D1;
                r2Var.N0(intValue);
                return;
        }
    }
}
