package defpackage;

import android.animation.ValueAnimator;
public final class px implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sx b;

    public px(sx sxVar, byte b) {
        this.a = b;
        this.b = sxVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sx sxVar = this.b;
        switch (b) {
            case 0:
                sxVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sxVar.c.invalidate();
                sxVar.u();
                sxVar.r();
                return;
            case 1:
                sxVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sxVar.A();
                sxVar.u();
                sxVar.r();
                return;
            default:
                sxVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!sxVar.n) {
                    sxVar.A();
                }
                sxVar.u();
                sxVar.r();
                return;
        }
    }
}
