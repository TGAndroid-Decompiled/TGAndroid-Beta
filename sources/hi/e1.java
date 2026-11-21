package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.x10;
public final class e1 implements x10 {
    public final int f14581a;
    public final i2 f14582b;

    public e1(i2 i2Var, int i7) {
        this.f14581a = i7;
        this.f14582b = i2Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14581a;
        i2 i2Var = this.f14582b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = i2Var.f30176c;
                boolean z10 = i2Var.f14779v1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.f14779v1 = z11;
                    m2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.f24146q.y;
                        int i11 = i2Var.f30184f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.f14782y1, (-i11) / 3.0f));
                    }
                    m2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29002w).start();
                    return;
                }
                return;
            case 1:
                i1 i1Var = i2Var.f14774q1;
                ValueAnimator valueAnimator = i1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.A(num.intValue());
                    h2 h2Var = i2Var.f14775r1;
                    h2Var.G = num.intValue();
                    h2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i12 = i2.C1;
                i2Var.N0(intValue);
                return;
        }
    }
}
