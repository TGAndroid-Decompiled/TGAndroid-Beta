package mg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f14022a;
    public final s f14023b;

    public j(s sVar, int i10) {
        this.f14022a = i10;
        this.f14023b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14022a) {
            case 0:
                s sVar = this.f14023b;
                sVar.f14142w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f14137c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f14023b;
                sVar2.f14142w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f14137c.getMeasuredHeight());
                return;
        }
    }
}
