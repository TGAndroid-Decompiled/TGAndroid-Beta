package ci;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class b6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4876a;
    public final f6 f4877b;

    public b6(f6 f6Var, int i3) {
        this.f4876a = i3;
        this.f4877b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4876a) {
            case 0:
                f6 f6Var = this.f4877b;
                f6Var.getClass();
                f6Var.f5113w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.d(f6Var.f5086b0);
                return;
            case 1:
                f6 f6Var2 = this.f4877b;
                f6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float v = com.google.android.recaptcha.internal.a.v((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                f6Var2.f5115x0 = v;
                FrameLayout frameLayout = f6Var2.f5085b;
                frameLayout.setScaleX(v);
                frameLayout.setScaleY(f6Var2.f5115x0);
                f6Var2.invalidate();
                return;
            default:
                f6 f6Var3 = this.f4877b;
                f6Var3.getClass();
                f6Var3.f5113w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var3.d(f6Var3.f5086b0);
                return;
        }
    }
}
