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
                ab2 ab2Var = (ab2) obj3;
                dc2 dc2Var = (dc2) obj2;
                wb2 wb2Var = (wb2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z = ab2Var.l;
                int i2 = ab2Var.s;
                if (z) {
                    dc2Var.h0 = (-i2) * floatValue2;
                    dc2Var.i0 = (-ab2Var.t) * floatValue2;
                    dc2Var.k0 = (-ab2Var.u) * floatValue2;
                    dc2Var.j0 = (-ab2Var.v) * floatValue2;
                } else {
                    dc2Var.h0 = ((-i2) * floatValue2) - wb2Var.getAnimationOffsetX();
                    dc2Var.i0 = ((-ab2Var.t) * floatValue2) - wb2Var.getAnimationOffsetX();
                    dc2Var.k0 = ((-ab2Var.u) * floatValue2) - wb2Var.getTranslationY();
                    dc2Var.j0 = ((-ab2Var.v) * floatValue2) - wb2Var.getTranslationY();
                }
                wb2Var.invalidate();
                return;
            case 2:
                wy5 wy5Var = (wy5) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                wy5Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy5Var.P0.invalidate();
                wy5Var.M0.invalidate();
                wy5Var.N0.invalidate();
                while (i < wy5Var.P0.getChildCount()) {
                    View childAt = wy5Var.P0.getChildAt(i);
                    if (i == wy5Var.R0) {
                        f = wy5Var.S0;
                    } else if (i == wy5Var.Q0) {
                        f = 1.0f - wy5Var.S0;
                    } else {
                        f = 0.0f;
                    }
                    childAt.setAlpha((f * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = k43.f.getInterpolation(wy5Var.S0);
                if (viewGroup != null && viewGroup2 != null) {
                    float f3 = 1.0f - interpolation;
                    float f4 = (f3 * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f4);
                    viewGroup.setScaleY(f4);
                    viewGroup.setTranslationY((Math.min(interpolation, 0.25f) * hl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f5 = (interpolation * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f5);
                    viewGroup2.setScaleY(f5);
                    viewGroup2.setTranslationY((Math.min(f3, 0.25f) * (-hl.L(16.0f))) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(f3, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 3:
                dx7 dx7Var = (dx7) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                ViewGroup viewGroup4 = (ViewGroup) obj;
                dx7Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx7Var.G0.invalidate();
                dx7Var.D0.invalidate();
                dx7Var.E0.invalidate();
                while (i < dx7Var.G0.getChildCount()) {
                    View childAt2 = dx7Var.G0.getChildAt(i);
                    if (i == dx7Var.J0) {
                        f2 = dx7Var.K0;
                    } else if (i == dx7Var.I0) {
                        f2 = 1.0f - dx7Var.K0;
                    } else {
                        f2 = 0.0f;
                    }
                    childAt2.setAlpha((f2 * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation2 = k43.f.getInterpolation(dx7Var.K0);
                if (viewGroup3 != null && viewGroup4 != null) {
                    float f6 = 1.0f - interpolation2;
                    float f7 = (f6 * 0.4f) + 0.6f;
                    viewGroup3.setScaleX(f7);
                    viewGroup3.setScaleY(f7);
                    viewGroup3.setTranslationY((Math.min(interpolation2, 0.25f) * hl.L(16.0f)) / 0.25f);
                    viewGroup3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f8 = (interpolation2 * 0.4f) + 0.6f;
                    viewGroup4.setScaleX(f8);
                    viewGroup4.setScaleY(f8);
                    viewGroup4.setTranslationY((Math.min(f6, 0.25f) * (-hl.L(16.0f))) / 0.25f);
                    viewGroup4.setAlpha(1.0f - (Math.min(f6, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                o68 o68Var = ((s58) obj3).a;
                o68Var.f3 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                o68Var.invalidate();
                if (o68Var.f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    o68Var.a3 = true;
                    try {
                        o68Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                rl8 rl8Var = (rl8) obj3;
                jd8 jd8Var = (jd8) obj2;
                PremiumPreviewFragment premiumPreviewFragment = rl8Var.n;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd8Var.setAlpha(floatValue3);
                jd8Var.setScaleX(floatValue3);
                jd8Var.setScaleY(floatValue3);
                float animatedFraction = ((ValueAnimator) obj).getAnimatedFraction();
                while (i < premiumPreviewFragment.V.getChildCount()) {
                    View childAt3 = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt3 != rl8Var.e) {
                        if (childAt3 == rl8Var.c) {
                            L = 0.0f - (hl.L(15.0f) * animatedFraction);
                        } else {
                            L = (hl.L(8.0f) * animatedFraction) + 0.0f;
                        }
                        childAt3.setTranslationY((jd8Var.getMeasuredHeight() * animatedFraction) + L);
                    }
                    i++;
                }
                return;
            case 6:
                klb klbVar = (klb) obj3;
                klbVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((nr1) obj2).getEditField().setAlpha(klbVar.a);
                ((m12) obj).invalidate();
                return;
            default:
                ntb ntbVar = (ntb) obj3;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj2;
                bl2 bl2Var = (bl2) obj;
                ntbVar.getClass();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= 0.5f && !atomicBoolean2.get()) {
                    atomicBoolean2.set(true);
                    ntbVar.setDrawable(bl2Var);
                    return;
                }
                return;
        }
    }
}
