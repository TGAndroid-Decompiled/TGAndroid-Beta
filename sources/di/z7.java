package di;

import android.animation.ValueAnimator;
public final class z7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10015a;
    public final i8 f10016b;
    public final float f10017c;
    public final float d;

    public z7(i8 i8Var, float f10, float f11, int i7) {
        this.f10015a = i7;
        this.f10016b = i8Var;
        this.f10017c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10015a) {
            case 0:
                i8 i8Var = this.f10016b;
                i8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.f10017c, 0.0f, floatValue));
                h8 h8Var = i8Var.f9125b0;
                h8Var.f9086x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                h8Var.invalidate();
                return;
            default:
                i8 i8Var2 = this.f10016b;
                i8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.f10017c, Math.min((i8Var2.getMeasuredHeight() - i8Var2.f9143u0) - org.telegram.messenger.g0.L(64.0f), i8Var2.f9140r0.getBottom() - i8Var2.getMeasuredHeight()), floatValue2));
                h8 h8Var2 = i8Var2.f9125b0;
                h8Var2.f9086x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                h8Var2.invalidate();
                return;
        }
    }
}
