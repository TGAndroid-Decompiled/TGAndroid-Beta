package di;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9923a;
    public final z5 f9924b;

    public v5(z5 z5Var, int i7) {
        this.f9923a = i7;
        this.f9924b = z5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9923a) {
            case 0:
                z5 z5Var = this.f9924b;
                z5Var.getClass();
                z5Var.f10154z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.d(z5Var.f10122b0);
                return;
            case 1:
                z5 z5Var2 = this.f9924b;
                z5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                z5Var2.A0 = x10;
                FrameLayout frameLayout = z5Var2.f10121b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                return;
            default:
                z5 z5Var3 = this.f9924b;
                z5Var3.getClass();
                z5Var3.f10154z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var3.d(z5Var3.f10122b0);
                return;
        }
    }
}
