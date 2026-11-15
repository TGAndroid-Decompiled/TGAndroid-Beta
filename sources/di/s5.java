package di;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9395a;
    public final w5 f9396b;

    public s5(w5 w5Var, int i7) {
        this.f9395a = i7;
        this.f9396b = w5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9395a) {
            case 0:
                w5 w5Var = this.f9396b;
                w5Var.getClass();
                w5Var.f9687w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.d(w5Var.f9660b0);
                return;
            case 1:
                w5 w5Var2 = this.f9396b;
                w5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                w5Var2.f9689x0 = x10;
                FrameLayout frameLayout = w5Var2.f9659b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(w5Var2.f9689x0);
                w5Var2.invalidate();
                return;
            default:
                w5 w5Var3 = this.f9396b;
                w5Var3.getClass();
                w5Var3.f9687w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var3.d(w5Var3.f9660b0);
                return;
        }
    }
}
