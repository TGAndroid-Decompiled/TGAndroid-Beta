package og;

import android.animation.ValueAnimator;
import com.google.android.gms.internal.vision.e2;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f21886a;
    public final o f21887b;
    public final float f21888c;
    public final float[] d;
    public final float f21889e;
    public final float f21890f;

    public h(o oVar, float f10, float[] fArr, float f11, float f12, int i7) {
        this.f21886a = i7;
        this.f21887b = oVar;
        this.f21888c = f10;
        this.d = fArr;
        this.f21889e = f11;
        this.f21890f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21886a) {
            case 0:
                o oVar = this.f21887b;
                oVar.getClass();
                float z10 = e2.z(this.f21888c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = z10 / f10;
                fArr[0] = f10 * f11;
                m.g(oVar.M, f11, this.f21889e, this.f21890f);
                oVar.r(false);
                return;
            default:
                o oVar2 = this.f21887b;
                oVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f21888c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.f21889e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                m mVar = oVar2.M;
                float f16 = fArr2[0];
                m.f(mVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f21890f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                m.g(oVar2.M, f18, 0.0f, 0.0f);
                oVar2.r(false);
                return;
        }
    }
}
