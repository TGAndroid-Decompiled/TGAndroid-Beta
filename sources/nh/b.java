package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.uq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f13802a;
    public final int f13803b;
    public final Object f13804c;

    public b(Object obj, int i10, int i11) {
        this.f13802a = i11;
        this.f13804c = obj;
        this.f13803b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f13802a) {
            case 0:
                i iVar = (i) this.f13804c;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f13850n = floatValue;
                iVar.setAlpha((int) ((1.0f - floatValue) * this.f13803b));
                iVar.f13852p = true;
                iVar.invalidateSelf();
                return;
            case 1:
                z2 z2Var = (z2) this.f13804c;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.C0(this.f13803b, intValue, intValue);
                return;
            case 2:
                q1 q1Var = (q1) this.f13804c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.f13803b) {
                    q1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                wt wtVar = (wt) this.f13804c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.d.setTranslationY(floatValue3);
                int i11 = this.f13803b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue3 / f7);
                wtVar.R = f10;
                if (i11 > 0 && ((i10 = wtVar.L) == 2 || i10 == 3)) {
                    wtVar.d.setAlpha(f10);
                }
                wtVar.c(floatValue3 - f7);
                return;
            case 4:
                ((vy) this.f13804c).Q0[this.f13803b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                d50 d50Var = (d50) this.f13804c;
                if (this.f13803b == d50Var.f25400s0) {
                    float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue4 >= 0.5f) {
                        floatValue4 -= 1.0f;
                    }
                    d50Var.f25406x.setRotationY(floatValue4 * 180.0f);
                    return;
                }
                return;
            default:
                uq uqVar = (uq) this.f13804c;
                uqVar.getClass();
                xj0 xj0Var = (xj0) uqVar.d;
                xj0Var.f32593b.put(this.f13803b, (Float) valueAnimator.getAnimatedValue());
                xj0Var.d = true;
                xj0Var.f32592a.invalidate();
                return;
        }
    }
}
