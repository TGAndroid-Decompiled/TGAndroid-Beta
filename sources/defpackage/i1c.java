package defpackage;

import android.animation.ValueAnimator;
public final class i1c implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final k1c b;

    public i1c(k1c k1cVar, byte b) {
        this.a = b;
        this.b = k1cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        k1c k1cVar = this.b;
        switch (b) {
            case 0:
                k1cVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1cVar.h();
                k1cVar.g();
                return;
            default:
                k1cVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k1cVar.h.invalidate();
                return;
        }
    }
}
