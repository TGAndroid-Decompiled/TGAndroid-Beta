package defpackage;

import android.animation.ValueAnimator;
public final class umc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wmc b;

    public umc(wmc wmcVar, byte b) {
        this.a = b;
        this.b = wmcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wmc wmcVar = this.b;
        switch (b) {
            case 0:
                wmcVar.getClass();
                wmcVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                wmcVar.U.c();
                return;
            case 1:
                wmcVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmcVar.invalidate();
                wmcVar.U.c();
                return;
            case 2:
                wmcVar.getClass();
                wmcVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                wmcVar.U.c();
                return;
            case 3:
                wmcVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                return;
            case 4:
                wmcVar.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                return;
            default:
                wmcVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                wmcVar.invalidate();
                return;
        }
    }
}
