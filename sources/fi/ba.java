package fi;

import android.animation.ValueAnimator;
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final int f10576a;
    public final sb f10577b;

    public ba(sb sbVar, int i10) {
        this.f10576a = i10;
        this.f10577b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10576a) {
            case 0:
                this.f10577b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f10577b.f11660r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f10577b.f11660r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f10577b.f11664s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f10577b.f11664s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sb sbVar = this.f10577b;
                sbVar.getClass();
                sbVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.n();
                sbVar.f11658r.invalidate();
                sbVar.f11645n.invalidate();
                return;
        }
    }
}
