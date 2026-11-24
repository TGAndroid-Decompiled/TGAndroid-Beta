package defpackage;

import android.animation.ValueAnimator;
public final class s53 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final x53 b;

    public s53(x53 x53Var, byte b) {
        this.a = b;
        this.b = x53Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        x53 x53Var = this.b;
        switch (b) {
            case 0:
                x53Var.getClass();
                x53Var.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                x53Var.a.invalidate();
                return;
        }
    }
}
