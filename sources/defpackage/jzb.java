package defpackage;

import android.animation.ValueAnimator;
public final class jzb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final lzb b;

    public jzb(lzb lzbVar, byte b) {
        this.a = b;
        this.b = lzbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        lzb lzbVar = this.b;
        switch (b) {
            case 0:
                lzbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lzbVar.h();
                lzbVar.g();
                return;
            default:
                lzbVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                lzbVar.h.invalidate();
                return;
        }
    }
}
