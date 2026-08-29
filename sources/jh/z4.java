package jh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class z4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13169a;
    public final d5 f13170b;

    public z4(d5 d5Var, int i10) {
        this.f13169a = i10;
        this.f13170b = d5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13169a) {
            case 0:
                d5 d5Var = this.f13170b;
                d5Var.getClass();
                d5Var.f11924o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.d(d5Var.Q);
                return;
            case 1:
                d5 d5Var2 = this.f13170b;
                d5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x4 = com.google.android.recaptcha.internal.a.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                d5Var2.f11925p0 = x4;
                FrameLayout frameLayout = d5Var2.f11907b;
                frameLayout.setScaleX(x4);
                frameLayout.setScaleY(d5Var2.f11925p0);
                d5Var2.invalidate();
                return;
            default:
                d5 d5Var3 = this.f13170b;
                d5Var3.getClass();
                d5Var3.f11924o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var3.d(d5Var3.Q);
                return;
        }
    }
}
