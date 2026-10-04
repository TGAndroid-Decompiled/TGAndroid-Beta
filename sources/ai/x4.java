package ai;

import android.animation.ValueAnimator;
import android.view.View;
import ci.wc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1841a;
    public final Object f1842b;
    public final Object f1843c;
    public final Object d;

    public x4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1841a = i10;
        this.f1842b = obj;
        this.f1843c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f1841a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                e6 e6Var = ((z4) this.f1842b).f1933a;
                e6Var.f903v3 = ((Float) ((ValueAnimator) this.f1843c).getAnimatedValue()).floatValue();
                e6Var.invalidate();
                if (e6Var.f903v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    e6Var.f888q3 = true;
                    try {
                        e6Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ci.q6 q6Var = (ci.q6) this.f1842b;
                View view = (View) this.f1843c;
                View view2 = (View) this.d;
                q6Var.f5745a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.W0.invalidate();
                q6Var.T0.invalidate();
                q6Var.U0.invalidate();
                for (int i10 = 0; i10 < q6Var.W0.getChildCount(); i10++) {
                    View childAt = q6Var.W0.getChildAt(i10);
                    if (i10 == q6Var.Z0) {
                        f7 = q6Var.f5745a1;
                    } else if (i10 == q6Var.Y0) {
                        f7 = 1.0f - q6Var.f5745a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = tr.f31141f.getInterpolation(q6Var.f5745a1);
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
                wc wcVar = (wc) this.f1842b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1843c;
                ci.u uVar = (ci.u) this.d;
                wcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    wcVar.setDrawable(uVar);
                    return;
                }
                return;
            case 3:
                ji.m mVar = (ji.m) this.f1842b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f1843c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f14218l) {
                    t1Var.f22959g0 = (-mVar.f14225s) * floatValue2;
                    t1Var.f22963h0 = (-mVar.f14226t) * floatValue2;
                    t1Var.f22973j0 = (-mVar.f14227u) * floatValue2;
                    t1Var.f22968i0 = (-mVar.v) * floatValue2;
                } else {
                    t1Var.f22959g0 = ((-mVar.f14225s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f22963h0 = ((-mVar.f14226t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.f22973j0 = ((-mVar.f14227u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.f22968i0 = ((-mVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f1842b;
                View view3 = (View) this.f1843c;
                View view4 = (View) this.d;
                m0Var.f45171i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f45165f1.invalidate();
                m0Var.f45159c1.invalidate();
                m0Var.f45161d1.invalidate();
                for (int i11 = 0; i11 < m0Var.f45165f1.getChildCount(); i11++) {
                    View childAt2 = m0Var.f45165f1.getChildAt(i11);
                    if (i11 == m0Var.f45169h1) {
                        f10 = m0Var.f45171i1;
                    } else if (i11 == m0Var.f45167g1) {
                        f10 = 1.0f - m0Var.f45171i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = tr.f31141f.getInterpolation(m0Var.f45171i1);
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
