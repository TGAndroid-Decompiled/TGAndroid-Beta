package defpackage;

import android.animation.ValueAnimator;
public final class x7b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final a8b b;

    public x7b(a8b a8bVar, byte b) {
        this.a = b;
        this.b = a8bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        a8b a8bVar = this.b;
        switch (b) {
            case 0:
                m8b m8bVar = a8bVar.y0;
                m8bVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8bVar.V();
                return;
            default:
                m8b m8bVar2 = a8bVar.y0;
                m8bVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8bVar2.V();
                return;
        }
    }
}
