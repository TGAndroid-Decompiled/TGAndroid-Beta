package hi;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15880a;
    public final nb f15881b;

    public y9(nb nbVar, int i7) {
        this.f15880a = i7;
        this.f15881b = nbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15880a) {
            case 0:
                this.f15881b.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f15881b.f15113s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f15881b.f15113s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f15881b.f15116t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f15881b.f15116t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                nb nbVar = this.f15881b;
                nbVar.getClass();
                nbVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nbVar.n();
                nbVar.f15107r.invalidate();
                nbVar.f15095n.invalidate();
                return;
        }
    }
}
