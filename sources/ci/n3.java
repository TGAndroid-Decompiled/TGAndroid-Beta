package ci;

import android.animation.ValueAnimator;
import android.view.View;
import ei.hc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5592a;
    public final Object f5593b;
    public final Object f5594c;
    public final Object d;

    public n3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5592a = i10;
        this.f5593b = obj;
        this.f5594c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f5592a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                p4 p4Var = ((p3) this.f5593b).f5648a;
                p4Var.f5716v3 = ((Float) ((ValueAnimator) this.f5594c).getAnimatedValue()).floatValue();
                p4Var.invalidate();
                if (p4Var.f5716v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    p4Var.f5701q3 = true;
                    try {
                        p4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ei.f6 f6Var = (ei.f6) this.f5593b;
                View view = (View) this.f5594c;
                View view2 = (View) this.d;
                f6Var.f9010a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.W0.invalidate();
                f6Var.T0.invalidate();
                f6Var.U0.invalidate();
                for (int i10 = 0; i10 < f6Var.W0.getChildCount(); i10++) {
                    View childAt = f6Var.W0.getChildAt(i10);
                    if (i10 == f6Var.Z0) {
                        f7 = f6Var.f9010a1;
                    } else if (i10 == f6Var.Y0) {
                        f7 = 1.0f - f6Var.f9010a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = zr.f33337f.getInterpolation(f6Var.f9010a1);
                if (view != null && view2 != null) {
                    float f11 = 1.0f - interpolation;
                    float f12 = (f11 * 0.4f) + 0.6f;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f13 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f13);
                    view2.setScaleY(f13);
                    view2.setTranslationY((Math.min(f11, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f11, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 2:
                hc hcVar = (hc) this.f5593b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5594c;
                ei.u uVar = (ei.u) this.d;
                hcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    hcVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                li.l lVar = (li.l) this.f5593b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f5594c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f16189l) {
                    s1Var.f23157g0 = (-lVar.f16196s) * floatValue2;
                    s1Var.f23161h0 = (-lVar.f16197t) * floatValue2;
                    s1Var.f23171j0 = (-lVar.f16198u) * floatValue2;
                    s1Var.f23166i0 = (-lVar.v) * floatValue2;
                } else {
                    s1Var.f23157g0 = ((-lVar.f16196s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f23161h0 = ((-lVar.f16197t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f23171j0 = ((-lVar.f16198u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.f23166i0 = ((-lVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f5593b;
                View view3 = (View) this.f5594c;
                View view4 = (View) this.d;
                m0Var.f45897i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f45891f1.invalidate();
                m0Var.f45885c1.invalidate();
                m0Var.f45887d1.invalidate();
                for (int i11 = 0; i11 < m0Var.f45891f1.getChildCount(); i11++) {
                    View childAt2 = m0Var.f45891f1.getChildAt(i11);
                    if (i11 == m0Var.f45895h1) {
                        f10 = m0Var.f45897i1;
                    } else if (i11 == m0Var.f45893g1) {
                        f10 = 1.0f - m0Var.f45897i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = zr.f33337f.getInterpolation(m0Var.f45897i1);
                if (view3 != null && view4 != null) {
                    float f14 = 1.0f - interpolation2;
                    float f15 = (f14 * 0.4f) + 0.6f;
                    view3.setScaleX(f15);
                    view3.setScaleY(f15);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f16 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f16);
                    view4.setScaleY(f16);
                    view4.setTranslationY((Math.min(f14, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f14, 0.25f) / 0.25f));
                    return;
                }
                return;
        }
    }
}
