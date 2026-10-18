package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class a7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f961a;
    public final e7 f962b;

    public a7(e7 e7Var, int i10) {
        this.f961a = i10;
        this.f962b = e7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f961a) {
            case 0:
                e7 e7Var = this.f962b;
                e7Var.getClass();
                e7Var.f1236t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.d(e7Var.V);
                return;
            case 1:
                e7 e7Var2 = this.f962b;
                e7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                e7Var2.f1237u0 = t10;
                FrameLayout frameLayout = e7Var2.f1213b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(e7Var2.f1237u0);
                e7Var2.invalidate();
                return;
            default:
                e7 e7Var3 = this.f962b;
                e7Var3.getClass();
                e7Var3.f1236t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var3.d(e7Var3.V);
                return;
        }
    }
}
