package ei;

import android.animation.ValueAnimator;
import android.view.View;
import gi.gb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.xq;
public final class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10438a;
    public final Object f10439b;
    public final Object f10440c;
    public final Object d;

    public j3(Object obj, Object obj2, Object obj3, int i3) {
        this.f10438a = i3;
        this.f10439b = obj;
        this.f10440c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f10438a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                j4 j4Var = ((l3) this.f10439b).f10604a;
                j4Var.f10457f3 = ((Float) ((ValueAnimator) this.f10440c).getAnimatedValue()).floatValue();
                j4Var.invalidate();
                if (j4Var.f10457f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    j4Var.f10443a3 = true;
                    try {
                        j4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                gi.m5 m5Var = (gi.m5) this.f10439b;
                View view = (View) this.f10440c;
                View view2 = (View) this.d;
                m5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.G0.invalidate();
                m5Var.D0.invalidate();
                m5Var.E0.invalidate();
                for (int i3 = 0; i3 < m5Var.G0.getChildCount(); i3++) {
                    View childAt = m5Var.G0.getChildAt(i3);
                    if (i3 == m5Var.J0) {
                        f10 = m5Var.K0;
                    } else if (i3 == m5Var.I0) {
                        f10 = 1.0f - m5Var.K0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = xq.f40452f.getInterpolation(m5Var.K0);
                if (view != null && view2 != null) {
                    float f12 = 1.0f - interpolation;
                    float f13 = (f12 * 0.4f) + 0.6f;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f14 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f14);
                    view2.setScaleY(f14);
                    view2.setTranslationY((Math.min(f12, 0.25f) * (-org.telegram.messenger.g0.L(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f12, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 2:
                gb gbVar = (gb) this.f10439b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f10440c;
                gi.u uVar = (gi.u) this.d;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    gbVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                ni.k kVar = (ni.k) this.f10439b;
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f10440c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kVar.f20443l) {
                    x1Var.f30871h0 = (-kVar.f20450s) * floatValue2;
                    x1Var.f30876i0 = (-kVar.f20451t) * floatValue2;
                    x1Var.f30885k0 = (-kVar.f20452u) * floatValue2;
                    x1Var.f30880j0 = (-kVar.v) * floatValue2;
                } else {
                    x1Var.f30871h0 = ((-kVar.f20450s) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.f30876i0 = ((-kVar.f20451t) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.f30885k0 = ((-kVar.f20452u) * floatValue2) - q1Var.getTranslationY();
                    x1Var.f30880j0 = ((-kVar.v) * floatValue2) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                return;
            default:
                ug.f0 f0Var = (ug.f0) this.f10439b;
                View view3 = (View) this.f10440c;
                View view4 = (View) this.d;
                f0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.P0.invalidate();
                f0Var.M0.invalidate();
                f0Var.N0.invalidate();
                for (int i10 = 0; i10 < f0Var.P0.getChildCount(); i10++) {
                    View childAt2 = f0Var.P0.getChildAt(i10);
                    if (i10 == f0Var.R0) {
                        f11 = f0Var.S0;
                    } else if (i10 == f0Var.Q0) {
                        f11 = 1.0f - f0Var.S0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = xq.f40452f.getInterpolation(f0Var.S0);
                if (view3 != null && view4 != null) {
                    float f15 = 1.0f - interpolation2;
                    float f16 = (f15 * 0.4f) + 0.6f;
                    view3.setScaleX(f16);
                    view3.setScaleY(f16);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f17 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f17);
                    view4.setScaleY(f17);
                    view4.setTranslationY((Math.min(f15, 0.25f) * (-org.telegram.messenger.g0.L(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f15, 0.25f) / 0.25f));
                    return;
                }
                return;
        }
    }
}
