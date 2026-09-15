package ci;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5711a;
    public final oc f5712b;

    public wa(oc ocVar, int i10) {
        this.f5711a = i10;
        this.f5712b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5711a) {
            case 0:
                this.f5712b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5712b.f5254r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5712b.f5254r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5712b.f5258s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5712b.f5258s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                oc ocVar = this.f5712b;
                ocVar.getClass();
                ocVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.o();
                ocVar.f5252r.invalidate();
                ocVar.f5239n.invalidate();
                return;
        }
    }
}
