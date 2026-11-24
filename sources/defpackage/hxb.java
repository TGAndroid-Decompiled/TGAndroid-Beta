package defpackage;

import android.animation.ValueAnimator;
public final class hxb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final jxb b;

    public hxb(jxb jxbVar, byte b) {
        this.a = b;
        this.b = jxbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jxb jxbVar = this.b;
        switch (b) {
            case 0:
                jxbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jxbVar.h();
                jxbVar.g();
                return;
            default:
                jxbVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                jxbVar.h.invalidate();
                return;
        }
    }
}
