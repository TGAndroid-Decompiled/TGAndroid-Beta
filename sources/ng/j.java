package ng;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f16088a;
    public final s f16089b;

    public j(s sVar, int i10) {
        this.f16088a = i10;
        this.f16089b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16088a) {
            case 0:
                s sVar = this.f16089b;
                sVar.f16215w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f16209c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f16089b;
                sVar2.f16215w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f16209c.getMeasuredHeight());
                return;
        }
    }
}
