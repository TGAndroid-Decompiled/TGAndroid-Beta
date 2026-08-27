package lh;

import android.animation.ValueAnimator;

public final class ea implements ValueAnimator.AnimatorUpdateListener {

    public final int f15938a;

    public final sb f15939b;

    public ea(sb sbVar, int i10) {
        this.f15938a = i10;
        this.f15939b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15938a) {
            case 0:
                this.f15939b.I0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f15939b.f16785n1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.f15939b.f16785n1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                this.f15939b.f16788o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                this.f15939b.f16788o1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                sb sbVar = this.f15939b;
                sbVar.getClass();
                sbVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.o();
                sbVar.f16796r.invalidate();
                sbVar.f16783n.invalidate();
                break;
        }
    }
}
