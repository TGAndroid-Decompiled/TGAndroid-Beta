package dg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mr;
import ph.c5;
import ph.pa;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f4767a;
    public final Object f4768b;
    public final Object f4769c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f4767a = i10;
        this.f4768b = obj;
        this.f4769c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f4767a) {
            case 0:
                e1 e1Var = (e1) this.f4768b;
                View view = (View) this.f4769c;
                View view2 = (View) this.d;
                e1Var.f4473f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.f4467c1.invalidate();
                e1Var.Z0.invalidate();
                e1Var.f4464a1.invalidate();
                for (int i10 = 0; i10 < e1Var.f4467c1.getChildCount(); i10++) {
                    View childAt = e1Var.f4467c1.getChildAt(i10);
                    if (i10 == e1Var.f4471e1) {
                        f10 = e1Var.f4473f1;
                    } else if (i10 == e1Var.f4469d1) {
                        f10 = 1.0f - e1Var.f4473f1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = mr.f27122f.getInterpolation(e1Var.f4473f1);
                if (view != null && view2 != null) {
                    float f12 = 1.0f - interpolation;
                    float f13 = (f12 * 0.4f) + 0.6f;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f14 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f14);
                    view2.setScaleY(f14);
                    view2.setTranslationY((Math.min(f12, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f12, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.d;
                d4 d4Var = ((nh.h3) this.f4768b).f15357a;
                d4Var.f15216s3 = ((Float) ((ValueAnimator) this.f4769c).getAnimatedValue()).floatValue();
                d4Var.invalidate();
                if (d4Var.f15216s3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    d4Var.f15201n3 = true;
                    try {
                        d4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                c5 c5Var = (c5) this.f4768b;
                View view3 = (View) this.f4769c;
                View view4 = (View) this.d;
                c5Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.T0.invalidate();
                c5Var.Q0.invalidate();
                c5Var.R0.invalidate();
                for (int i11 = 0; i11 < c5Var.T0.getChildCount(); i11++) {
                    View childAt2 = c5Var.T0.getChildAt(i11);
                    if (i11 == c5Var.W0) {
                        f11 = c5Var.X0;
                    } else if (i11 == c5Var.V0) {
                        f11 = 1.0f - c5Var.X0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = mr.f27122f.getInterpolation(c5Var.X0);
                if (view3 != null && view4 != null) {
                    float f15 = 1.0f - interpolation2;
                    float f16 = (f15 * 0.4f) + 0.6f;
                    view3.setScaleX(f16);
                    view3.setScaleY(f16);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f17 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f17);
                    view4.setScaleY(f17);
                    view4.setTranslationY((Math.min(f15, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f15, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 3:
                pa paVar = (pa) this.f4768b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4769c;
                kc0 kc0Var = (kc0) this.d;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    paVar.setDrawable(kc0Var);
                    return;
                }
                return;
            default:
                wh.m mVar = (wh.m) this.f4768b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f4769c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f46689l) {
                    r1Var.f21774g0 = (-mVar.f46696s) * floatValue2;
                    r1Var.f21778h0 = (-mVar.f46697t) * floatValue2;
                    r1Var.f21788j0 = (-mVar.f46698u) * floatValue2;
                    r1Var.f21783i0 = (-mVar.v) * floatValue2;
                } else {
                    r1Var.f21774g0 = ((-mVar.f46696s) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f21778h0 = ((-mVar.f46697t) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f21788j0 = ((-mVar.f46698u) * floatValue2) - s1Var.getTranslationY();
                    r1Var.f21783i0 = ((-mVar.v) * floatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                return;
        }
    }
}
