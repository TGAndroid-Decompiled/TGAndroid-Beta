package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.PremiumPreviewFragment;
public final class nl implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nl(Object obj, Object obj2, Object obj3, byte b) {
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
                vb2 vb2Var = (vb2) obj3;
                yc2 yc2Var = (yc2) obj2;
                rc2 rc2Var = (rc2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z = vb2Var.l;
                int i2 = vb2Var.s;
                if (z) {
                    yc2Var.h0 = (-i2) * floatValue2;
                    yc2Var.i0 = (-vb2Var.t) * floatValue2;
                    yc2Var.k0 = (-vb2Var.u) * floatValue2;
                    yc2Var.j0 = (-vb2Var.v) * floatValue2;
                } else {
                    yc2Var.h0 = ((-i2) * floatValue2) - rc2Var.getAnimationOffsetX();
                    yc2Var.i0 = ((-vb2Var.t) * floatValue2) - rc2Var.getAnimationOffsetX();
                    yc2Var.k0 = ((-vb2Var.u) * floatValue2) - rc2Var.getTranslationY();
                    yc2Var.j0 = ((-vb2Var.v) * floatValue2) - rc2Var.getTranslationY();
                }
                rc2Var.invalidate();
                return;
            case 2:
                ry5 ry5Var = (ry5) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                ry5Var.Y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry5Var.V0.invalidate();
                ry5Var.S0.invalidate();
                ry5Var.T0.invalidate();
                while (i < ry5Var.V0.getChildCount()) {
                    View childAt = ry5Var.V0.getChildAt(i);
                    if (i == ry5Var.X0) {
                        f = ry5Var.Y0;
                    } else if (i == ry5Var.W0) {
                        f = 1.0f - ry5Var.Y0;
                    } else {
                        f = 0.0f;
                    }
                    childAt.setAlpha((f * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = d53.f.getInterpolation(ry5Var.Y0);
                if (viewGroup != null && viewGroup2 != null) {
                    float f3 = 1.0f - interpolation;
                    float f4 = (f3 * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f4);
                    viewGroup.setScaleY(f4);
                    viewGroup.setTranslationY((Math.min(interpolation, 0.25f) * gm.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f5 = (interpolation * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f5);
                    viewGroup2.setScaleY(f5);
                    viewGroup2.setTranslationY((Math.min(f3, 0.25f) * (-gm.L(16.0f))) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(f3, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 3:
                xv7 xv7Var = (xv7) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                ViewGroup viewGroup4 = (ViewGroup) obj;
                xv7Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv7Var.M0.invalidate();
                xv7Var.J0.invalidate();
                xv7Var.K0.invalidate();
                while (i < xv7Var.M0.getChildCount()) {
                    View childAt2 = xv7Var.M0.getChildAt(i);
                    if (i == xv7Var.P0) {
                        f2 = xv7Var.Q0;
                    } else if (i == xv7Var.O0) {
                        f2 = 1.0f - xv7Var.Q0;
                    } else {
                        f2 = 0.0f;
                    }
                    childAt2.setAlpha((f2 * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation2 = d53.f.getInterpolation(xv7Var.Q0);
                if (viewGroup3 != null && viewGroup4 != null) {
                    float f6 = 1.0f - interpolation2;
                    float f7 = (f6 * 0.4f) + 0.6f;
                    viewGroup3.setScaleX(f7);
                    viewGroup3.setScaleY(f7);
                    viewGroup3.setTranslationY((Math.min(interpolation2, 0.25f) * gm.L(16.0f)) / 0.25f);
                    viewGroup3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f8 = (interpolation2 * 0.4f) + 0.6f;
                    viewGroup4.setScaleX(f8);
                    viewGroup4.setScaleY(f8);
                    viewGroup4.setTranslationY((Math.min(f6, 0.25f) * (-gm.L(16.0f))) / 0.25f);
                    viewGroup4.setAlpha(1.0f - (Math.min(f6, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                a58 a58Var = ((f48) obj3).a;
                a58Var.l3 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                a58Var.invalidate();
                if (a58Var.l3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    a58Var.g3 = true;
                    try {
                        a58Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                gk8 gk8Var = (gk8) obj3;
                ub8 ub8Var = (ub8) obj2;
                PremiumPreviewFragment premiumPreviewFragment = gk8Var.n;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ub8Var.setAlpha(floatValue3);
                ub8Var.setScaleX(floatValue3);
                ub8Var.setScaleY(floatValue3);
                float animatedFraction = ((ValueAnimator) obj).getAnimatedFraction();
                while (i < premiumPreviewFragment.V.getChildCount()) {
                    View childAt3 = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt3 != gk8Var.e) {
                        if (childAt3 == gk8Var.c) {
                            L = 0.0f - (gm.L(15.0f) * animatedFraction);
                        } else {
                            L = (gm.L(8.0f) * animatedFraction) + 0.0f;
                        }
                        childAt3.setTranslationY((ub8Var.getMeasuredHeight() * animatedFraction) + L);
                    }
                    i++;
                }
                return;
            case 6:
                pjb pjbVar = (pjb) obj3;
                pjbVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ms1) obj2).getEditField().setAlpha(pjbVar.a);
                ((h22) obj).invalidate();
                return;
            default:
                nrb nrbVar = (nrb) obj3;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj2;
                tl2 tl2Var = (tl2) obj;
                nrbVar.getClass();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= 0.5f && !atomicBoolean2.get()) {
                    atomicBoolean2.set(true);
                    nrbVar.setDrawable(tl2Var);
                    return;
                }
                return;
        }
    }
}
