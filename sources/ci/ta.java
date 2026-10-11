package ci;

import android.animation.ValueAnimator;
public final class ta implements ValueAnimator.AnimatorUpdateListener {
    public final int f6026a;
    public final lc f6027b;

    public ta(lc lcVar, int i10) {
        this.f6026a = i10;
        this.f6027b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6026a) {
            case 0:
                this.f6027b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f6027b.f5513r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f6027b.f5513r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f6027b.f5517s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f6027b.f5517s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lc lcVar = this.f6027b;
                lcVar.getClass();
                lcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.n();
                lcVar.f5511r.invalidate();
                lcVar.f5498n.invalidate();
                return;
        }
    }
}
