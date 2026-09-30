package ci;

import android.animation.ValueAnimator;
public final class ta implements ValueAnimator.AnimatorUpdateListener {
    public final int f5580a;
    public final lc f5581b;

    public ta(lc lcVar, int i10) {
        this.f5580a = i10;
        this.f5581b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5580a) {
            case 0:
                this.f5581b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5581b.f5088r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5581b.f5088r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5581b.f5092s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5581b.f5092s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lc lcVar = this.f5581b;
                lcVar.getClass();
                lcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.o();
                lcVar.f5086r.invalidate();
                lcVar.f5073n.invalidate();
                return;
        }
    }
}
