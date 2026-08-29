package kg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f13736a;
    public final s f13737b;

    public j(s sVar, int i10) {
        this.f13736a = i10;
        this.f13737b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13736a) {
            case 0:
                s sVar = this.f13737b;
                sVar.f13862w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f13856c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f13737b;
                sVar2.f13862w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f13856c.getMeasuredHeight());
                return;
        }
    }
}
