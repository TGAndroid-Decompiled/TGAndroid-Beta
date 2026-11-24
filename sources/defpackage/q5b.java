package defpackage;

import android.animation.ValueAnimator;
public final class q5b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final r5b b;

    public q5b(r5b r5bVar, byte b) {
        this.a = b;
        this.b = r5bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        r5b r5bVar = this.b;
        switch (b) {
            case 0:
                r5bVar.b(valueAnimator);
                return;
            default:
                r5bVar.getClass();
                r5bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
