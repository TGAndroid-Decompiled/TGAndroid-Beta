package fi;

import android.animation.ValueAnimator;
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final int f10575a;
    public final sb f10576b;

    public ba(sb sbVar, int i10) {
        this.f10575a = i10;
        this.f10576b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10575a) {
            case 0:
                this.f10576b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f10576b.f11659r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f10576b.f11659r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f10576b.f11663s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f10576b.f11663s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sb sbVar = this.f10576b;
                sbVar.getClass();
                sbVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.n();
                sbVar.f11657r.invalidate();
                sbVar.f11644n.invalidate();
                return;
        }
    }
}
