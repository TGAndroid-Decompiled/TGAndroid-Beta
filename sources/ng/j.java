package ng;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f16090a;
    public final s f16091b;

    public j(s sVar, int i10) {
        this.f16090a = i10;
        this.f16091b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16090a) {
            case 0:
                s sVar = this.f16091b;
                sVar.f16217w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f16211c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f16091b;
                sVar2.f16217w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f16211c.getMeasuredHeight());
                return;
        }
    }
}
