package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class gy1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public gy1(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ((hy1) obj).d;
                chatActivityEnterView.H = f2 * floatValue;
                chatActivityEnterView.B2();
                chatActivityEnterView.R0.setTranslationX(f * floatValue);
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ys4 ys4Var = ((zl3) obj).a;
                ys4Var.d = f2 * floatValue2;
                ys4Var.i = f * floatValue2;
                return;
            case 2:
                xy3 xy3Var = (xy3) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy3Var.L = floatValue3;
                xy3Var.K = hl.R1(f2, f, floatValue3);
                xy3Var.b.invalidate();
                return;
            case 3:
                t84 t84Var = (t84) obj;
                if (t84Var.h) {
                    DecelerateInterpolator decelerateInterpolator = un.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    t84Var.d((f * animatedFraction) + f2, animatedFraction);
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f2;
                float f3 = photoViewer.Z5;
                cropAreaView.o0 = floatValue4;
                cropAreaView.p0 = ((photoViewer.d6 - f3) * photoViewer.k6) + f3;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.b(hl.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                gkc gkcVar = (gkc) obj;
                gkcVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f2 + hl.L(28.0f);
                float L2 = f + hl.L(52.0f);
                float f4 = gkcVar.E;
                gkcVar.H = L - (L * f4);
                gkcVar.I = L2 - (f4 * L2);
                gkcVar.invalidate();
                return;
            case 6:
                sbb sbbVar = (sbb) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbbVar.r.setTranslationY(f2 * floatValue5);
                sbbVar.r.b(f * floatValue5);
                return;
            case 7:
                zoc zocVar = (zoc) obj;
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zocVar.A = (f2 * floatValue6) + zocVar.g();
                zocVar.B = (f * floatValue6) + (zocVar.k.F * 0.14f);
                if (floatValue6 > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                zocVar.D = z;
                zocVar.a.invalidate();
                return;
            default:
                zqc zqcVar = (zqc) obj;
                float floatValue7 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqcVar.O = f2 * floatValue7;
                zqcVar.P = f * floatValue7;
                return;
        }
    }
}
