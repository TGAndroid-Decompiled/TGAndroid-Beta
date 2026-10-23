package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class b7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1035a;
    public final f7 f1036b;

    public b7(f7 f7Var, int i10) {
        this.f1035a = i10;
        this.f1036b = f7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1035a) {
            case 0:
                f7 f7Var = this.f1036b;
                f7Var.getClass();
                f7Var.f1291v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var.d(f7Var.f1265a0);
                return;
            case 1:
                f7 f7Var2 = this.f1036b;
                f7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                f7Var2.f1293w0 = t10;
                FrameLayout frameLayout = f7Var2.f1266b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(f7Var2.f1293w0);
                f7Var2.invalidate();
                return;
            default:
                f7 f7Var3 = this.f1036b;
                f7Var3.getClass();
                f7Var3.f1291v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var3.d(f7Var3.f1265a0);
                return;
        }
    }
}
