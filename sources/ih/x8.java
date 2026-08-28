package ih;

import android.animation.ValueAnimator;
public final class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12330a;
    public final a9 f12331b;

    public x8(a9 a9Var, int i9) {
        this.f12330a = i9;
        this.f12331b = a9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12330a) {
            case 0:
                m9 m9Var = this.f12331b.E0;
                m9Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9.k(m9Var);
                return;
            default:
                m9 m9Var2 = this.f12331b.E0;
                m9Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9.k(m9Var2);
                return;
        }
    }
}
