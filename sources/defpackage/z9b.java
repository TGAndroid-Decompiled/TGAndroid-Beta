package defpackage;

import android.animation.ValueAnimator;
public final class z9b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final cab b;

    public z9b(cab cabVar, byte b) {
        this.a = b;
        this.b = cabVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cab cabVar = this.b;
        switch (b) {
            case 0:
                oab oabVar = cabVar.y0;
                oabVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.V();
                return;
            default:
                oab oabVar2 = cabVar.y0;
                oabVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar2.V();
                return;
        }
    }
}
