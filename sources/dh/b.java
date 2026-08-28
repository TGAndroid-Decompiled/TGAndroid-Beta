package dh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wy;
import org.telegram.ui.nq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f4568a;
    public final int f4569b;
    public final Object f4570c;

    public b(Object obj, int i9, int i10) {
        this.f4568a = i10;
        this.f4570c = obj;
        this.f4569b = i9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9;
        switch (this.f4568a) {
            case 0:
                l lVar = (l) this.f4570c;
                lVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f4624n = floatValue;
                lVar.setAlpha((int) ((1.0f - floatValue) * this.f4569b));
                lVar.f4626p = true;
                lVar.invalidateSelf();
                return;
            case 1:
                f3 f3Var = (f3) this.f4570c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f4569b, intValue, intValue);
                return;
            case 2:
                t1 t1Var = (t1) this.f4570c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f4569b) {
                    t1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                ut utVar = (ut) this.f4570c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                utVar.d.setTranslationY(floatValue3);
                int i10 = this.f4569b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue3 / f10);
                utVar.N = f11;
                if (i10 > 0 && ((i9 = utVar.H) == 2 || i9 == 3)) {
                    utVar.d.setAlpha(f11);
                }
                utVar.c(floatValue3 - f10);
                return;
            case 4:
                ((wy) this.f4570c).M0[this.f4569b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                k90 k90Var = (k90) this.f4570c;
                float[] fArr = k90Var.V;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i11 = this.f4569b;
                fArr[i11] = floatValue4;
                h5[] h5VarArr = k90Var.f30040w;
                h5VarArr[i11].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i11].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i11]));
                h5VarArr[i11].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i11]));
                k90Var.f30041x[i11].setAlpha(fArr[i11]);
                return;
            default:
                nq nqVar = (nq) this.f4570c;
                nqVar.getClass();
                dk0 dk0Var = (dk0) nqVar.d;
                dk0Var.f27746b.put(this.f4569b, (Float) valueAnimator.getAnimatedValue());
                dk0Var.d = true;
                dk0Var.f27745a.invalidate();
                return;
        }
    }
}
