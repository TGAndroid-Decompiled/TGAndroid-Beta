package ci;

import android.animation.ValueAnimator;
public final class ta implements ValueAnimator.AnimatorUpdateListener {
    public final int f5571a;
    public final lc f5572b;

    public ta(lc lcVar, int i10) {
        this.f5571a = i10;
        this.f5572b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5571a) {
            case 0:
                this.f5572b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5572b.f5081r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5572b.f5081r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5572b.f5085s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5572b.f5085s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lc lcVar = this.f5572b;
                lcVar.getClass();
                lcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.o();
                lcVar.f5079r.invalidate();
                lcVar.f5066n.invalidate();
                return;
        }
    }
}
