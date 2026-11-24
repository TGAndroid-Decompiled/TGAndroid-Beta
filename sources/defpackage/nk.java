package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.PremiumPreviewFragment;
public final class nk implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float L;
        byte b = this.a;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                Drawable drawable = (Drawable) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs = Math.abs(floatValue - 0.5f) + 0.5f;
                imageView.setScaleX(abs);
                imageView.setScaleY(abs);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    imageView.setImageDrawable(drawable);
                    return;
                }
                return;
            case 1:
                ka2 ka2Var = (ka2) obj3;
                nb2 nb2Var = (nb2) obj2;
                gb2 gb2Var = (gb2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z = ka2Var.l;
                int i2 = ka2Var.s;
                if (z) {
                    nb2Var.h0 = (-i2) * floatValue2;
                    nb2Var.i0 = (-ka2Var.t) * floatValue2;
                    nb2Var.k0 = (-ka2Var.u) * floatValue2;
                    nb2Var.j0 = (-ka2Var.v) * floatValue2;
                } else {
                    nb2Var.h0 = ((-i2) * floatValue2) - gb2Var.getAnimationOffsetX();
                    nb2Var.i0 = ((-ka2Var.t) * floatValue2) - gb2Var.getAnimationOffsetX();
                    nb2Var.k0 = ((-ka2Var.u) * floatValue2) - gb2Var.getTranslationY();
                    nb2Var.j0 = ((-ka2Var.v) * floatValue2) - gb2Var.getTranslationY();
                }
                gb2Var.invalidate();
                return;
            case 2:
                rw5 rw5Var = (rw5) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                rw5Var.Y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw5Var.V0.invalidate();
                rw5Var.S0.invalidate();
                rw5Var.T0.invalidate();
                while (i < rw5Var.V0.getChildCount()) {
                    View childAt = rw5Var.V0.getChildAt(i);
                    if (i == rw5Var.X0) {
                        f = rw5Var.Y0;
                    } else if (i == rw5Var.W0) {
                        f = 1.0f - rw5Var.Y0;
                    } else {
                        f = 0.0f;
                    }
                    childAt.setAlpha((f * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = s33.f.getInterpolation(rw5Var.Y0);
                if (viewGroup != null && viewGroup2 != null) {
                    float f3 = 1.0f - interpolation;
                    float f4 = (f3 * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f4);
                    viewGroup.setScaleY(f4);
                    viewGroup.setTranslationY((Math.min(interpolation, 0.25f) * gl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f5 = (interpolation * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f5);
                    viewGroup2.setScaleY(f5);
                    viewGroup2.setTranslationY((Math.min(f3, 0.25f) * (-gl.L(16.0f))) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(f3, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 3:
                wt7 wt7Var = (wt7) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                ViewGroup viewGroup4 = (ViewGroup) obj;
                wt7Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wt7Var.M0.invalidate();
                wt7Var.J0.invalidate();
                wt7Var.K0.invalidate();
                while (i < wt7Var.M0.getChildCount()) {
                    View childAt2 = wt7Var.M0.getChildAt(i);
                    if (i == wt7Var.P0) {
                        f2 = wt7Var.Q0;
                    } else if (i == wt7Var.O0) {
                        f2 = 1.0f - wt7Var.Q0;
                    } else {
                        f2 = 0.0f;
                    }
                    childAt2.setAlpha((f2 * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation2 = s33.f.getInterpolation(wt7Var.Q0);
                if (viewGroup3 != null && viewGroup4 != null) {
                    float f6 = 1.0f - interpolation2;
                    float f7 = (f6 * 0.4f) + 0.6f;
                    viewGroup3.setScaleX(f7);
                    viewGroup3.setScaleY(f7);
                    viewGroup3.setTranslationY((Math.min(interpolation2, 0.25f) * gl.L(16.0f)) / 0.25f);
                    viewGroup3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f8 = (interpolation2 * 0.4f) + 0.6f;
                    viewGroup4.setScaleX(f8);
                    viewGroup4.setScaleY(f8);
                    viewGroup4.setTranslationY((Math.min(f6, 0.25f) * (-gl.L(16.0f))) / 0.25f);
                    viewGroup4.setAlpha(1.0f - (Math.min(f6, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                y28 y28Var = ((c28) obj3).a;
                y28Var.l3 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                y28Var.invalidate();
                if (y28Var.l3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    y28Var.g3 = true;
                    try {
                        y28Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                ei8 ei8Var = (ei8) obj3;
                t98 t98Var = (t98) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ei8Var.n;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t98Var.setAlpha(floatValue3);
                t98Var.setScaleX(floatValue3);
                t98Var.setScaleY(floatValue3);
                float animatedFraction = ((ValueAnimator) obj).getAnimatedFraction();
                while (i < premiumPreviewFragment.V.getChildCount()) {
                    View childAt3 = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt3 != ei8Var.e) {
                        if (childAt3 == ei8Var.c) {
                            L = 0.0f - (gl.L(15.0f) * animatedFraction);
                        } else {
                            L = (gl.L(8.0f) * animatedFraction) + 0.0f;
                        }
                        childAt3.setTranslationY((t98Var.getMeasuredHeight() * animatedFraction) + L);
                    }
                    i++;
                }
                return;
            case 6:
                ohb ohbVar = (ohb) obj3;
                ohbVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ar1) obj2).getEditField().setAlpha(ohbVar.a);
                ((w02) obj).invalidate();
                return;
            default:
                mpb mpbVar = (mpb) obj3;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj2;
                gk2 gk2Var = (gk2) obj;
                mpbVar.getClass();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= 0.5f && !atomicBoolean2.get()) {
                    atomicBoolean2.set(true);
                    mpbVar.setDrawable(gk2Var);
                    return;
                }
                return;
        }
    }
}
