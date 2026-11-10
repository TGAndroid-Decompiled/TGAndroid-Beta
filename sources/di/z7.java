package di;

import android.animation.ValueAnimator;
public final class z7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10020a;
    public final i8 f10021b;
    public final float f10022c;
    public final float d;

    public z7(i8 i8Var, float f10, float f11, int i7) {
        this.f10020a = i7;
        this.f10021b = i8Var;
        this.f10022c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10020a) {
            case 0:
                i8 i8Var = this.f10021b;
                i8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.f10022c, 0.0f, floatValue));
                h8 h8Var = i8Var.f9130b0;
                h8Var.f9091x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                h8Var.invalidate();
                return;
            default:
                i8 i8Var2 = this.f10021b;
                i8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.f10022c, Math.min((i8Var2.getMeasuredHeight() - i8Var2.f9148u0) - org.telegram.messenger.g0.L(64.0f), i8Var2.f9145r0.getBottom() - i8Var2.getMeasuredHeight()), floatValue2));
                h8 h8Var2 = i8Var2.f9130b0;
                h8Var2.f9091x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                h8Var2.invalidate();
                return;
        }
    }
}
