package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
public final class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a = 1;
    public final float b;
    public final float c;
    public final FrameLayout d;
    public final Object e;
    public final Object f;

    public k1(s1 s1Var, AtomicReference atomicReference, float f, float f2, r1 r1Var) {
        this.d = s1Var;
        this.e = atomicReference;
        this.b = f;
        this.c = f2;
        this.f = r1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        float f = this.c;
        float f2 = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                s1 s1Var = (s1) frameLayout;
                r1 r1Var = (r1) obj;
                FrameLayout frameLayout2 = s1Var.K;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = gl.a;
                float min = Math.min((f3.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f3)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (true) {
                    int i = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
                    float f4 = r1Var.a;
                    if (i > 0) {
                        float min2 = Math.min(min, 18.0f);
                        float f5 = r1Var.b;
                        float f6 = (((((-0.020170001f) * f5) + ((f4 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f5;
                        r1Var.b = f6;
                        r1Var.a = (f6 * min2) + f4;
                        min -= min2;
                    } else {
                        float R1 = gl.R1(f2, f, f4);
                        s1Var.W = R1;
                        if (R1 > 0.8f && frameLayout2.getBackground() == null) {
                            frameLayout2.setBackground(s1Var.L);
                        }
                        s1Var.r.setAlpha(1.0f - s1Var.W);
                        s1Var.s.setAlpha((float) Math.pow(1.0f - s1Var.W, 2.0d));
                        s1Var.i();
                        frameLayout2.invalidate();
                        return;
                    }
                }
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) tb4.A(f, f2, floatValue, f2));
                ((c09) obj2).setOutlineProgress(1.0f - floatValue);
                ((c09) obj).setOutlineProgress(floatValue);
                return;
        }
    }

    public k1(HorizontalScrollView horizontalScrollView, float f, float f2, c09 c09Var, c09 c09Var2) {
        this.d = horizontalScrollView;
        this.b = f;
        this.c = f2;
        this.e = c09Var;
        this.f = c09Var2;
    }
}
