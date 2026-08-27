package ig;

import android.animation.ValueAnimator;

public final class j implements ValueAnimator.AnimatorUpdateListener {

    public final int f11323a;

    public final s f11324b;

    public j(s sVar, int i10) {
        this.f11323a = i10;
        this.f11324b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11323a) {
            case 0:
                s sVar = this.f11324b;
                sVar.f11449w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f11443c.getMeasuredHeight());
                break;
            default:
                s sVar2 = this.f11324b;
                sVar2.f11449w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f11443c.getMeasuredHeight());
                break;
        }
    }
}
