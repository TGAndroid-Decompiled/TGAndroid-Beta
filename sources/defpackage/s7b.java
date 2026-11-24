package defpackage;

import android.animation.ValueAnimator;
public final class s7b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final t7b b;

    public s7b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.b(valueAnimator);
                return;
            default:
                t7bVar.getClass();
                t7bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
