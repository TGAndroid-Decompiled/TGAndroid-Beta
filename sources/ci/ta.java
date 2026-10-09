package ci;

import android.animation.ValueAnimator;
public final class ta implements ValueAnimator.AnimatorUpdateListener {
    public final int f6027a;
    public final lc f6028b;

    public ta(lc lcVar, int i10) {
        this.f6027a = i10;
        this.f6028b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6027a) {
            case 0:
                this.f6028b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f6028b.f5514r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f6028b.f5514r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f6028b.f5518s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f6028b.f5518s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lc lcVar = this.f6028b;
                lcVar.getClass();
                lcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.n();
                lcVar.f5512r.invalidate();
                lcVar.f5499n.invalidate();
                return;
        }
    }
}
