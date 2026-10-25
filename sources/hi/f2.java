package hi;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12981a;
    public final m3 f12982b;

    public f2(m3 m3Var, int i10) {
        this.f12981a = i10;
        this.f12982b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12981a) {
            case 0:
                m3 m3Var = this.f12982b;
                m3Var.getClass();
                m3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.h();
                return;
            default:
                this.f12982b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
