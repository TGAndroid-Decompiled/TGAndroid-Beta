package dg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.nr;
import ph.c5;
import ph.pa;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f4761a;
    public final Object f4762b;
    public final Object f4763c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f4761a = i10;
        this.f4762b = obj;
        this.f4763c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f4761a) {
            case 0:
                e1 e1Var = (e1) this.f4762b;
                View view = (View) this.f4763c;
                View view2 = (View) this.d;
                e1Var.f4467f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.f4461c1.invalidate();
                e1Var.Z0.invalidate();
                e1Var.f4458a1.invalidate();
                for (int i10 = 0; i10 < e1Var.f4461c1.getChildCount(); i10++) {
                    View childAt = e1Var.f4461c1.getChildAt(i10);
                    if (i10 == e1Var.f4465e1) {
                        f10 = e1Var.f4467f1;
                    } else if (i10 == e1Var.f4463d1) {
                        f10 = 1.0f - e1Var.f4467f1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = nr.f27346f.getInterpolation(e1Var.f4467f1);
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
                d4 d4Var = ((nh.h3) this.f4762b).f15377a;
                d4Var.f15236s3 = ((Float) ((ValueAnimator) this.f4763c).getAnimatedValue()).floatValue();
                d4Var.invalidate();
                if (d4Var.f15236s3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    d4Var.f15221n3 = true;
                    try {
                        d4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                c5 c5Var = (c5) this.f4762b;
                View view3 = (View) this.f4763c;
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
                float interpolation2 = nr.f27346f.getInterpolation(c5Var.X0);
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
                pa paVar = (pa) this.f4762b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4763c;
                jc0 jc0Var = (jc0) this.d;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    paVar.setDrawable(jc0Var);
                    return;
                }
                return;
            default:
                wh.m mVar = (wh.m) this.f4762b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f4763c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f46620l) {
                    s1Var.f21843g0 = (-mVar.f46627s) * floatValue2;
                    s1Var.f21847h0 = (-mVar.f46628t) * floatValue2;
                    s1Var.f21857j0 = (-mVar.f46629u) * floatValue2;
                    s1Var.f21852i0 = (-mVar.v) * floatValue2;
                } else {
                    s1Var.f21843g0 = ((-mVar.f46627s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f21847h0 = ((-mVar.f46628t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f21857j0 = ((-mVar.f46629u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.f21852i0 = ((-mVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                return;
        }
    }
}
