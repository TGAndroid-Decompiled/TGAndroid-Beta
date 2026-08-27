package eh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.yy;
import org.telegram.ui.pq;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    public final int f5467a;

    public final int f5468b;

    public final Object f5469c;

    public b(Object obj, int i10, int i11) {
        this.f5467a = i11;
        this.f5469c = obj;
        this.f5468b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f5467a) {
            case 0:
                k kVar = (k) this.f5469c;
                kVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f5522n = fFloatValue;
                kVar.setAlpha((int) ((1.0f - fFloatValue) * this.f5468b));
                kVar.f5524p = true;
                kVar.invalidateSelf();
                break;
            case 1:
                e3 e3Var = (e3) this.f5469c;
                e3Var.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f5468b, iIntValue, iIntValue);
                break;
            case 2:
                s1 s1Var = (s1) this.f5469c;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.f5468b) {
                    s1Var.setSelectedBackgroundProgress(fFloatValue2);
                    break;
                }
                break;
            case 3:
                tt ttVar = (tt) this.f5469c;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ttVar.d.setTranslationY(fFloatValue3);
                int i11 = this.f5468b;
                float f10 = i11;
                float f11 = 1.0f - (fFloatValue3 / f10);
                ttVar.N = f11;
                if (i11 > 0 && ((i10 = ttVar.H) == 2 || i10 == 3)) {
                    ttVar.d.setAlpha(f11);
                }
                ttVar.c(fFloatValue3 - f10);
                break;
            case 4:
                ((yy) this.f5469c).M0[this.f5468b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                o90 o90Var = (o90) this.f5469c;
                float[] fArr = o90Var.V;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f5468b;
                fArr[i12] = fFloatValue4;
                h5[] h5VarArr = o90Var.f31244w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, fFloatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                o90Var.f31245x[i12].setAlpha(fArr[i12]);
                break;
            default:
                pq pqVar = (pq) this.f5469c;
                pqVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                gk0 gk0Var = (gk0) pqVar.d;
                gk0Var.f28738b.put(this.f5468b, f12);
                gk0Var.d = true;
                gk0Var.f28737a.invalidate();
                break;
        }
    }
}
