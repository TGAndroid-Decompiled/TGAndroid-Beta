package mg;

import android.animation.ValueAnimator;
import com.google.android.gms.internal.vision.e2;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f16294a;
    public final q f16295b;
    public final float f16296c;
    public final float[] d;
    public final float f16297e;
    public final float f16298f;

    public h(q qVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.f16294a = i10;
        this.f16295b = qVar;
        this.f16296c = f7;
        this.d = fArr;
        this.f16297e = f10;
        this.f16298f = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16294a) {
            case 0:
                q qVar = this.f16295b;
                qVar.getClass();
                float z10 = e2.z(this.f16296c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = z10 / f7;
                fArr[0] = f7 * f10;
                o.g(qVar.L, f10, this.f16297e, this.f16298f);
                qVar.r(false);
                return;
            default:
                q qVar2 = this.f16295b;
                qVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f11 = fArr2[1];
                float f12 = (this.f16296c * floatValue) - f11;
                fArr2[1] = f11 + f12;
                float f13 = fArr2[2];
                float f14 = (this.f16297e * floatValue) - f13;
                fArr2[2] = f13 + f14;
                o oVar = qVar2.L;
                float f15 = fArr2[0];
                o.f(oVar, f12 * f15, f14 * f15);
                float f16 = fArr2[0];
                float f17 = (((this.f16298f - 1.0f) * floatValue) + 1.0f) / f16;
                fArr2[0] = f16 * f17;
                o.g(qVar2.L, f17, 0.0f, 0.0f);
                qVar2.r(false);
                return;
        }
    }
}
