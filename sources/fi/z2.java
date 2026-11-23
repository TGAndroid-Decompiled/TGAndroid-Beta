package fi;

import android.animation.ValueAnimator;
import android.view.View;
import hi.yb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.kr;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12810a;
    public final Object f12811b;
    public final Object f12812c;
    public final Object d;

    public z2(Object obj, Object obj2, Object obj3, int i7) {
        this.f12810a = i7;
        this.f12811b = obj;
        this.f12812c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f12810a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                z3 z3Var = ((b3) this.f12811b).f11759a;
                z3Var.f12829f3 = ((Float) ((ValueAnimator) this.f12812c).getAnimatedValue()).floatValue();
                z3Var.invalidate();
                if (z3Var.f12829f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    z3Var.f12815a3 = true;
                    try {
                        z3Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                hi.v5 v5Var = (hi.v5) this.f12811b;
                View view = (View) this.f12812c;
                View view2 = (View) this.d;
                v5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.G0.invalidate();
                v5Var.D0.invalidate();
                v5Var.E0.invalidate();
                for (int i7 = 0; i7 < v5Var.G0.getChildCount(); i7++) {
                    View childAt = v5Var.G0.getChildAt(i7);
                    if (i7 == v5Var.J0) {
                        f10 = v5Var.K0;
                    } else if (i7 == v5Var.I0) {
                        f10 = 1.0f - v5Var.K0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = kr.f36858f.getInterpolation(v5Var.K0);
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
                yb ybVar = (yb) this.f12811b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12812c;
                hi.d0 d0Var = (hi.d0) this.d;
                ybVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    ybVar.setDrawable(d0Var);
                    return;
                }
                return;
            case 3:
                pi.j jVar = (pi.j) this.f12811b;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f12812c;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jVar.f55804l) {
                    y1Var.f32475h0 = (-jVar.f55811s) * floatValue2;
                    y1Var.f32480i0 = (-jVar.f55812t) * floatValue2;
                    y1Var.f32489k0 = (-jVar.f55813u) * floatValue2;
                    y1Var.f32485j0 = (-jVar.v) * floatValue2;
                } else {
                    y1Var.f32475h0 = ((-jVar.f55811s) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.f32480i0 = ((-jVar.f55812t) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.f32489k0 = ((-jVar.f55813u) * floatValue2) - r1Var.getTranslationY();
                    y1Var.f32485j0 = ((-jVar.v) * floatValue2) - r1Var.getTranslationY();
                }
                r1Var.invalidate();
                return;
            default:
                tg.l0 l0Var = (tg.l0) this.f12811b;
                View view3 = (View) this.f12812c;
                View view4 = (View) this.d;
                l0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.P0.invalidate();
                l0Var.M0.invalidate();
                l0Var.N0.invalidate();
                for (int i10 = 0; i10 < l0Var.P0.getChildCount(); i10++) {
                    View childAt2 = l0Var.P0.getChildAt(i10);
                    if (i10 == l0Var.R0) {
                        f11 = l0Var.S0;
                    } else if (i10 == l0Var.Q0) {
                        f11 = 1.0f - l0Var.S0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = kr.f36858f.getInterpolation(l0Var.S0);
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
