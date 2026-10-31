package eg;

import android.animation.ValueAnimator;
import c3.i0;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f6551a;
    public final q f6552b;
    public final float f6553c;
    public final float[] d;
    public final float e;
    public final float f6554f;

    public h(q qVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.f6551a = i10;
        this.f6552b = qVar;
        this.f6553c = f7;
        this.d = fArr;
        this.e = f10;
        this.f6554f = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6551a) {
            case 0:
                q qVar = this.f6552b;
                qVar.getClass();
                float z10 = i0.z(this.f6553c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = z10 / f7;
                fArr[0] = f7 * f10;
                o.g(qVar.L, f10, this.e, this.f6554f);
                qVar.r(false);
                return;
            default:
                q qVar2 = this.f6552b;
                qVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f11 = fArr2[1];
                float f12 = (this.f6553c * floatValue) - f11;
                fArr2[1] = f11 + f12;
                float f13 = fArr2[2];
                float f14 = (this.e * floatValue) - f13;
                fArr2[2] = f13 + f14;
                o oVar = qVar2.L;
                float f15 = fArr2[0];
                o.f(oVar, f12 * f15, f14 * f15);
                float f16 = fArr2[0];
                float f17 = (((this.f6554f - 1.0f) * floatValue) + 1.0f) / f16;
                fArr2[0] = f16 * f17;
                o.g(qVar2.L, f17, 0.0f, 0.0f);
                qVar2.r(false);
                return;
        }
    }
}
