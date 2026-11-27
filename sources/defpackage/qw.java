package defpackage;

import android.animation.ValueAnimator;
public final class qw implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tw b;

    public qw(tw twVar, byte b) {
        this.a = b;
        this.b = twVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tw twVar = this.b;
        switch (b) {
            case 0:
                twVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                twVar.c.invalidate();
                twVar.t();
                twVar.r();
                return;
            case 1:
                twVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                twVar.A();
                twVar.t();
                twVar.r();
                return;
            default:
                twVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!twVar.n) {
                    twVar.A();
                }
                twVar.t();
                twVar.r();
                return;
        }
    }
}
