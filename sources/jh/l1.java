package jh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

public final class l1 implements ValueAnimator.AnimatorUpdateListener {

    public final int f13608a;

    public final n1 f13609b;

    public l1(n1 n1Var, int i10) {
        this.f13608a = i10;
        this.f13609b = n1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13608a) {
            case 0:
                this.f13609b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n1 n1Var = this.f13609b;
                n1Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.f13690n = fFloatValue;
                View view = n1Var.f13686b;
                view.setAlpha(1.0f - fFloatValue);
                view.setScaleX(1.0f - n1Var.f13690n);
                view.setScaleY(1.0f - n1Var.f13690n);
                n1Var.f13687c.setColorFilter(new PorterDuffColorFilter(i0.b.d(n1Var.f13690n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                n1Var.f13685a.invalidate();
                break;
        }
    }
}
