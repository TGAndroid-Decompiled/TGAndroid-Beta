package bi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3786a;
    public final Object f3787b;
    public final Object f3788c;
    public final Object d;

    public v5(Object obj, Object obj2, Object obj3, int i10) {
        this.f3786a = i10;
        this.f3787b = obj;
        this.f3788c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f3786a) {
            case 0:
                r7 r7Var = (r7) this.f3787b;
                View view = (View) this.f3788c;
                View view2 = (View) this.d;
                r7Var.f3500a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.W0.invalidate();
                r7Var.T0.invalidate();
                r7Var.U0.invalidate();
                for (int i10 = 0; i10 < r7Var.W0.getChildCount(); i10++) {
                    View childAt = r7Var.W0.getChildAt(i10);
                    if (i10 == r7Var.Z0) {
                        f7 = r7Var.f3500a1;
                    } else if (i10 == r7Var.Y0) {
                        f7 = 1.0f - r7Var.f3500a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = wr.f28819f.getInterpolation(r7Var.f3500a1);
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
                ne neVar = (ne) this.f3787b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f3788c;
                y yVar = (y) this.d;
                neVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    neVar.setDrawable(yVar);
                    return;
                }
                return;
            case 2:
                ii.m mVar = (ii.m) this.f3787b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f3788c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.f10676l) {
                    s1Var.f19946g0 = (-mVar.f10683s) * floatValue2;
                    s1Var.f19950h0 = (-mVar.f10684t) * floatValue2;
                    s1Var.f19960j0 = (-mVar.f10685u) * floatValue2;
                    s1Var.f19955i0 = (-mVar.v) * floatValue2;
                } else {
                    s1Var.f19946g0 = ((-mVar.f10683s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f19950h0 = ((-mVar.f10684t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f19960j0 = ((-mVar.f10685u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.f19955i0 = ((-mVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                return;
            case 3:
                pg.m0 m0Var = (pg.m0) this.f3787b;
                View view3 = (View) this.f3788c;
                View view4 = (View) this.d;
                m0Var.f40138i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f40132f1.invalidate();
                m0Var.f40126c1.invalidate();
                m0Var.f40128d1.invalidate();
                for (int i11 = 0; i11 < m0Var.f40132f1.getChildCount(); i11++) {
                    View childAt2 = m0Var.f40132f1.getChildAt(i11);
                    if (i11 == m0Var.f40136h1) {
                        f10 = m0Var.f40138i1;
                    } else if (i11 == m0Var.f40134g1) {
                        f10 = 1.0f - m0Var.f40138i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = wr.f28819f.getInterpolation(m0Var.f40138i1);
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
            default:
                boolean[] zArr = (boolean[]) this.d;
                zh.a3 a3Var = ((zh.g2) this.f3787b).f48429a;
                a3Var.f48219v3 = ((Float) ((ValueAnimator) this.f3788c).getAnimatedValue()).floatValue();
                a3Var.invalidate();
                if (a3Var.f48219v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    a3Var.f48204q3 = true;
                    try {
                        a3Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
