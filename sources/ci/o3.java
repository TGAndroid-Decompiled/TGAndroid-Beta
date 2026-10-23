package ci;

import android.animation.ValueAnimator;
import android.view.View;
import ei.hc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class o3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5685a;
    public final Object f5686b;
    public final Object f5687c;
    public final Object d;

    public o3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5685a = i10;
        this.f5686b = obj;
        this.f5687c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f5685a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                q4 q4Var = ((q3) this.f5686b).f5761a;
                q4Var.f5829v3 = ((Float) ((ValueAnimator) this.f5687c).getAnimatedValue()).floatValue();
                q4Var.invalidate();
                if (q4Var.f5829v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    q4Var.f5814q3 = true;
                    try {
                        q4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ei.f6 f6Var = (ei.f6) this.f5686b;
                View view = (View) this.f5687c;
                View view2 = (View) this.d;
                f6Var.f8999a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.W0.invalidate();
                f6Var.T0.invalidate();
                f6Var.U0.invalidate();
                for (int i10 = 0; i10 < f6Var.W0.getChildCount(); i10++) {
                    View childAt = f6Var.W0.getChildAt(i10);
                    if (i10 == f6Var.Z0) {
                        f7 = f6Var.f8999a1;
                    } else if (i10 == f6Var.Y0) {
                        f7 = 1.0f - f6Var.f8999a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = bs.f25025f.getInterpolation(f6Var.f8999a1);
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
                hc hcVar = (hc) this.f5686b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5687c;
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
                li.l lVar = (li.l) this.f5686b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f5687c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f16126l) {
                    t1Var.f23096g0 = (-lVar.f16133s) * floatValue2;
                    t1Var.f23100h0 = (-lVar.f16134t) * floatValue2;
                    t1Var.f23110j0 = (-lVar.f16135u) * floatValue2;
                    t1Var.f23105i0 = (-lVar.v) * floatValue2;
                } else {
                    t1Var.f23096g0 = ((-lVar.f16133s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f23100h0 = ((-lVar.f16134t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f23110j0 = ((-lVar.f16135u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.f23105i0 = ((-lVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f5686b;
                View view3 = (View) this.f5687c;
                View view4 = (View) this.d;
                m0Var.f45492i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f45486f1.invalidate();
                m0Var.f45480c1.invalidate();
                m0Var.f45482d1.invalidate();
                for (int i11 = 0; i11 < m0Var.f45486f1.getChildCount(); i11++) {
                    View childAt2 = m0Var.f45486f1.getChildAt(i11);
                    if (i11 == m0Var.f45490h1) {
                        f10 = m0Var.f45492i1;
                    } else if (i11 == m0Var.f45488g1) {
                        f10 = 1.0f - m0Var.f45492i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = bs.f25025f.getInterpolation(m0Var.f45492i1);
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
