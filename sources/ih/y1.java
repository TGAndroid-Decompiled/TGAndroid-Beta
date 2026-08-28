package ih;

import android.animation.ValueAnimator;
public final class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12339a;
    public final i4 f12340b;

    public y1(i4 i4Var, int i9) {
        this.f12339a = i9;
        this.f12340b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12339a) {
            case 0:
                i4 i4Var = this.f12340b;
                i4Var.getClass();
                i4Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 1:
                i4 i4Var2 = this.f12340b;
                i4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var2.f11576p3 = floatValue;
                i4Var2.f11570n3.setTransitionProgress(floatValue);
                return;
            default:
                i4.Z(this.f12340b, valueAnimator);
                return;
        }
    }
}
