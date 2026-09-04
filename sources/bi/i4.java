package bi;

import android.animation.ValueAnimator;
import android.view.View;
import di.ad;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class i4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3093a;
    public final Object f3094b;
    public final Object f3095c;
    public final Object d;

    public i4(Object obj, Object obj2, Object obj3, int i10) {
        this.f3093a = i10;
        this.f3094b = obj;
        this.f3095c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f3093a) {
            case 0:
                boolean[] zArr = (boolean[]) this.d;
                o5 o5Var = ((k4) this.f3094b).f3194a;
                o5Var.f3468v3 = ((Float) ((ValueAnimator) this.f3095c).getAnimatedValue()).floatValue();
                o5Var.invalidate();
                if (o5Var.f3468v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    o5Var.f3453q3 = true;
                    try {
                        o5Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                di.q6 q6Var = (di.q6) this.f3094b;
                View view = (View) this.f3095c;
                View view2 = (View) this.d;
                q6Var.f7953a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.W0.invalidate();
                q6Var.T0.invalidate();
                q6Var.U0.invalidate();
                for (int i10 = 0; i10 < q6Var.W0.getChildCount(); i10++) {
                    View childAt = q6Var.W0.getChildAt(i10);
                    if (i10 == q6Var.Z0) {
                        f7 = q6Var.f7953a1;
                    } else if (i10 == q6Var.Y0) {
                        f7 = 1.0f - q6Var.f7953a1;
                    } else {
                        f7 = 0.0f;
                    }
                    childAt.setAlpha((f7 * 0.4f) + 0.6f);
                }
                float interpolation = pr.f29466f.getInterpolation(q6Var.f7953a1);
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
                ad adVar = (ad) this.f3094b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f3095c;
                di.u uVar = (di.u) this.d;
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
                ki.n nVar = (ki.n) this.f3094b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f3095c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nVar.f15024l) {
                    s1Var.f22736g0 = (-nVar.f15031s) * floatValue2;
                    s1Var.f22740h0 = (-nVar.f15032t) * floatValue2;
                    s1Var.f22750j0 = (-nVar.f15033u) * floatValue2;
                    s1Var.f22745i0 = (-nVar.v) * floatValue2;
                } else {
                    s1Var.f22736g0 = ((-nVar.f15031s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f22740h0 = ((-nVar.f15032t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.f22750j0 = ((-nVar.f15033u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.f22745i0 = ((-nVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f3094b;
                View view3 = (View) this.f3095c;
                View view4 = (View) this.d;
                o0Var.f45353i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.f45347f1.invalidate();
                o0Var.f45341c1.invalidate();
                o0Var.f45343d1.invalidate();
                for (int i11 = 0; i11 < o0Var.f45347f1.getChildCount(); i11++) {
                    View childAt2 = o0Var.f45347f1.getChildAt(i11);
                    if (i11 == o0Var.f45351h1) {
                        f10 = o0Var.f45353i1;
                    } else if (i11 == o0Var.f45349g1) {
                        f10 = 1.0f - o0Var.f45353i1;
                    } else {
                        f10 = 0.0f;
                    }
                    childAt2.setAlpha((f10 * 0.4f) + 0.6f);
                }
                float interpolation2 = pr.f29466f.getInterpolation(o0Var.f45353i1);
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
