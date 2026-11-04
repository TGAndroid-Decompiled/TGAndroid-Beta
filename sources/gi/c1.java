package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.u10;
public final class c1 implements u10 {
    public final int f12477a;
    public final i2 f12478b;

    public c1(i2 i2Var, int i3) {
        this.f12477a = i3;
        this.f12478b = i2Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f12477a;
        i2 i2Var = this.f12478b;
        Integer num = (Integer) obj;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.j2 j2Var = i2Var.f28589c;
                boolean z10 = i2Var.f12958s1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.f12958s1 = z11;
                    j2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.f22608q.y;
                        int i11 = i2Var.f28597f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.f12961v1, (-i11) / 3.0f));
                    }
                    j2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.f27551w).start();
                    return;
                }
                return;
            case 1:
                g1 g1Var = i2Var.f12953n1;
                ValueAnimator valueAnimator = g1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && g1Var.getCurrentPosition() != num.intValue()) {
                    g1Var.D(num.intValue());
                    h2 h2Var = i2Var.f12954o1;
                    h2Var.G = num.intValue();
                    h2Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i12 = i2.f12950z1;
                i2Var.M0(intValue);
                return;
        }
    }
}
