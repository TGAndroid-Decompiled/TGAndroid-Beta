package kg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f13638a;
    public final b f13639b;
    public final f0 f13640c;

    public a(b bVar, f0 f0Var, int i10) {
        this.f13638a = i10;
        this.f13639b = bVar;
        this.f13640c = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13638a) {
            case 0:
                this.f13639b.f13648f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f13640c.invalidate();
                return;
            default:
                this.f13639b.f13648f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f13640c.invalidate();
                return;
        }
    }
}
