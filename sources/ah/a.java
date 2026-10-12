package ah;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f632a;
    public final c f633b;
    public final w0 f634c;

    public a(c cVar, w0 w0Var, int i10) {
        this.f632a = i10;
        this.f633b = cVar;
        this.f634c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f632a) {
            case 0:
                this.f633b.f661f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f634c.invalidate();
                return;
            default:
                this.f633b.f661f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f634c.invalidate();
                return;
        }
    }
}
