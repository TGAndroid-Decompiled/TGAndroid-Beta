package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class a7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f963a;
    public final e7 f964b;

    public a7(e7 e7Var, int i10) {
        this.f963a = i10;
        this.f964b = e7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f963a) {
            case 0:
                e7 e7Var = this.f964b;
                e7Var.getClass();
                e7Var.f1239t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.d(e7Var.V);
                return;
            case 1:
                e7 e7Var2 = this.f964b;
                e7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                e7Var2.f1240u0 = t10;
                FrameLayout frameLayout = e7Var2.f1216b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(e7Var2.f1240u0);
                e7Var2.invalidate();
                return;
            default:
                e7 e7Var3 = this.f964b;
                e7Var3.getClass();
                e7Var3.f1239t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var3.d(e7Var3.V);
                return;
        }
    }
}
