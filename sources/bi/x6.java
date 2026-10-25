package bi;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class x6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5682a;
    public final b7 f5683b;

    public x6(b7 b7Var, int i10) {
        this.f5682a = i10;
        this.f5683b = b7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5682a) {
            case 0:
                b7 b7Var = this.f5683b;
                b7Var.getClass();
                b7Var.f4370v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b7Var.d(b7Var.f4344a0);
                return;
            case 1:
                b7 b7Var2 = this.f5683b;
                b7Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float u10 = c3.h0.u((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                b7Var2.f4372w0 = u10;
                FrameLayout frameLayout = b7Var2.f4345b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(b7Var2.f4372w0);
                b7Var2.invalidate();
                return;
            default:
                b7 b7Var3 = this.f5683b;
                b7Var3.getClass();
                b7Var3.f4370v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b7Var3.d(b7Var3.f4344a0);
                return;
        }
    }
}
