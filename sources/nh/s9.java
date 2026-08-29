package nh;

import android.animation.ValueAnimator;
public final class s9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18555a;
    public final gb f18556b;

    public s9(gb gbVar, int i10) {
        this.f18555a = i10;
        this.f18556b = gbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18555a) {
            case 0:
                this.f18556b.I0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f18556b.f17779n1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f18556b.f17779n1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f18556b.f17782o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f18556b.f17782o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                gb gbVar = this.f18556b;
                gbVar.getClass();
                gbVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.o();
                gbVar.f17790r.invalidate();
                gbVar.f17777n.invalidate();
                return;
        }
    }
}
