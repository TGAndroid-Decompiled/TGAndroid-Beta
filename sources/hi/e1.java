package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.x10;
public final class e1 implements x10 {
    public final int f14523a;
    public final j2 f14524b;

    public e1(j2 j2Var, int i7) {
        this.f14523a = i7;
        this.f14524b = j2Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14523a;
        j2 j2Var = this.f14524b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = j2Var.f30195c;
                boolean z10 = j2Var.f14804v1;
                boolean z11 = j2Var.d;
                if (z10 != z11) {
                    j2Var.f14804v1 = z11;
                    n2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (j2Var.d) {
                        int i10 = org.telegram.messenger.g0.f24121q.y;
                        int i11 = j2Var.f30203f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - j2Var.f14807y1, (-i11) / 3.0f));
                    }
                    n2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.j1.f29019w).start();
                    return;
                }
                return;
            case 1:
                i1 i1Var = j2Var.f14799q1;
                ValueAnimator valueAnimator = i1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.A(num.intValue());
                    i2 i2Var = j2Var.f14800r1;
                    i2Var.G = num.intValue();
                    i2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i12 = j2.C1;
                j2Var.N0(intValue);
                return;
        }
    }
}
