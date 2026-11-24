package defpackage;

import android.animation.ValueAnimator;
public final class pw implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sw b;

    public pw(sw swVar, byte b) {
        this.a = b;
        this.b = swVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sw swVar = this.b;
        switch (b) {
            case 0:
                swVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                swVar.c.invalidate();
                swVar.s();
                swVar.r();
                return;
            case 1:
                swVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                swVar.A();
                swVar.s();
                swVar.r();
                return;
            default:
                swVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!swVar.n) {
                    swVar.A();
                }
                swVar.s();
                swVar.r();
                return;
        }
    }
}
