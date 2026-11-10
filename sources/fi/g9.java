package fi;

import android.animation.ValueAnimator;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12113a;
    public final va f12114b;

    public g9(va vaVar, int i7) {
        this.f12113a = i7;
        this.f12114b = vaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12113a) {
            case 0:
                this.f12114b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f12114b.f12991r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f12114b.f12991r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f12114b.f12995s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f12114b.f12995s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                va vaVar = this.f12114b;
                vaVar.getClass();
                vaVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.n();
                vaVar.f12989r.invalidate();
                vaVar.f12977n.invalidate();
                return;
        }
    }
}
