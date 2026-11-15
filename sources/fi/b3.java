package fi;

import android.animation.ValueAnimator;
import android.view.View;
import hi.db;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.er;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11454a;
    public final Object f11455b;
    public final Object f11456c;
    public final Object d;

    public b3(Object obj, Object obj2, Object obj3, int i7) {
        this.f11454a = i7;
        this.f11455b = obj;
        this.f11456c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f11454a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                b4 b4Var = ((d3) this.f11455b).f11623a;
                b4Var.f11473f3 = ((Float) ((ValueAnimator) this.f11456c).getAnimatedValue()).floatValue();
                b4Var.invalidate();
                if (b4Var.f11473f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    b4Var.f11459a3 = true;
                    try {
                        b4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                hi.m5 m5Var = (hi.m5) this.f11455b;
                View view = (View) this.f11456c;
                View view2 = (View) this.d;
                m5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.G0.invalidate();
                m5Var.D0.invalidate();
                m5Var.E0.invalidate();
                for (int i7 = 0; i7 < m5Var.G0.getChildCount(); i7++) {
                    View childAt = m5Var.G0.getChildAt(i7);
                    if (i7 == m5Var.J0) {
                        f10 = m5Var.K0;
                    } else if (i7 == m5Var.I0) {
                        f10 = 1.0f - m5Var.K0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = er.f34420f.getInterpolation(m5Var.K0);
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
                db dbVar = (db) this.f11455b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11456c;
                hi.u uVar = (hi.u) this.d;
                dbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dbVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                pi.j jVar = (pi.j) this.f11455b;
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f11456c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jVar.f55105l) {
                    x1Var.f31947h0 = (-jVar.f55112s) * floatValue2;
                    x1Var.f31952i0 = (-jVar.f55113t) * floatValue2;
                    x1Var.f31961k0 = (-jVar.f55114u) * floatValue2;
                    x1Var.f31957j0 = (-jVar.v) * floatValue2;
                } else {
                    x1Var.f31947h0 = ((-jVar.f55112s) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.f31952i0 = ((-jVar.f55113t) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.f31961k0 = ((-jVar.f55114u) * floatValue2) - q1Var.getTranslationY();
                    x1Var.f31957j0 = ((-jVar.v) * floatValue2) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f11455b;
                View view3 = (View) this.f11456c;
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
                float interpolation2 = er.f34420f.getInterpolation(g0Var.S0);
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
