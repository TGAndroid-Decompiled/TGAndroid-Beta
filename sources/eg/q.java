package eg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import oh.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pr;
import qh.a5;
import qh.ma;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f5440a;
    public final Object f5441b;
    public final Object f5442c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f5440a = i10;
        this.f5441b = obj;
        this.f5442c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f5440a) {
            case 0:
                c1 c1Var = (c1) this.f5441b;
                View view = (View) this.f5442c;
                View view2 = (View) this.d;
                c1Var.f5110f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.f5104c1.invalidate();
                c1Var.Z0.invalidate();
                c1Var.f5101a1.invalidate();
                for (int i10 = 0; i10 < c1Var.f5104c1.getChildCount(); i10++) {
                    View childAt = c1Var.f5104c1.getChildAt(i10);
                    if (i10 == c1Var.f5108e1) {
                        f10 = c1Var.f5110f1;
                    } else if (i10 == c1Var.f5106d1) {
                        f10 = 1.0f - c1Var.f5110f1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = pr.f30168f.getInterpolation(c1Var.f5110f1);
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
                f4 f4Var = ((oh.i3) this.f5441b).f17208a;
                f4Var.f17108s3 = ((Float) ((ValueAnimator) this.f5442c).getAnimatedValue()).floatValue();
                f4Var.invalidate();
                if (f4Var.f17108s3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    f4Var.f17093n3 = true;
                    try {
                        f4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                a5 a5Var = (a5) this.f5441b;
                View view3 = (View) this.f5442c;
                View view4 = (View) this.d;
                a5Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.T0.invalidate();
                a5Var.Q0.invalidate();
                a5Var.R0.invalidate();
                for (int i11 = 0; i11 < a5Var.T0.getChildCount(); i11++) {
                    View childAt2 = a5Var.T0.getChildAt(i11);
                    if (i11 == a5Var.W0) {
                        f11 = a5Var.X0;
                    } else if (i11 == a5Var.V0) {
                        f11 = 1.0f - a5Var.X0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = pr.f30168f.getInterpolation(a5Var.X0);
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
                ma maVar = (ma) this.f5441b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5442c;
                lc0 lc0Var = (lc0) this.d;
                maVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    maVar.setDrawable(lc0Var);
                    return;
                }
                return;
            default:
                xh.m mVar = (xh.m) this.f5441b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f5442c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f50677l) {
                    s1Var.f23641g0 = (-mVar.f50684s) * floatValue2;
                    s1Var.f23645h0 = (-mVar.f50685t) * floatValue2;
                    s1Var.f23655j0 = (-mVar.f50686u) * floatValue2;
                    s1Var.f23650i0 = (-mVar.v) * floatValue2;
                } else {
                    s1Var.f23641g0 = ((-mVar.f50684s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f23645h0 = ((-mVar.f50685t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f23655j0 = ((-mVar.f50686u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.f23650i0 = ((-mVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                return;
        }
    }
}
