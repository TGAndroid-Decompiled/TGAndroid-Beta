package hh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class a5 implements ValueAnimator.AnimatorUpdateListener {

    public final int f8952a;

    public final e5 f8953b;

    public a5(e5 e5Var, int i10) {
        this.f8952a = i10;
        this.f8953b = e5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8952a) {
            case 0:
                e5 e5Var = this.f8953b;
                e5Var.getClass();
                e5Var.f9191o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.d(e5Var.Q);
                break;
            case 1:
                e5 e5Var2 = this.f8953b;
                e5Var2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fX = com.google.android.recaptcha.internal.a.x((float) Math.pow((fFloatValue * 2.0f) - 2.0f, 2.0d), 0.075f, fFloatValue, 1.0f);
                e5Var2.f9192p0 = fX;
                FrameLayout frameLayout = e5Var2.f9174b;
                frameLayout.setScaleX(fX);
                frameLayout.setScaleY(e5Var2.f9192p0);
                e5Var2.invalidate();
                break;
            default:
                e5 e5Var3 = this.f8953b;
                e5Var3.getClass();
                e5Var3.f9191o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var3.d(e5Var3.Q);
                break;
        }
    }
}
