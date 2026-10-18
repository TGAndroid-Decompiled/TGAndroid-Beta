package ci;

import android.animation.ValueAnimator;
import android.view.View;
import ei.hc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5588a;
    public final Object f5589b;
    public final Object f5590c;
    public final Object d;

    public n3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5588a = i10;
        this.f5589b = obj;
        this.f5590c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f5588a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                p4 p4Var = ((p3) this.f5589b).f5644a;
                p4Var.f5712v3 = ((Float) ((ValueAnimator) this.f5590c).getAnimatedValue()).floatValue();
                p4Var.invalidate();
                if (p4Var.f5712v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    p4Var.f5697q3 = true;
                    try {
                        p4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ei.f6 f6Var = (ei.f6) this.f5589b;
                View view = (View) this.f5590c;
                View view2 = (View) this.d;
                f6Var.f9000a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.W0.invalidate();
                f6Var.T0.invalidate();
                f6Var.U0.invalidate();
                for (int i10 = 0; i10 < f6Var.W0.getChildCount(); i10++) {
                    View childAt = f6Var.W0.getChildAt(i10);
                    if (i10 == f6Var.Z0) {
                        f7 = f6Var.f9000a1;
                    } else if (i10 == f6Var.Y0) {
                        f7 = 1.0f - f6Var.f9000a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = bs.f25030f.getInterpolation(f6Var.f9000a1);
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
                hc hcVar = (hc) this.f5589b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5590c;
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
                li.l lVar = (li.l) this.f5589b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f5590c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f16125l) {
                    t1Var.f23088g0 = (-lVar.f16132s) * floatValue2;
                    t1Var.f23092h0 = (-lVar.f16133t) * floatValue2;
                    t1Var.f23102j0 = (-lVar.f16134u) * floatValue2;
                    t1Var.f23097i0 = (-lVar.v) * floatValue2;
                } else {
                    t1Var.f23088g0 = ((-lVar.f16132s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f23092h0 = ((-lVar.f16133t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f23102j0 = ((-lVar.f16134u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.f23097i0 = ((-lVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f5589b;
                View view3 = (View) this.f5590c;
                View view4 = (View) this.d;
                m0Var.f45481i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f45475f1.invalidate();
                m0Var.f45469c1.invalidate();
                m0Var.f45471d1.invalidate();
                for (int i11 = 0; i11 < m0Var.f45475f1.getChildCount(); i11++) {
                    View childAt2 = m0Var.f45475f1.getChildAt(i11);
                    if (i11 == m0Var.f45479h1) {
                        f10 = m0Var.f45481i1;
                    } else if (i11 == m0Var.f45477g1) {
                        f10 = 1.0f - m0Var.f45481i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = bs.f25030f.getInterpolation(m0Var.f45481i1);
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
