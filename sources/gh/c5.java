package gh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class c5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7917a;
    public final g5 f7918b;

    public c5(g5 g5Var, int i9) {
        this.f7917a = i9;
        this.f7918b = g5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7917a) {
            case 0:
                g5 g5Var = this.f7918b;
                g5Var.getClass();
                g5Var.f8125o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var.d(g5Var.Q);
                return;
            case 1:
                g5 g5Var2 = this.f7918b;
                g5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = e2.c.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                g5Var2.f8126p0 = x10;
                FrameLayout frameLayout = g5Var2.f8108b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(g5Var2.f8126p0);
                g5Var2.invalidate();
                return;
            default:
                g5 g5Var3 = this.f7918b;
                g5Var3.getClass();
                g5Var3.f8125o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var3.d(g5Var3.Q);
                return;
        }
    }
}
