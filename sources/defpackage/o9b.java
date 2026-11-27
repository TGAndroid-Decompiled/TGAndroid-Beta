package defpackage;

import android.animation.ValueAnimator;
public final class o9b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final p9b b;

    public o9b(p9b p9bVar, byte b) {
        this.a = b;
        this.b = p9bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        p9b p9bVar = this.b;
        switch (b) {
            case 0:
                p9bVar.b(valueAnimator);
                return;
            default:
                p9bVar.getClass();
                p9bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
