package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.y10;
public final class d1 implements y10 {
    public final int f14320a;
    public final i2 f14321b;

    public d1(i2 i2Var, int i7) {
        this.f14320a = i7;
        this.f14321b = i2Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14320a;
        i2 i2Var = this.f14321b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = i2Var.f30145c;
                boolean z10 = i2Var.f14712v1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.f14712v1 = z11;
                    m2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.f24010q.y;
                        int i11 = i2Var.f30153f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.f14715y1, (-i11) / 3.0f));
                    }
                    m2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28971w).start();
                    return;
                }
                return;
            case 1:
                h1 h1Var = i2Var.f14707q1;
                ValueAnimator valueAnimator = h1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.A(num.intValue());
                    h2 h2Var = i2Var.f14708r1;
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
