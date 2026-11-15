package fi;

import android.animation.ValueAnimator;
public final class s7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12342a;
    public final a8 f12343b;
    public final float f12344c;
    public final float d;

    public s7(a8 a8Var, float f10, float f11, int i7) {
        this.f12342a = i7;
        this.f12343b = a8Var;
        this.f12344c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12342a) {
            case 0:
                a8 a8Var = this.f12343b;
                a8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.f12344c, 0.0f, floatValue));
                z7 z7Var = a8Var.f11420c0;
                z7Var.f12603x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                return;
            default:
                a8 a8Var2 = this.f12343b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.f12344c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.f11438v0) - org.telegram.messenger.g0.L(64.0f), a8Var2.f11435s0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.f11420c0;
                z7Var2.f12603x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                return;
        }
    }
}
