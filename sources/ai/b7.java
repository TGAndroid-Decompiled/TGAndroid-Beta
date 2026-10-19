package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class b7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1039a;
    public final f7 f1040b;

    public b7(f7 f7Var, int i10) {
        this.f1039a = i10;
        this.f1040b = f7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1039a) {
            case 0:
                f7 f7Var = this.f1040b;
                f7Var.getClass();
                f7Var.f1288v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var.d(f7Var.f1262a0);
                return;
            case 1:
                f7 f7Var2 = this.f1040b;
                f7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                f7Var2.f1290w0 = t10;
                FrameLayout frameLayout = f7Var2.f1263b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(f7Var2.f1290w0);
                f7Var2.invalidate();
                return;
            default:
                f7 f7Var3 = this.f1040b;
                f7Var3.getClass();
                f7Var3.f1288v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var3.d(f7Var3.f1262a0);
                return;
        }
    }
}
