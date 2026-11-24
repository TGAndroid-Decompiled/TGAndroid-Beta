package defpackage;

import android.animation.ValueAnimator;
public final class ckc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dkc b;

    public ckc(dkc dkcVar, byte b) {
        this.a = b;
        this.b = dkcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dkc dkcVar = this.b;
        switch (b) {
            case 0:
                dkcVar.getClass();
                dkcVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dkcVar.a(dkcVar.S, dkcVar.T);
                return;
            default:
                dkcVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dkcVar.invalidate();
                return;
        }
    }
}
