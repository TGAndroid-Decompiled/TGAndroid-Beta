package ai;

import android.animation.ValueAnimator;
import android.view.View;
import ci.xc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1698a;
    public final Object f1699b;
    public final Object f1700c;
    public final Object d;

    public x4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1698a = i10;
        this.f1699b = obj;
        this.f1700c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f1698a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                e6 e6Var = ((z4) this.f1699b).f1785a;
                e6Var.f835v3 = ((Float) ((ValueAnimator) this.f1700c).getAnimatedValue()).floatValue();
                e6Var.invalidate();
                if (e6Var.f835v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    e6Var.f820q3 = true;
                    try {
                        e6Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ci.q6 q6Var = (ci.q6) this.f1699b;
                View view = (View) this.f1700c;
                View view2 = (View) this.d;
                q6Var.f5340a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.W0.invalidate();
                q6Var.T0.invalidate();
                q6Var.U0.invalidate();
                for (int i10 = 0; i10 < q6Var.W0.getChildCount(); i10++) {
                    View childAt = q6Var.W0.getChildAt(i10);
                    if (i10 == q6Var.Z0) {
                        f7 = q6Var.f5340a1;
                    } else if (i10 == q6Var.Y0) {
                        f7 = 1.0f - q6Var.f5340a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = tr.f28636f.getInterpolation(q6Var.f5340a1);
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
                xc xcVar = (xc) this.f1699b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1700c;
                ci.u uVar = (ci.u) this.d;
                xcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    xcVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                ji.m mVar = (ji.m) this.f1699b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f1700c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f13091l) {
                    t1Var.f21126g0 = (-mVar.f13098s) * floatValue2;
                    t1Var.f21130h0 = (-mVar.f13099t) * floatValue2;
                    t1Var.f21140j0 = (-mVar.f13100u) * floatValue2;
                    t1Var.f21135i0 = (-mVar.v) * floatValue2;
                } else {
                    t1Var.f21126g0 = ((-mVar.f13098s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f21130h0 = ((-mVar.f13099t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f21140j0 = ((-mVar.f13100u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.f21135i0 = ((-mVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f1699b;
                View view3 = (View) this.f1700c;
                View view4 = (View) this.d;
                n0Var.f41886i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f41880f1.invalidate();
                n0Var.f41874c1.invalidate();
                n0Var.f41876d1.invalidate();
                for (int i11 = 0; i11 < n0Var.f41880f1.getChildCount(); i11++) {
                    View childAt2 = n0Var.f41880f1.getChildAt(i11);
                    if (i11 == n0Var.f41884h1) {
                        f10 = n0Var.f41886i1;
                    } else if (i11 == n0Var.f41882g1) {
                        f10 = 1.0f - n0Var.f41886i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = tr.f28636f.getInterpolation(n0Var.f41886i1);
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
