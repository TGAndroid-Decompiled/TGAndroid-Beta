package defpackage;

import android.animation.ValueAnimator;
public final class cic implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dic b;

    public cic(dic dicVar, byte b) {
        this.a = b;
        this.b = dicVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dic dicVar = this.b;
        switch (b) {
            case 0:
                dicVar.getClass();
                dicVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.a(dicVar.S, dicVar.T);
                return;
            default:
                dicVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.invalidate();
                return;
        }
    }
}
