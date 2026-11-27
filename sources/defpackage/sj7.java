package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class sj7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tj7 b;

    public sj7(tj7 tj7Var, byte b) {
        this.a = b;
        this.b = tj7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tj7 tj7Var = this.b;
        switch (b) {
            case 0:
                tj7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tj7Var.n = floatValue;
                View view = tj7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - tj7Var.n);
                view.setScaleY(1.0f - tj7Var.n);
                tj7Var.c.setColorFilter(new PorterDuffColorFilter(vm2.f(tj7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                tj7Var.a.invalidate();
                return;
        }
    }
}
