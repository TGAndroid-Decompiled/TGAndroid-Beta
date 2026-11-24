package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class mj7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nj7 b;

    public mj7(nj7 nj7Var, byte b) {
        this.a = b;
        this.b = nj7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nj7 nj7Var = this.b;
        switch (b) {
            case 0:
                nj7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj7Var.n = floatValue;
                View view = nj7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - nj7Var.n);
                view.setScaleY(1.0f - nj7Var.n);
                nj7Var.c.setColorFilter(new PorterDuffColorFilter(on2.f(nj7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                nj7Var.a.invalidate();
                return;
        }
    }
}
