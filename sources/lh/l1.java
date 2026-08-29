package lh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15872a;
    public final n1 f15873b;

    public l1(n1 n1Var, int i10) {
        this.f15872a = i10;
        this.f15873b = n1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15872a) {
            case 0:
                this.f15873b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n1 n1Var = this.f15873b;
                n1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.f15965n = floatValue;
                View view = n1Var.f15961b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - n1Var.f15965n);
                view.setScaleY(1.0f - n1Var.f15965n);
                n1Var.f15962c.setColorFilter(new PorterDuffColorFilter(i0.a.d(n1Var.f15965n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                n1Var.f15960a.invalidate();
                return;
        }
    }
}
