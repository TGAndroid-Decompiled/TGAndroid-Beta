package di;

import android.animation.ValueAnimator;
import android.view.View;
import fi.gb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.xq;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9035a;
    public final Object f9036b;
    public final Object f9037c;
    public final Object d;

    public g3(Object obj, Object obj2, Object obj3, int i7) {
        this.f9035a = i7;
        this.f9036b = obj;
        this.f9037c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f9035a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                i4 i4Var = ((i3) this.f9036b).f9129a;
                i4Var.f9143e3 = ((Float) ((ValueAnimator) this.f9037c).getAnimatedValue()).floatValue();
                i4Var.invalidate();
                if (i4Var.f9143e3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    i4Var.Z2 = true;
                    try {
                        i4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                fi.o5 o5Var = (fi.o5) this.f9036b;
                View view = (View) this.f9037c;
                View view2 = (View) this.d;
                o5Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.F0.invalidate();
                o5Var.C0.invalidate();
                o5Var.D0.invalidate();
                for (int i7 = 0; i7 < o5Var.F0.getChildCount(); i7++) {
                    View childAt = o5Var.F0.getChildAt(i7);
                    if (i7 == o5Var.I0) {
                        f10 = o5Var.J0;
                    } else if (i7 == o5Var.H0) {
                        f10 = 1.0f - o5Var.J0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = xq.f40329f.getInterpolation(o5Var.J0);
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
                gb gbVar = (gb) this.f9036b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f9037c;
                fi.u uVar = (fi.u) this.d;
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
                mi.k kVar = (mi.k) this.f9036b;
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f9037c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kVar.f20090l) {
                    x1Var.f30793h0 = (-kVar.f20097s) * floatValue2;
                    x1Var.f30798i0 = (-kVar.f20098t) * floatValue2;
                    x1Var.f30807k0 = (-kVar.f20099u) * floatValue2;
                    x1Var.f30803j0 = (-kVar.v) * floatValue2;
                } else {
                    x1Var.f30793h0 = ((-kVar.f20097s) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.f30798i0 = ((-kVar.f20098t) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.f30807k0 = ((-kVar.f20099u) * floatValue2) - q1Var.getTranslationY();
                    x1Var.f30803j0 = ((-kVar.v) * floatValue2) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f9036b;
                View view3 = (View) this.f9037c;
                View view4 = (View) this.d;
                g0Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.O0.invalidate();
                g0Var.L0.invalidate();
                g0Var.M0.invalidate();
                for (int i10 = 0; i10 < g0Var.O0.getChildCount(); i10++) {
                    View childAt2 = g0Var.O0.getChildAt(i10);
                    if (i10 == g0Var.Q0) {
                        f11 = g0Var.R0;
                    } else if (i10 == g0Var.P0) {
                        f11 = 1.0f - g0Var.R0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = xq.f40329f.getInterpolation(g0Var.R0);
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
