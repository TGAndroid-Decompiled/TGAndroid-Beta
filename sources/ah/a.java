package ah;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f636a;
    public final c f637b;
    public final w0 f638c;

    public a(c cVar, w0 w0Var, int i10) {
        this.f636a = i10;
        this.f637b = cVar;
        this.f638c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f636a) {
            case 0:
                this.f637b.f665f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f638c.invalidate();
                return;
            default:
                this.f637b.f665f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f638c.invalidate();
                return;
        }
    }
}
