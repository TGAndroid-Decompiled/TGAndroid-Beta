package bg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.rb;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f2495a;
    public final Object f2496b;
    public final Object f2497c;
    public final Object d;

    public s(Object obj, Object obj2, Object obj3, int i10) {
        this.f2495a = i10;
        this.f2496b = obj;
        this.f2497c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f9;
        float f10;
        switch (this.f2495a) {
            case 0:
                g1 g1Var = (g1) this.f2496b;
                View view = (View) this.f2497c;
                View view2 = (View) this.d;
                g1Var.f2231e1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.f2225b1.invalidate();
                g1Var.Y0.invalidate();
                g1Var.Z0.invalidate();
                for (int i10 = 0; i10 < g1Var.f2225b1.getChildCount(); i10++) {
                    View childAt = g1Var.f2225b1.getChildAt(i10);
                    if (i10 == g1Var.f2229d1) {
                        f9 = g1Var.f2231e1;
                    } else if (i10 == g1Var.f2227c1) {
                        f9 = 1.0f - g1Var.f2231e1;
                    } else {
                        f9 = 0.0f;
                    }
                    childAt.setAlpha((f9 * 0.4f) + 0.6f);
                }
                float interpolation = jr.f29800f.getInterpolation(g1Var.f2231e1);
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
            case 1:
                boolean[] zArr = (boolean[]) this.d;
                lh.d4 d4Var = ((lh.g3) this.f2496b).f15619a;
                d4Var.f15518r3 = ((Float) ((ValueAnimator) this.f2497c).getAnimatedValue()).floatValue();
                d4Var.invalidate();
                if (d4Var.f15518r3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    d4Var.f15503m3 = true;
                    try {
                        d4Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                t5 t5Var = (t5) this.f2496b;
                View view3 = (View) this.f2497c;
                View view4 = (View) this.d;
                t5Var.W0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.S0.invalidate();
                t5Var.P0.invalidate();
                t5Var.Q0.invalidate();
                for (int i11 = 0; i11 < t5Var.S0.getChildCount(); i11++) {
                    View childAt2 = t5Var.S0.getChildAt(i11);
                    if (i11 == t5Var.V0) {
                        f10 = t5Var.W0;
                    } else if (i11 == t5Var.U0) {
                        f10 = 1.0f - t5Var.W0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = jr.f29800f.getInterpolation(t5Var.W0);
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
            case 3:
                rb rbVar = (rb) this.f2496b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2497c;
                nh.u uVar = (nh.u) this.d;
                rbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    rbVar.setDrawable(uVar);
                    return;
                }
                return;
            default:
                uh.l lVar = (uh.l) this.f2496b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f2497c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f49288l) {
                    r1Var.f25124g0 = (-lVar.f49295s) * floatValue2;
                    r1Var.f25128h0 = (-lVar.f49296t) * floatValue2;
                    r1Var.f25138j0 = (-lVar.f49297u) * floatValue2;
                    r1Var.f25133i0 = (-lVar.v) * floatValue2;
                } else {
                    r1Var.f25124g0 = ((-lVar.f49295s) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f25128h0 = ((-lVar.f49296t) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f25138j0 = ((-lVar.f49297u) * floatValue2) - s1Var.getTranslationY();
                    r1Var.f25133i0 = ((-lVar.v) * floatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                return;
        }
    }
}
