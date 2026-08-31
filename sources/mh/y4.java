package mh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15094a;
    public final c5 f15095b;

    public y4(c5 c5Var, int i10) {
        this.f15094a = i10;
        this.f15095b = c5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15094a) {
            case 0:
                c5 c5Var = this.f15095b;
                c5Var.getClass();
                c5Var.f13815p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.d(c5Var.R);
                return;
            case 1:
                c5 c5Var2 = this.f15095b;
                c5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float u10 = e2.c.u((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                c5Var2.f13816q0 = u10;
                FrameLayout frameLayout = c5Var2.f13797b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(c5Var2.f13816q0);
                c5Var2.invalidate();
                return;
            default:
                c5 c5Var3 = this.f15095b;
                c5Var3.getClass();
                c5Var3.f13815p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var3.d(c5Var3.R);
                return;
        }
    }
}
