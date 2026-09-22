package ai;

import android.animation.ValueAnimator;
import android.view.View;
import ci.ad;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1693a;
    public final Object f1694b;
    public final Object f1695c;
    public final Object d;

    public x4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1693a = i10;
        this.f1694b = obj;
        this.f1695c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f1693a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                f6 f6Var = ((z4) this.f1694b).f1781a;
                f6Var.f859v3 = ((Float) ((ValueAnimator) this.f1695c).getAnimatedValue()).floatValue();
                f6Var.invalidate();
                if (f6Var.f859v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    f6Var.f844q3 = true;
                    try {
                        f6Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ci.r6 r6Var = (ci.r6) this.f1694b;
                View view = (View) this.f1695c;
                View view2 = (View) this.d;
                r6Var.f5408a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.W0.invalidate();
                r6Var.T0.invalidate();
                r6Var.U0.invalidate();
                for (int i10 = 0; i10 < r6Var.W0.getChildCount(); i10++) {
                    View childAt = r6Var.W0.getChildAt(i10);
                    if (i10 == r6Var.Z0) {
                        f7 = r6Var.f5408a1;
                    } else if (i10 == r6Var.Y0) {
                        f7 = 1.0f - r6Var.f5408a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = qr.f27653f.getInterpolation(r6Var.f5408a1);
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
                ad adVar = (ad) this.f1694b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1695c;
                ci.u uVar = (ci.u) this.d;
                adVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    adVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                ji.m mVar = (ji.m) this.f1694b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f1695c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f13088l) {
                    t1Var.f21122g0 = (-mVar.f13095s) * floatValue2;
                    t1Var.f21126h0 = (-mVar.f13096t) * floatValue2;
                    t1Var.f21136j0 = (-mVar.f13097u) * floatValue2;
                    t1Var.f21131i0 = (-mVar.v) * floatValue2;
                } else {
                    t1Var.f21122g0 = ((-mVar.f13095s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f21126h0 = ((-mVar.f13096t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f21136j0 = ((-mVar.f13097u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.f21131i0 = ((-mVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f1694b;
                View view3 = (View) this.f1695c;
                View view4 = (View) this.d;
                n0Var.f41820i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f41814f1.invalidate();
                n0Var.f41808c1.invalidate();
                n0Var.f41810d1.invalidate();
                for (int i11 = 0; i11 < n0Var.f41814f1.getChildCount(); i11++) {
                    View childAt2 = n0Var.f41814f1.getChildAt(i11);
                    if (i11 == n0Var.f41818h1) {
                        f10 = n0Var.f41820i1;
                    } else if (i11 == n0Var.f41816g1) {
                        f10 = 1.0f - n0Var.f41820i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = qr.f27653f.getInterpolation(n0Var.f41820i1);
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
