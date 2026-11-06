package fi;

import android.animation.ValueAnimator;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12109a;
    public final va f12110b;

    public g9(va vaVar, int i7) {
        this.f12109a = i7;
        this.f12110b = vaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12109a) {
            case 0:
                this.f12110b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f12110b.f12989r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f12110b.f12989r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f12110b.f12993s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f12110b.f12993s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                va vaVar = this.f12110b;
                vaVar.getClass();
                vaVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.n();
                vaVar.f12987r.invalidate();
                vaVar.f12975n.invalidate();
                return;
        }
    }
}
