package di;

import android.animation.ValueAnimator;
import android.view.View;
import fi.dc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8813a;
    public final Object f8814b;
    public final Object f8815c;
    public final Object d;

    public n3(Object obj, Object obj2, Object obj3, int i10) {
        this.f8813a = i10;
        this.f8814b = obj;
        this.f8815c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f8813a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                q4 q4Var = ((p3) this.f8814b).f8898a;
                q4Var.f8995k3 = ((Float) ((ValueAnimator) this.f8815c).getAnimatedValue()).floatValue();
                q4Var.invalidate();
                if (q4Var.f8995k3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    q4Var.f8980f3 = true;
                    try {
                        q4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                fi.e6 e6Var = (fi.e6) this.f8814b;
                View view = (View) this.f8815c;
                View view2 = (View) this.d;
                e6Var.P0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.L0.invalidate();
                e6Var.I0.invalidate();
                e6Var.J0.invalidate();
                for (int i10 = 0; i10 < e6Var.L0.getChildCount(); i10++) {
                    View childAt = e6Var.L0.getChildAt(i10);
                    if (i10 == e6Var.O0) {
                        f7 = e6Var.P0;
                    } else if (i10 == e6Var.N0) {
                        f7 = 1.0f - e6Var.P0;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = ds.f27530f.getInterpolation(e6Var.P0);
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
                dc dcVar = (dc) this.f8814b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8815c;
                fi.u uVar = (fi.u) this.d;
                dcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dcVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                mi.l lVar = (mi.l) this.f8814b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f8815c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f18537l) {
                    r1Var.f24875g0 = (-lVar.f18544s) * floatValue2;
                    r1Var.f24879h0 = (-lVar.f18545t) * floatValue2;
                    r1Var.f24889j0 = (-lVar.f18546u) * floatValue2;
                    r1Var.f24884i0 = (-lVar.v) * floatValue2;
                } else {
                    r1Var.f24875g0 = ((-lVar.f18544s) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f24879h0 = ((-lVar.f18545t) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f24889j0 = ((-lVar.f18546u) * floatValue2) - s1Var.getTranslationY();
                    r1Var.f24884i0 = ((-lVar.v) * floatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.f8814b;
                View view3 = (View) this.f8815c;
                View view4 = (View) this.d;
                m0Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U0.invalidate();
                m0Var.R0.invalidate();
                m0Var.S0.invalidate();
                for (int i11 = 0; i11 < m0Var.U0.getChildCount(); i11++) {
                    View childAt2 = m0Var.U0.getChildAt(i11);
                    if (i11 == m0Var.W0) {
                        f10 = m0Var.X0;
                    } else if (i11 == m0Var.V0) {
                        f10 = 1.0f - m0Var.X0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = ds.f27530f.getInterpolation(m0Var.X0);
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
