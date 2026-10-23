package mg;

import android.animation.ValueAnimator;
import com.google.android.gms.internal.play_billing.k3;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f16950a;
    public final p f16951b;
    public final float f16952c;
    public final float[] d;
    public final float e;
    public final float f16953f;

    public h(p pVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.f16950a = i10;
        this.f16951b = pVar;
        this.f16952c = f7;
        this.d = fArr;
        this.e = f10;
        this.f16953f = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16950a) {
            case 0:
                p pVar = this.f16951b;
                pVar.getClass();
                float y3 = k3.y(this.f16952c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = y3 / f7;
                fArr[0] = f7 * f10;
                n.g(pVar.L, f10, this.e, this.f16953f);
                pVar.r(false);
                return;
            default:
                p pVar2 = this.f16951b;
                pVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f11 = fArr2[1];
                float f12 = (this.f16952c * floatValue) - f11;
                fArr2[1] = f11 + f12;
                float f13 = fArr2[2];
                float f14 = (this.e * floatValue) - f13;
                fArr2[2] = f13 + f14;
                n nVar = pVar2.L;
                float f15 = fArr2[0];
                n.f(nVar, f12 * f15, f14 * f15);
                float f16 = fArr2[0];
                float f17 = (((this.f16953f - 1.0f) * floatValue) + 1.0f) / f16;
                fArr2[0] = f16 * f17;
                n.g(pVar2.L, f17, 0.0f, 0.0f);
                pVar2.r(false);
                return;
        }
    }
}
