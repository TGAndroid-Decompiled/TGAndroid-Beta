package jh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.wq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f10089a;
    public final int f10090b;
    public final Object f10091c;

    public b(Object obj, int i10, int i11) {
        this.f10089a = i11;
        this.f10091c = obj;
        this.f10090b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f10089a) {
            case 0:
                k kVar = (k) this.f10091c;
                kVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f10144n = floatValue;
                kVar.setAlpha((int) ((1.0f - floatValue) * this.f10090b));
                kVar.f10146p = true;
                kVar.invalidateSelf();
                return;
            case 1:
                h3 h3Var = (h3) this.f10091c;
                h3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var.setItemColor(this.f10090b, intValue, intValue);
                return;
            case 2:
                t1 t1Var = (t1) this.f10091c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f10090b) {
                    t1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                fu fuVar = (fu) this.f10091c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fuVar.d.setTranslationY(floatValue3);
                int i11 = this.f10090b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                fuVar.O = f11;
                if (i11 > 0 && ((i10 = fuVar.I) == 2 || i10 == 3)) {
                    fuVar.d.setAlpha(f11);
                }
                fuVar.c(floatValue3 - f10);
                return;
            case 4:
                ((mz) this.f10091c).N0[this.f10090b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                fa0 fa0Var = (fa0) this.f10091c;
                float[] fArr = fa0Var.W;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f10090b;
                fArr[i12] = floatValue4;
                l5[] l5VarArr = fa0Var.f26857w;
                l5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                l5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                l5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                fa0Var.f26858x[i12].setAlpha(fArr[i12]);
                return;
            default:
                wq wqVar = (wq) this.f10091c;
                wqVar.getClass();
                zk0 zk0Var = (zk0) wqVar.d;
                zk0Var.f33963b.put(this.f10090b, (Float) valueAnimator.getAnimatedValue());
                zk0Var.d = true;
                zk0Var.f33962a.invalidate();
                return;
        }
    }
}
