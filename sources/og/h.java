package og;

import android.animation.ValueAnimator;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f20975a;
    public final o f20976b;
    public final float f20977c;
    public final float[] d;
    public final float f20978e;
    public final float f20979f;

    public h(o oVar, float f10, float[] fArr, float f11, float f12, int i7) {
        this.f20975a = i7;
        this.f20976b = oVar;
        this.f20977c = f10;
        this.d = fArr;
        this.f20978e = f11;
        this.f20979f = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20975a) {
            case 0:
                o oVar = this.f20976b;
                oVar.getClass();
                float z9 = com.google.android.recaptcha.internal.a.z(this.f20977c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = z9 / f10;
                fArr[0] = f10 * f11;
                m.g(oVar.L, f11, this.f20978e, this.f20979f);
                oVar.r(false);
                return;
            default:
                o oVar2 = this.f20976b;
                oVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = (this.f20977c * floatValue) - f12;
                fArr2[1] = f12 + f13;
                float f14 = fArr2[2];
                float f15 = (this.f20978e * floatValue) - f14;
                fArr2[2] = f14 + f15;
                m mVar = oVar2.L;
                float f16 = fArr2[0];
                m.f(mVar, f13 * f16, f15 * f16);
                float f17 = fArr2[0];
                float f18 = (((this.f20979f - 1.0f) * floatValue) + 1.0f) / f17;
                fArr2[0] = f17 * f18;
                m.g(oVar2.L, f18, 0.0f, 0.0f);
                oVar2.r(false);
                return;
        }
    }
}
