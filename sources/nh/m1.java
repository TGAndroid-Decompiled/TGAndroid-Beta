package nh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15601a;
    public final o1 f15602b;

    public m1(o1 o1Var, int i10) {
        this.f15601a = i10;
        this.f15602b = o1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15601a) {
            case 0:
                this.f15602b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o1 o1Var = this.f15602b;
                o1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.f15696n = floatValue;
                View view = o1Var.f15693b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - o1Var.f15696n);
                view.setScaleY(1.0f - o1Var.f15696n);
                o1Var.f15694c.setColorFilter(new PorterDuffColorFilter(i0.a.d(o1Var.f15696n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                o1Var.f15692a.invalidate();
                return;
        }
    }
}
