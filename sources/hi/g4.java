package hi;

import android.animation.ValueAnimator;
public final class g4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12998a;
    public final o4 f12999b;

    public g4(o4 o4Var, int i10) {
        this.f12998a = i10;
        this.f12999b = o4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12998a) {
            case 0:
                this.f12999b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3 e3Var = this.f12999b.f13179n;
                if (e3Var.getWebView() != null) {
                    e3Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
