package defpackage;

import android.animation.ValueAnimator;
public final class zmc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final cnc b;

    public zmc(cnc cncVar, byte b) {
        this.a = b;
        this.b = cncVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cnc cncVar = this.b;
        switch (b) {
            case 0:
                cncVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cncVar.invalidate();
                return;
            case 1:
                cncVar.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cncVar.invalidate();
                return;
            case 2:
                cncVar.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cncVar.invalidate();
                return;
            default:
                cncVar.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cncVar.invalidate();
                return;
        }
    }
}
