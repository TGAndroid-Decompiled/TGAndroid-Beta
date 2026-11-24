package defpackage;

import android.animation.ValueAnimator;
public final class av3 implements p8c {
    public final byte a;
    public final ew3 b;

    public av3(ew3 ew3Var, byte b) {
        this.a = b;
        this.b = ew3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ew3 ew3Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                ww0 ww0Var = ew3Var.c;
                boolean z = ew3Var.u1;
                boolean z2 = ew3Var.d;
                if (z != z2) {
                    ew3Var.u1 = z2;
                    ww0Var.clearAnimation();
                    float f = 0.0f;
                    if (ew3Var.d) {
                        int i = gl.q.y;
                        int i2 = ew3Var.f;
                        f = Math.min(0.0f, Math.max(((i - i2) * 0.3f) - ew3Var.x1, (-i2) / 3.0f));
                    }
                    ww0Var.animate().translationY(f).setDuration(250L).setInterpolator(gb.w).start();
                    return;
                }
                return;
            case 1:
                vq1 vq1Var = ew3Var.p1;
                ValueAnimator valueAnimator = vq1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && vq1Var.getCurrentPosition() != num.intValue()) {
                    vq1Var.E(num.intValue());
                    dw3 dw3Var = ew3Var.q1;
                    dw3Var.G = num.intValue();
                    dw3Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i3 = ew3.C1;
                ew3Var.H0(intValue);
                return;
        }
    }
}
