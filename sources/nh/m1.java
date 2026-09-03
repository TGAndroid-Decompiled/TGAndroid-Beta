package nh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15581a;
    public final o1 f15582b;

    public m1(o1 o1Var, int i10) {
        this.f15581a = i10;
        this.f15582b = o1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15581a) {
            case 0:
                this.f15582b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o1 o1Var = this.f15582b;
                o1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.f15676n = floatValue;
                View view = o1Var.f15673b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - o1Var.f15676n);
                view.setScaleY(1.0f - o1Var.f15676n);
                o1Var.f15674c.setColorFilter(new PorterDuffColorFilter(i0.a.d(o1Var.f15676n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                o1Var.f15672a.invalidate();
                return;
        }
    }
}
