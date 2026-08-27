package jh;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.dc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class g3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f13351a;

    public final Object f13352b;

    public final Object f13353c;
    public final Object d;

    public g3(Object obj, Object obj2, Object obj3, int i10) {
        this.f13351a = i10;
        this.f13352b = obj;
        this.f13353c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13351a) {
            case 0:
                i3 i3Var = (i3) this.f13352b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.f13353c;
                boolean[] zArr = (boolean[]) this.d;
                e4 e4Var = i3Var.f13436a;
                e4Var.f13269r3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                if (e4Var.f13269r3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    e4Var.f13254m3 = true;
                    try {
                        e4Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 1:
                lh.f6 f6Var = (lh.f6) this.f13352b;
                View view = (View) this.f13353c;
                View view2 = (View) this.d;
                f6Var.W0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.S0.invalidate();
                f6Var.P0.invalidate();
                f6Var.Q0.invalidate();
                int i10 = 0;
                while (i10 < f6Var.S0.getChildCount()) {
                    f6Var.S0.getChildAt(i10).setAlpha(((i10 == f6Var.V0 ? f6Var.W0 : i10 == f6Var.U0 ? 1.0f - f6Var.W0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = er.f28122f.getInterpolation(f6Var.W0);
                if (view != null && view2 != null) {
                    float f10 = 1.0f - interpolation;
                    float f11 = (f10 * 0.4f) + 0.6f;
                    view.setScaleX(f11);
                    view.setScaleY(f11);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f12 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f12);
                    view2.setScaleY(f12);
                    view2.setTranslationY((Math.min(f10, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f10, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                dc dcVar = (dc) this.f13352b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f13353c;
                lh.v vVar = (lh.v) this.d;
                dcVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(fFloatValue - 0.5f);
                if (fFloatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dcVar.setDrawable(vVar);
                    break;
                }
                break;
            case 3:
                sh.l lVar = (sh.l) this.f13352b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f13353c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.f47972l) {
                    r1Var.f25119g0 = (-lVar.f47979s) * fFloatValue2;
                    r1Var.f25123h0 = (-lVar.f47980t) * fFloatValue2;
                    r1Var.f25133j0 = (-lVar.f47981u) * fFloatValue2;
                    r1Var.f25128i0 = (-lVar.v) * fFloatValue2;
                } else {
                    r1Var.f25119g0 = ((-lVar.f47979s) * fFloatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f25123h0 = ((-lVar.f47980t) * fFloatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.f25133j0 = ((-lVar.f47981u) * fFloatValue2) - s1Var.getTranslationY();
                    r1Var.f25128i0 = ((-lVar.v) * fFloatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f13352b;
                View view3 = (View) this.f13353c;
                View view4 = (View) this.d;
                l0Var.f50512e1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f50506b1.invalidate();
                l0Var.Y0.invalidate();
                l0Var.Z0.invalidate();
                int i11 = 0;
                while (i11 < l0Var.f50506b1.getChildCount()) {
                    l0Var.f50506b1.getChildAt(i11).setAlpha(((i11 == l0Var.f50510d1 ? l0Var.f50512e1 : i11 == l0Var.f50508c1 ? 1.0f - l0Var.f50512e1 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = er.f28122f.getInterpolation(l0Var.f50512e1);
                if (view3 != null && view4 != null) {
                    float f13 = 1.0f - interpolation2;
                    float f14 = (f13 * 0.4f) + 0.6f;
                    view3.setScaleX(f14);
                    view3.setScaleY(f14);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f15 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f15);
                    view4.setScaleY(f15);
                    view4.setTranslationY((Math.min(f13, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f13, 0.25f) / 0.25f));
                    break;
                }
                break;
        }
    }
}
