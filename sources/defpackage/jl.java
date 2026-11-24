package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class jl implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final View b;

    public jl(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                view.setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * gm.L(4.0f)));
                return;
            default:
                float sin2 = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin2);
                view.setScaleY(sin2);
                return;
        }
    }
}
