package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class jh7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final kh7 b;

    public jh7(kh7 kh7Var, byte b) {
        this.a = b;
        this.b = kh7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kh7 kh7Var = this.b;
        switch (b) {
            case 0:
                kh7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh7Var.n = floatValue;
                View view = kh7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - kh7Var.n);
                view.setScaleY(1.0f - kh7Var.n);
                kh7Var.c.setColorFilter(new PorterDuffColorFilter(bm2.f(kh7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                kh7Var.a.invalidate();
                return;
        }
    }
}
