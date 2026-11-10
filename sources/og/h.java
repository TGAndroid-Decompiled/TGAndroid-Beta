package og;

import android.animation.ValueAnimator;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f20980a;
    public final o f20981b;
    public final float f20982c;
    public final float[] d;
    public final float f20983e;
    public final float f20984f;

    public h(o oVar, float f10, float[] fArr, float f11, float f12, int i7) {
        this.f20980a = i7;
        this.f20981b = oVar;
        this.f20982c = f10;
        this.d = fArr;
        this.f20983e = f11;
        this.f20984f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20980a) {
            case 0:
                o oVar = this.f20981b;
                oVar.getClass();
                float z9 = com.google.android.recaptcha.internal.a.z(this.f20982c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = z9 / f10;
                fArr[0] = f10 * f11;
                m.g(oVar.L, f11, this.f20983e, this.f20984f);
                oVar.r(false);
                return;
            default:
                o oVar2 = this.f20981b;
                oVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f20982c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.f20983e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                m mVar = oVar2.L;
                float f16 = fArr2[0];
                m.f(mVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f20984f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                m.g(oVar2.L, f18, 0.0f, 0.0f);
                oVar2.r(false);
                return;
        }
    }
}
