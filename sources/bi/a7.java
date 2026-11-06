package bi;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class a7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3454a;
    public final e7 f3455b;

    public a7(e7 e7Var, int i7) {
        this.f3454a = i7;
        this.f3455b = e7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3454a) {
            case 0:
                e7 e7Var = this.f3455b;
                e7Var.getClass();
                e7Var.f3793v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.d(e7Var.f3766a0);
                return;
            case 1:
                e7 e7Var2 = this.f3455b;
                e7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.recaptcha.internal.a.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                e7Var2.f3795w0 = x10;
                FrameLayout frameLayout = e7Var2.f3767b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(e7Var2.f3795w0);
                e7Var2.invalidate();
                return;
            default:
                e7 e7Var3 = this.f3455b;
                e7Var3.getClass();
                e7Var3.f3793v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var3.d(e7Var3.f3766a0);
                return;
        }
    }
}
