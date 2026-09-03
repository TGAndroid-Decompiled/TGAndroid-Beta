package mg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f14010a;
    public final s f14011b;

    public j(s sVar, int i10) {
        this.f14010a = i10;
        this.f14011b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14010a) {
            case 0:
                s sVar = this.f14011b;
                sVar.f14130w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f14125c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f14011b;
                sVar2.f14130w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f14125c.getMeasuredHeight());
                return;
        }
    }
}
