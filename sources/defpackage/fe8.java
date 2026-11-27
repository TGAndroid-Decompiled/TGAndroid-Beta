package defpackage;

import android.animation.ValueAnimator;
public final class fe8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final he8 b;

    public fe8(he8 he8Var, byte b) {
        this.a = b;
        this.b = he8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        he8 he8Var = this.b;
        switch (b) {
            case 0:
                he8Var.getClass();
                he8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                he8Var.invalidate();
                return;
            default:
                he8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                he8Var.invalidate();
                return;
        }
    }
}
