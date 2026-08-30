package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.vq;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f7563a;
    public final int f7564b;
    public final Object f7565c;

    public b(Object obj, int i10, int i11) {
        this.f7563a = i11;
        this.f7565c = obj;
        this.f7564b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f7563a) {
            case 0:
                k kVar = (k) this.f7565c;
                kVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f7613n = floatValue;
                kVar.setAlpha((int) ((1.0f - floatValue) * this.f7564b));
                kVar.f7615p = true;
                kVar.invalidateSelf();
                return;
            case 1:
                g3 g3Var = (g3) this.f7565c;
                g3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g3Var.setItemColor(this.f7564b, intValue, intValue);
                return;
            case 2:
                t1 t1Var = (t1) this.f7565c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f7564b) {
                    t1Var.setSelectedBackgroundProgress(floatValue2);
                    return;
                }
                return;
            case 3:
                du duVar = (du) this.f7565c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                duVar.d.setTranslationY(floatValue3);
                int i11 = this.f7564b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                duVar.O = f11;
                if (i11 > 0 && ((i10 = duVar.I) == 2 || i10 == 3)) {
                    duVar.d.setAlpha(f11);
                }
                duVar.c(floatValue3 - f10);
                return;
            case 4:
                ((kz) this.f7565c).N0[this.f7564b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                da0 da0Var = (da0) this.f7565c;
                float[] fArr = da0Var.W;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f7564b;
                fArr[i12] = floatValue4;
                k5[] k5VarArr = da0Var.f24222w;
                k5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                k5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                k5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                da0Var.f24223x[i12].setAlpha(fArr[i12]);
                return;
            default:
                vq vqVar = (vq) this.f7565c;
                vqVar.getClass();
                zk0 zk0Var = (zk0) vqVar.d;
                zk0Var.f31375b.put(this.f7564b, (Float) valueAnimator.getAnimatedValue());
                zk0Var.d = true;
                zk0Var.f31374a.invalidate();
                return;
        }
    }
}
