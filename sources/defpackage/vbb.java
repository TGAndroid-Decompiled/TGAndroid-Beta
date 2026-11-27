package defpackage;

import android.animation.ValueAnimator;
public final class vbb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ybb b;

    public vbb(ybb ybbVar, byte b) {
        this.a = b;
        this.b = ybbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ybb ybbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = ybbVar.s0;
                lcbVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.V();
                return;
            default:
                lcb lcbVar2 = ybbVar.s0;
                lcbVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar2.V();
                return;
        }
    }
}
