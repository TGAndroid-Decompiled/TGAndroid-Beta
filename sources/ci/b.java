package ci;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.r0;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ob0;
import th.f2;
import th.z2;
import vh.a9;
import vh.b4;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f4190a;
    public final Object f4191b;
    public final Object f4192c;
    public final Object d;

    public b(Object obj, Object obj2, Object obj3, int i10) {
        this.f4190a = i10;
        this.f4191b = obj;
        this.f4192c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f4190a) {
            case 0:
                n nVar = (n) this.f4191b;
                x1 x1Var = (x1) this.f4192c;
                q1 q1Var = (q1) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nVar.f4235l) {
                    x1Var.f23487h0 = (-nVar.f4242s) * floatValue;
                    x1Var.f23492i0 = (-nVar.f4243t) * floatValue;
                    x1Var.f23502k0 = (-nVar.f4244u) * floatValue;
                    x1Var.f23497j0 = (-nVar.v) * floatValue;
                } else {
                    x1Var.f23487h0 = ((-nVar.f4242s) * floatValue) - q1Var.getAnimationOffsetX();
                    x1Var.f23492i0 = ((-nVar.f4243t) * floatValue) - q1Var.getAnimationOffsetX();
                    x1Var.f23502k0 = ((-nVar.f4244u) * floatValue) - q1Var.getTranslationY();
                    x1Var.f23497j0 = ((-nVar.v) * floatValue) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                return;
            case 1:
                r0 r0Var = (r0) this.f4191b;
                View view = (View) this.f4192c;
                View view2 = (View) this.d;
                r0Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.O0.invalidate();
                r0Var.L0.invalidate();
                r0Var.M0.invalidate();
                for (int i10 = 0; i10 < r0Var.O0.getChildCount(); i10++) {
                    View childAt = r0Var.O0.getChildAt(i10);
                    if (i10 == r0Var.Q0) {
                        f7 = r0Var.R0;
                    } else if (i10 == r0Var.P0) {
                        f7 = 1.0f - r0Var.R0;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = gr.f26495f.getInterpolation(r0Var.R0);
                if (view != null && view2 != null) {
                    float f11 = 1.0f - interpolation;
                    float f12 = (f11 * 0.4f) + 0.6f;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * i0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f13 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f13);
                    view2.setScaleY(f13);
                    view2.setTranslationY((Math.min(f11, 0.25f) * (-i0.L(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f11, 0.25f) / 0.25f));
                    return;
                }
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.d;
                z2 z2Var = ((f2) this.f4191b).f48950a;
                z2Var.f49704e3 = ((Float) ((ValueAnimator) this.f4192c).getAnimatedValue()).floatValue();
                z2Var.invalidate();
                if (z2Var.f49704e3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    z2Var.Z2 = true;
                    try {
                        z2Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 3:
                b4 b4Var = (b4) this.f4191b;
                View view3 = (View) this.f4192c;
                View view4 = (View) this.d;
                b4Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.F0.invalidate();
                b4Var.C0.invalidate();
                b4Var.D0.invalidate();
                for (int i11 = 0; i11 < b4Var.F0.getChildCount(); i11++) {
                    View childAt2 = b4Var.F0.getChildAt(i11);
                    if (i11 == b4Var.I0) {
                        f10 = b4Var.J0;
                    } else if (i11 == b4Var.H0) {
                        f10 = 1.0f - b4Var.J0;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = gr.f26495f.getInterpolation(b4Var.J0);
                if (view3 != null && view4 != null) {
                    float f14 = 1.0f - interpolation2;
                    float f15 = (f14 * 0.4f) + 0.6f;
                    view3.setScaleX(f15);
                    view3.setScaleY(f15);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * i0.L(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f16 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f16);
                    view4.setScaleY(f16);
                    view4.setTranslationY((Math.min(f14, 0.25f) * (-i0.L(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f14, 0.25f) / 0.25f));
                    return;
                }
                return;
            default:
                a9 a9Var = (a9) this.f4191b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4192c;
                ob0 ob0Var = (ob0) this.d;
                a9Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue2 - 0.5f);
                if (floatValue2 >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    a9Var.setDrawable(ob0Var);
                    return;
                }
                return;
        }
    }
}
