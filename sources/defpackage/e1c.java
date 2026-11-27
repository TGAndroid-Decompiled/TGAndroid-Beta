package defpackage;

import android.animation.ValueAnimator;
public final class e1c implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final g1c b;

    public e1c(g1c g1cVar, byte b) {
        this.a = b;
        this.b = g1cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        g1c g1cVar = this.b;
        switch (b) {
            case 0:
                vl4 vl4Var = g1cVar.f;
                vl4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                vl4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                vl4Var.invalidate();
                return;
            default:
                g1cVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1cVar.h();
                return;
        }
    }
}
