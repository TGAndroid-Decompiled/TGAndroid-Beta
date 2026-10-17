package ah;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f638a;
    public final c f639b;
    public final w0 f640c;

    public a(c cVar, w0 w0Var, int i10) {
        this.f638a = i10;
        this.f639b = cVar;
        this.f640c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f638a) {
            case 0:
                this.f639b.f667f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f640c.invalidate();
                return;
            default:
                this.f639b.f667f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f640c.invalidate();
                return;
        }
    }
}
