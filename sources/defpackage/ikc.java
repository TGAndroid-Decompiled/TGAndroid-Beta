package defpackage;

import android.animation.ValueAnimator;
public final class ikc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final kkc b;

    public ikc(kkc kkcVar, byte b) {
        this.a = b;
        this.b = kkcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kkc kkcVar = this.b;
        switch (b) {
            case 0:
                kkcVar.getClass();
                kkcVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kkcVar.invalidate();
                kkcVar.U.c();
                return;
            case 1:
                kkcVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kkcVar.invalidate();
                kkcVar.U.c();
                return;
            case 2:
                kkcVar.getClass();
                kkcVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kkcVar.invalidate();
                kkcVar.U.c();
                return;
            case 3:
                kkcVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kkcVar.invalidate();
                return;
            case 4:
                kkcVar.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kkcVar.invalidate();
                return;
            default:
                kkcVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kkcVar.invalidate();
                return;
        }
    }
}
