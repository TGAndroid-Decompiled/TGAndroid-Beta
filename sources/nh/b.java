package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.uq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f13801a;
    public final int f13802b;
    public final Object f13803c;

    public b(Object obj, int i10, int i11) {
        this.f13801a = i11;
        this.f13803c = obj;
        this.f13802b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f13801a) {
            case 0:
                i iVar = (i) this.f13803c;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f13849n = floatValue;
                iVar.setAlpha((int) ((1.0f - floatValue) * this.f13802b));
                iVar.f13851p = true;
                iVar.invalidateSelf();
                return;
            case 1:
                z2 z2Var = (z2) this.f13803c;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.C0(this.f13802b, intValue, intValue);
                return;
            case 2:
                q1 q1Var = (q1) this.f13803c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.f13802b) {
                    q1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                wt wtVar = (wt) this.f13803c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.d.setTranslationY(floatValue3);
                int i11 = this.f13802b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue3 / f7);
                wtVar.R = f10;
                if (i11 > 0 && ((i10 = wtVar.L) == 2 || i10 == 3)) {
                    wtVar.d.setAlpha(f10);
                }
                wtVar.c(floatValue3 - f7);
                return;
            case 4:
                ((vy) this.f13803c).Q0[this.f13802b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                d50 d50Var = (d50) this.f13803c;
                if (this.f13802b == d50Var.f25329s0) {
                    float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue4 >= 0.5f) {
                        floatValue4 -= 1.0f;
                    }
                    d50Var.f25335x.setRotationY(floatValue4 * 180.0f);
                    return;
                }
                return;
            default:
                uq uqVar = (uq) this.f13803c;
                uqVar.getClass();
                wj0 wj0Var = (wj0) uqVar.d;
                wj0Var.f32210b.put(this.f13802b, (Float) valueAnimator.getAnimatedValue());
                wj0Var.d = true;
                wj0Var.f32209a.invalidate();
                return;
        }
    }
}
