package fi;

import android.animation.ValueAnimator;
import android.view.View;
import hi.eb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.lr;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12804a;
    public final Object f12805b;
    public final Object f12806c;
    public final Object d;

    public z2(Object obj, Object obj2, Object obj3, int i7) {
        this.f12804a = i7;
        this.f12805b = obj;
        this.f12806c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f12804a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                z3 z3Var = ((b3) this.f12805b).f11764a;
                z3Var.f12823f3 = ((Float) ((ValueAnimator) this.f12806c).getAnimatedValue()).floatValue();
                z3Var.invalidate();
                if (z3Var.f12823f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    z3Var.f12809a3 = true;
                    try {
                        z3Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                hi.l5 l5Var = (hi.l5) this.f12805b;
                View view = (View) this.f12806c;
                View view2 = (View) this.d;
                l5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.G0.invalidate();
                l5Var.D0.invalidate();
                l5Var.E0.invalidate();
                for (int i7 = 0; i7 < l5Var.G0.getChildCount(); i7++) {
                    View childAt = l5Var.G0.getChildAt(i7);
                    if (i7 == l5Var.J0) {
                        f10 = l5Var.K0;
                    } else if (i7 == l5Var.I0) {
                        f10 = 1.0f - l5Var.K0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = lr.f37208f.getInterpolation(l5Var.K0);
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
                eb ebVar = (eb) this.f12805b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12806c;
                hi.v vVar = (hi.v) this.d;
                ebVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    ebVar.setDrawable(vVar);
                    return;
                }
                return;
            case 3:
                pi.j jVar = (pi.j) this.f12805b;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f12806c;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jVar.f55681l) {
                    y1Var.f32377h0 = (-jVar.f55688s) * floatValue2;
                    y1Var.f32382i0 = (-jVar.f55689t) * floatValue2;
                    y1Var.f32391k0 = (-jVar.f55690u) * floatValue2;
                    y1Var.f32387j0 = (-jVar.v) * floatValue2;
                } else {
                    y1Var.f32377h0 = ((-jVar.f55688s) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.f32382i0 = ((-jVar.f55689t) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.f32391k0 = ((-jVar.f55690u) * floatValue2) - r1Var.getTranslationY();
                    y1Var.f32387j0 = ((-jVar.v) * floatValue2) - r1Var.getTranslationY();
                }
                r1Var.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f12805b;
                View view3 = (View) this.f12806c;
                View view4 = (View) this.d;
                g0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.P0.invalidate();
                g0Var.M0.invalidate();
                g0Var.N0.invalidate();
                for (int i10 = 0; i10 < g0Var.P0.getChildCount(); i10++) {
                    View childAt2 = g0Var.P0.getChildAt(i10);
                    if (i10 == g0Var.R0) {
                        f11 = g0Var.S0;
                    } else if (i10 == g0Var.Q0) {
                        f11 = 1.0f - g0Var.S0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = lr.f37208f.getInterpolation(g0Var.S0);
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
