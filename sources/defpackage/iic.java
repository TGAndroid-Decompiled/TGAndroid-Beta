package defpackage;

import android.animation.ValueAnimator;
public final class iic implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final kic b;

    public iic(kic kicVar, byte b) {
        this.a = b;
        this.b = kicVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kic kicVar = this.b;
        switch (b) {
            case 0:
                kicVar.getClass();
                kicVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                kicVar.U.c();
                return;
            case 1:
                kicVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kicVar.invalidate();
                kicVar.U.c();
                return;
            case 2:
                kicVar.getClass();
                kicVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                kicVar.U.c();
                return;
            case 3:
                kicVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                return;
            case 4:
                kicVar.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                return;
            default:
                kicVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                return;
        }
    }
}
