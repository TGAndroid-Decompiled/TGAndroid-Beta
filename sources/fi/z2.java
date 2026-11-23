package fi;

import android.animation.ValueAnimator;
import android.view.View;
import hi.db;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.nr;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12848a;
    public final Object f12849b;
    public final Object f12850c;
    public final Object d;

    public z2(Object obj, Object obj2, Object obj3, int i7) {
        this.f12848a = i7;
        this.f12849b = obj;
        this.f12850c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f12848a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                z3 z3Var = ((b3) this.f12849b).f11797a;
                z3Var.f12867f3 = ((Float) ((ValueAnimator) this.f12850c).getAnimatedValue()).floatValue();
                z3Var.invalidate();
                if (z3Var.f12867f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    z3Var.f12853a3 = true;
                    try {
                        z3Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                hi.k5 k5Var = (hi.k5) this.f12849b;
                View view = (View) this.f12850c;
                View view2 = (View) this.d;
                k5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.G0.invalidate();
                k5Var.D0.invalidate();
                k5Var.E0.invalidate();
                for (int i7 = 0; i7 < k5Var.G0.getChildCount(); i7++) {
                    View childAt = k5Var.G0.getChildAt(i7);
                    if (i7 == k5Var.J0) {
                        f10 = k5Var.K0;
                    } else if (i7 == k5Var.I0) {
                        f10 = 1.0f - k5Var.K0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = nr.f37961f.getInterpolation(k5Var.K0);
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
                db dbVar = (db) this.f12849b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12850c;
                hi.w wVar = (hi.w) this.d;
                dbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dbVar.setDrawable(wVar);
                    return;
                }
                return;
            case 3:
                pi.j jVar = (pi.j) this.f12849b;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f12850c;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jVar.f55726l) {
                    y1Var.f32408h0 = (-jVar.f55733s) * floatValue2;
                    y1Var.f32413i0 = (-jVar.f55734t) * floatValue2;
                    y1Var.f32422k0 = (-jVar.f55735u) * floatValue2;
                    y1Var.f32418j0 = (-jVar.v) * floatValue2;
                } else {
                    y1Var.f32408h0 = ((-jVar.f55733s) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.f32413i0 = ((-jVar.f55734t) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.f32422k0 = ((-jVar.f55735u) * floatValue2) - r1Var.getTranslationY();
                    y1Var.f32418j0 = ((-jVar.v) * floatValue2) - r1Var.getTranslationY();
                }
                r1Var.invalidate();
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f12849b;
                View view3 = (View) this.f12850c;
                View view4 = (View) this.d;
                h0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h0Var.P0.invalidate();
                h0Var.M0.invalidate();
                h0Var.N0.invalidate();
                for (int i10 = 0; i10 < h0Var.P0.getChildCount(); i10++) {
                    View childAt2 = h0Var.P0.getChildAt(i10);
                    if (i10 == h0Var.R0) {
                        f11 = h0Var.S0;
                    } else if (i10 == h0Var.Q0) {
                        f11 = 1.0f - h0Var.S0;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = nr.f37961f.getInterpolation(h0Var.S0);
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
