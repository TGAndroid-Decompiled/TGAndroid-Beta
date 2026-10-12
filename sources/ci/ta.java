package ci;

import android.animation.ValueAnimator;
public final class ta implements ValueAnimator.AnimatorUpdateListener {
    public final int f6025a;
    public final lc f6026b;

    public ta(lc lcVar, int i10) {
        this.f6025a = i10;
        this.f6026b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6025a) {
            case 0:
                this.f6026b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f6026b.f5512r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f6026b.f5512r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f6026b.f5516s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f6026b.f5516s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lc lcVar = this.f6026b;
                lcVar.getClass();
                lcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.n();
                lcVar.f5510r.invalidate();
                lcVar.f5497n.invalidate();
                return;
        }
    }
}
