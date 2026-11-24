package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class bo implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public bo(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ho hoVar = (ho) obj;
                hoVar.getClass();
                hoVar.u(on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                hoVar.invalidateSelf();
                return;
            case 1:
                int R0 = gm.R0(valueAnimator.getAnimatedFraction(), 1.0f, i2, i);
                s09 s09Var = ((wb5) obj).f;
                s09Var.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.SRC_IN));
                cmb.F1(s09Var.getDrawable(), R0 & 620756991, true);
                return;
            case 2:
                ry5 ry5Var = (ry5) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry5Var.A1.a = on2.f(floatValue, i2, i);
                ry5Var.S0.invalidate();
                return;
            case 3:
                xv7 xv7Var = (xv7) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv7Var.q1.a = on2.f(floatValue2, i2, i);
                xv7Var.J0.invalidate();
                return;
            case 4:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i3 = ScrollSlidingTextTabStrip.p0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.a0 = i2 * floatValue3;
                scrollSlidingTextTabStrip.b0 = i * floatValue3;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                x2b x2bVar = (x2b) ((wa8) obj).b;
                x2bVar.m1.setAlpha(animatedFraction);
                x2bVar.q1.setAlpha(animatedFraction);
                if (i2 != 0) {
                    int i4 = (int) ((1.0f - animatedFraction) * i2);
                    x2bVar.Q0(i + i4);
                    x2bVar.m1.setTranslationY(i4);
                    return;
                }
                return;
        }
    }
}
