package defpackage;

import android.animation.ValueAnimator;
public final class nkc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qkc b;

    public nkc(qkc qkcVar, byte b) {
        this.a = b;
        this.b = qkcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qkc qkcVar = this.b;
        switch (b) {
            case 0:
                qkcVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qkcVar.invalidate();
                return;
            case 1:
                qkcVar.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qkcVar.invalidate();
                return;
            case 2:
                qkcVar.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qkcVar.invalidate();
                return;
            default:
                qkcVar.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qkcVar.invalidate();
                return;
        }
    }
}
