package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class a7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f960a;
    public final e7 f961b;

    public a7(e7 e7Var, int i10) {
        this.f960a = i10;
        this.f961b = e7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f960a) {
            case 0:
                e7 e7Var = this.f961b;
                e7Var.getClass();
                e7Var.f1237v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.d(e7Var.f1211a0);
                return;
            case 1:
                e7 e7Var2 = this.f961b;
                e7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                e7Var2.f1239w0 = t10;
                FrameLayout frameLayout = e7Var2.f1212b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(e7Var2.f1239w0);
                e7Var2.invalidate();
                return;
            default:
                e7 e7Var3 = this.f961b;
                e7Var3.getClass();
                e7Var3.f1237v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var3.d(e7Var3.f1211a0);
                return;
        }
    }
}
