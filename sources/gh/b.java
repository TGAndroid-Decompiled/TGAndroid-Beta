package gh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.pq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f7359a;
    public final int f7360b;
    public final Object f7361c;

    public b(Object obj, int i10, int i11) {
        this.f7359a = i11;
        this.f7361c = obj;
        this.f7360b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f7359a) {
            case 0:
                k kVar = (k) this.f7361c;
                kVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f7414n = floatValue;
                kVar.setAlpha((int) ((1.0f - floatValue) * this.f7360b));
                kVar.f7416p = true;
                kVar.invalidateSelf();
                return;
            case 1:
                f3 f3Var = (f3) this.f7361c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f7360b, intValue, intValue);
                return;
            case 2:
                s1 s1Var = (s1) this.f7361c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.f7360b) {
                    s1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                au auVar = (au) this.f7361c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.d.setTranslationY(floatValue3);
                int i11 = this.f7360b;
                float f9 = i11;
                float f10 = 1.0f - (floatValue3 / f9);
                auVar.N = f10;
                if (i11 > 0 && ((i10 = auVar.H) == 2 || i10 == 3)) {
                    auVar.d.setAlpha(f10);
                }
                auVar.c(floatValue3 - f9);
                return;
            case 4:
                ((fz) this.f7361c).M0[this.f7360b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                y90 y90Var = (y90) this.f7361c;
                float[] fArr = y90Var.V;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f7360b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = y90Var.f35002w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                y90Var.f35003x[i12].setAlpha(fArr[i12]);
                return;
            default:
                pq pqVar = (pq) this.f7361c;
                pqVar.getClass();
                pk0 pk0Var = (pk0) pqVar.d;
                pk0Var.f31699b.put(this.f7360b, (Float) valueAnimator.getAnimatedValue());
                pk0Var.d = true;
                pk0Var.f31698a.invalidate();
                return;
        }
    }
}
