package ih;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.hc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class i3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11529a;
    public final Object f11530b;
    public final Object f11531c;
    public final Object d;

    public i3(Object obj, Object obj2, Object obj3, int i9) {
        this.f11529a = i9;
        this.f11530b = obj;
        this.f11531c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f11529a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                i4 i4Var = ((k3) this.f11530b).f11670a;
                i4Var.f11582r3 = ((Float) ((ValueAnimator) this.f11531c).getAnimatedValue()).floatValue();
                i4Var.invalidate();
                if (i4Var.f11582r3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    i4Var.f11567m3 = true;
                    try {
                        i4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                kh.g6 g6Var = (kh.g6) this.f11530b;
                View view = (View) this.f11531c;
                View view2 = (View) this.d;
                g6Var.W0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.S0.invalidate();
                g6Var.P0.invalidate();
                g6Var.Q0.invalidate();
                for (int i9 = 0; i9 < g6Var.S0.getChildCount(); i9++) {
                    View childAt = g6Var.S0.getChildAt(i9);
                    if (i9 == g6Var.V0) {
                        f10 = g6Var.W0;
                    } else if (i9 == g6Var.U0) {
                        f10 = 1.0f - g6Var.W0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation = gr.f28844f.getInterpolation(g6Var.W0);
                if (view != null && view2 != null) {
                    float f12 = 1.0f - interpolation;
                    float f13 = (f12 * 0.4f) + 0.6f;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f14 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f14);
                    view2.setScaleY(f14);
                    view2.setTranslationY((Math.min(f12, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f12, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 2:
                hc hcVar = (hc) this.f11530b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11531c;
                kh.v vVar = (kh.v) this.d;
                hcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    hcVar.setDrawable(vVar);
                    return;
                }
                return;
            case 3:
                rh.l lVar = (rh.l) this.f11530b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f11531c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f47251l) {
                    s1Var.f25168g0 = (-lVar.f47258s) * floatValue2;
                    s1Var.f25172h0 = (-lVar.f47259t) * floatValue2;
                    s1Var.f25182j0 = (-lVar.f47260u) * floatValue2;
                    s1Var.f25177i0 = (-lVar.v) * floatValue2;
                } else {
                    s1Var.f25168g0 = ((-lVar.f47258s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f25172h0 = ((-lVar.f47259t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f25182j0 = ((-lVar.f47260u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.f25177i0 = ((-lVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.f11530b;
                View view3 = (View) this.f11531c;
                View view4 = (View) this.d;
                l0Var.f49934e1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f49928b1.invalidate();
                l0Var.Y0.invalidate();
                l0Var.Z0.invalidate();
                for (int i10 = 0; i10 < l0Var.f49928b1.getChildCount(); i10++) {
                    View childAt2 = l0Var.f49928b1.getChildAt(i10);
                    if (i10 == l0Var.f49932d1) {
                        f11 = l0Var.f49934e1;
                    } else if (i10 == l0Var.f49930c1) {
                        f11 = 1.0f - l0Var.f49934e1;
                    } else {
                        f11 = 0.0f;
                    }
                    childAt2.setAlpha((f11 * 0.4f) + 0.6f);
                }
                float interpolation2 = gr.f28844f.getInterpolation(l0Var.f49934e1);
                if (view3 != null && view4 != null) {
                    float f15 = 1.0f - interpolation2;
                    float f16 = (f15 * 0.4f) + 0.6f;
                    view3.setScaleX(f16);
                    view3.setScaleY(f16);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f17 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f17);
                    view4.setScaleY(f17);
                    view4.setTranslationY((Math.min(f15, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f15, 0.25f) / 0.25f));
                    return;
                }
                return;
        }
    }
}
