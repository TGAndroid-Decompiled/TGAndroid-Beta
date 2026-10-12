package bi;

import android.animation.ValueAnimator;
import android.view.View;
import di.vc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3272a;
    public final Object f3273b;
    public final Object f3274c;
    public final Object d;

    public l4(Object obj, Object obj2, Object obj3, int i10) {
        this.f3272a = i10;
        this.f3273b = obj;
        this.f3274c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f3272a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                q5 q5Var = ((n4) this.f3273b).f3358a;
                q5Var.f3571v3 = ((Float) ((ValueAnimator) this.f3274c).getAnimatedValue()).floatValue();
                q5Var.invalidate();
                if (q5Var.f3571v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    q5Var.f3556q3 = true;
                    try {
                        q5Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                di.o6 o6Var = (di.o6) this.f3273b;
                View view = (View) this.f3274c;
                View view2 = (View) this.d;
                o6Var.f7512a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.W0.invalidate();
                o6Var.T0.invalidate();
                o6Var.U0.invalidate();
                for (int i10 = 0; i10 < o6Var.W0.getChildCount(); i10++) {
                    View childAt = o6Var.W0.getChildAt(i10);
                    if (i10 == o6Var.Z0) {
                        f7 = o6Var.f7512a1;
                    } else if (i10 == o6Var.Y0) {
                        f7 = 1.0f - o6Var.f7512a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = es.f24771f.getInterpolation(o6Var.f7512a1);
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
                vc vcVar = (vc) this.f3273b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f3274c;
                di.u uVar = (di.u) this.d;
                vcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    vcVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                ki.m mVar = (ki.m) this.f3273b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f3274c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f14334l) {
                    t1Var.f21990g0 = (-mVar.f14341s) * floatValue2;
                    t1Var.f21994h0 = (-mVar.f14342t) * floatValue2;
                    t1Var.f22004j0 = (-mVar.f14343u) * floatValue2;
                    t1Var.f21999i0 = (-mVar.v) * floatValue2;
                } else {
                    t1Var.f21990g0 = ((-mVar.f14341s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f21994h0 = ((-mVar.f14342t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f22004j0 = ((-mVar.f14343u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.f21999i0 = ((-mVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f3273b;
                View view3 = (View) this.f3274c;
                View view4 = (View) this.d;
                o0Var.f44415i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.f44409f1.invalidate();
                o0Var.f44403c1.invalidate();
                o0Var.f44405d1.invalidate();
                for (int i11 = 0; i11 < o0Var.f44409f1.getChildCount(); i11++) {
                    View childAt2 = o0Var.f44409f1.getChildAt(i11);
                    if (i11 == o0Var.f44413h1) {
                        f10 = o0Var.f44415i1;
                    } else if (i11 == o0Var.f44411g1) {
                        f10 = 1.0f - o0Var.f44415i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = es.f24771f.getInterpolation(o0Var.f44415i1);
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
