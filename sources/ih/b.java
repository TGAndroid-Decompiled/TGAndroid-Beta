package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.xq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f7545a;
    public final int f7546b;
    public final Object f7547c;

    public b(Object obj, int i10, int i11) {
        this.f7545a = i11;
        this.f7547c = obj;
        this.f7546b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f7545a) {
            case 0:
                k kVar = (k) this.f7547c;
                kVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f7595n = floatValue;
                kVar.setAlpha((int) ((1.0f - floatValue) * this.f7546b));
                kVar.f7597p = true;
                kVar.invalidateSelf();
                return;
            case 1:
                g3 g3Var = (g3) this.f7547c;
                g3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g3Var.setItemColor(this.f7546b, intValue, intValue);
                return;
            case 2:
                s1 s1Var = (s1) this.f7547c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.f7546b) {
                    s1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                cu cuVar = (cu) this.f7547c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cuVar.d.setTranslationY(floatValue3);
                int i11 = this.f7546b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                cuVar.O = f11;
                if (i11 > 0 && ((i10 = cuVar.I) == 2 || i10 == 3)) {
                    cuVar.d.setAlpha(f11);
                }
                cuVar.c(floatValue3 - f10);
                return;
            case 4:
                ((kz) this.f7547c).N0[this.f7546b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                ea0 ea0Var = (ea0) this.f7547c;
                float[] fArr = ea0Var.W;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f7546b;
                fArr[i12] = floatValue4;
                k5[] k5VarArr = ea0Var.f24561w;
                k5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                k5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                k5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ea0Var.f24562x[i12].setAlpha(fArr[i12]);
                return;
            default:
                xq xqVar = (xq) this.f7547c;
                xqVar.getClass();
                yk0 yk0Var = (yk0) xqVar.d;
                yk0Var.f31046b.put(this.f7546b, (Float) valueAnimator.getAnimatedValue());
                yk0Var.d = true;
                yk0Var.f31045a.invalidate();
                return;
        }
    }
}
