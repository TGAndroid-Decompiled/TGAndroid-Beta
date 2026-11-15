package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.z10;
public final class d1 implements z10 {
    public final int f14086a;
    public final i2 f14087b;

    public d1(i2 i2Var, int i7) {
        this.f14086a = i7;
        this.f14087b = i2Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14086a;
        i2 i2Var = this.f14087b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = i2Var.f29685c;
                boolean z10 = i2Var.f14411v1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.f14411v1 = z11;
                    k2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.f23611q.y;
                        int i11 = i2Var.f29693f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.f14414y1, (-i11) / 3.0f));
                    }
                    k2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28644w).start();
                    return;
                }
                return;
            case 1:
                i1 i1Var = i2Var.f14406q1;
                ValueAnimator valueAnimator = i1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.C(num.intValue());
                    h2 h2Var = i2Var.f14407r1;
                    h2Var.G = num.intValue();
                    h2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i12 = i2.C1;
                i2Var.M0(intValue);
                return;
        }
    }
}
