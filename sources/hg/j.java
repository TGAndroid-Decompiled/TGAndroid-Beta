package hg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f10625a;
    public final s f10626b;

    public j(s sVar, int i9) {
        this.f10625a = i9;
        this.f10626b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10625a) {
            case 0:
                s sVar = this.f10626b;
                sVar.f10727w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f10721c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f10626b;
                sVar2.f10727w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f10721c.getMeasuredHeight());
                return;
        }
    }
}
