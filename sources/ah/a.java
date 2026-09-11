package ah;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f435a;
    public final c f436b;
    public final x0 f437c;

    public a(c cVar, x0 x0Var, int i10) {
        this.f435a = i10;
        this.f436b = cVar;
        this.f437c = x0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f435a) {
            case 0:
                this.f436b.f468f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f437c.invalidate();
                return;
            default:
                this.f436b.f468f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f437c.invalidate();
                return;
        }
    }
}
