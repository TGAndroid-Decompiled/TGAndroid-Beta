package defpackage;

import android.animation.ValueAnimator;
public final class lw3 implements qac {
    public final byte a;
    public final px3 b;

    public lw3(px3 px3Var, byte b) {
        this.a = b;
        this.b = px3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        px3 px3Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                dy0 dy0Var = px3Var.c;
                boolean z = px3Var.u1;
                boolean z2 = px3Var.d;
                if (z != z2) {
                    px3Var.u1 = z2;
                    dy0Var.clearAnimation();
                    float f = 0.0f;
                    if (px3Var.d) {
                        int i = gm.q.y;
                        int i2 = px3Var.f;
                        f = Math.min(0.0f, Math.max(((i - i2) * 0.3f) - px3Var.x1, (-i2) / 3.0f));
                    }
                    dy0Var.animate().translationY(f).setDuration(250L).setInterpolator(gb.w).start();
                    return;
                }
                return;
            case 1:
                hs1 hs1Var = px3Var.p1;
                ValueAnimator valueAnimator = hs1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && hs1Var.getCurrentPosition() != num.intValue()) {
                    hs1Var.E(num.intValue());
                    ox3 ox3Var = px3Var.q1;
                    ox3Var.G = num.intValue();
                    ox3Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i3 = px3.C1;
                px3Var.H0(intValue);
                return;
        }
    }
}
