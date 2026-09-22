package ci;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5715a;
    public final oc f5716b;

    public wa(oc ocVar, int i10) {
        this.f5715a = i10;
        this.f5716b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5715a) {
            case 0:
                this.f5716b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f5716b.f5258r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f5716b.f5258r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f5716b.f5262s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f5716b.f5262s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                oc ocVar = this.f5716b;
                ocVar.getClass();
                ocVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.o();
                ocVar.f5256r.invalidate();
                ocVar.f5243n.invalidate();
                return;
        }
    }
}
