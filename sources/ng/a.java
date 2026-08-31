package ng;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f15990a;
    public final b f15991b;
    public final f0 f15992c;

    public a(b bVar, f0 f0Var, int i10) {
        this.f15990a = i10;
        this.f15991b = bVar;
        this.f15992c = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15990a) {
            case 0:
                this.f15991b.f16000f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f15992c.invalidate();
                return;
            default:
                this.f15991b.f16000f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f15992c.invalidate();
                return;
        }
    }
}
