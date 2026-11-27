package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
public final class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a = 1;
    public final float b;
    public final float c;
    public final FrameLayout d;
    public final Object e;
    public final Object f;

    public l1(t1 t1Var, AtomicReference atomicReference, float f, float f2, s1 s1Var) {
        this.d = t1Var;
        this.e = atomicReference;
        this.b = f;
        this.c = f2;
        this.f = s1Var;
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
                t1 t1Var = (t1) frameLayout;
                s1 s1Var = (s1) obj;
                FrameLayout frameLayout2 = t1Var.K;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = hl.a;
                float min = Math.min((f3.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f3)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (true) {
                    int i = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
                    float f4 = s1Var.a;
                    if (i > 0) {
                        float min2 = Math.min(min, 18.0f);
                        float f5 = s1Var.b;
                        float f6 = (((((-0.020170001f) * f5) + ((f4 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f5;
                        s1Var.b = f6;
                        s1Var.a = (f6 * min2) + f4;
                        min -= min2;
                    } else {
                        float R1 = hl.R1(f2, f, f4);
                        t1Var.W = R1;
                        if (R1 > 0.8f && frameLayout2.getBackground() == null) {
                            frameLayout2.setBackground(t1Var.L);
                        }
                        t1Var.r.setAlpha(1.0f - t1Var.W);
                        t1Var.s.setAlpha((float) Math.pow(1.0f - t1Var.W, 2.0d));
                        t1Var.i();
                        frameLayout2.invalidate();
                        return;
                    }
                }
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) qd4.A(f, f2, floatValue, f2));
                ((q39) obj2).setOutlineProgress(1.0f - floatValue);
                ((q39) obj).setOutlineProgress(floatValue);
                return;
        }
    }

    public l1(HorizontalScrollView horizontalScrollView, float f, float f2, q39 q39Var, q39 q39Var2) {
        this.d = horizontalScrollView;
        this.b = f;
        this.c = f2;
        this.e = q39Var;
        this.f = q39Var2;
    }
}
