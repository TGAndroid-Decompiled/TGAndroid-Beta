package ei;

import android.animation.ValueAnimator;
public final class z7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11297a;
    public final h8 f11298b;
    public final float f11299c;
    public final float d;

    public z7(h8 h8Var, float f10, float f11, int i3) {
        this.f11297a = i3;
        this.f11298b = h8Var;
        this.f11299c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11297a) {
            case 0:
                h8 h8Var = this.f11298b;
                h8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.f11299c, 0.0f, floatValue));
                g8 g8Var = h8Var.f10375c0;
                g8Var.f10347x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                g8Var.invalidate();
                return;
            default:
                h8 h8Var2 = this.f11298b;
                h8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.f11299c, Math.min((h8Var2.getMeasuredHeight() - h8Var2.f10393v0) - org.telegram.messenger.g0.L(64.0f), h8Var2.f10390s0.getBottom() - h8Var2.getMeasuredHeight()), floatValue2));
                g8 g8Var2 = h8Var2.f10375c0;
                g8Var2.f10347x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                g8Var2.invalidate();
                return;
        }
    }
}
