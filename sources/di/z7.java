package di;

import android.animation.ValueAnimator;
public final class z7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10022a;
    public final h8 f10023b;
    public final float f10024c;
    public final float d;

    public z7(h8 h8Var, float f10, float f11, int i7) {
        this.f10022a = i7;
        this.f10023b = h8Var;
        this.f10024c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10022a) {
            case 0:
                h8 h8Var = this.f10023b;
                h8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.f10024c, 0.0f, floatValue));
                g8 g8Var = h8Var.f9095b0;
                g8Var.f9060x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                g8Var.invalidate();
                return;
            default:
                h8 h8Var2 = this.f10023b;
                h8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.f10024c, Math.min((h8Var2.getMeasuredHeight() - h8Var2.f9113u0) - org.telegram.messenger.g0.L(64.0f), h8Var2.f9110r0.getBottom() - h8Var2.getMeasuredHeight()), floatValue2));
                g8 g8Var2 = h8Var2.f9095b0;
                g8Var2.f9060x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                g8Var2.invalidate();
                return;
        }
    }
}
