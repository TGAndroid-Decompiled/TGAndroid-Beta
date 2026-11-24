package defpackage;

import android.animation.ValueAnimator;
public final class nic implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qic b;

    public nic(qic qicVar, byte b) {
        this.a = b;
        this.b = qicVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qic qicVar = this.b;
        switch (b) {
            case 0:
                qicVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qicVar.invalidate();
                return;
            case 1:
                qicVar.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qicVar.invalidate();
                return;
            case 2:
                qicVar.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qicVar.invalidate();
                return;
            default:
                qicVar.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qicVar.invalidate();
                return;
        }
    }
}
