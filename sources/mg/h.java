package mg;

import android.animation.ValueAnimator;
import com.google.android.gms.internal.cast.a6;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f16881a;
    public final p f16882b;
    public final float f16883c;
    public final float[] d;
    public final float e;
    public final float f16884f;

    public h(p pVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.f16881a = i10;
        this.f16882b = pVar;
        this.f16883c = f7;
        this.d = fArr;
        this.e = f10;
        this.f16884f = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16881a) {
            case 0:
                p pVar = this.f16882b;
                pVar.getClass();
                float x10 = a6.x(this.f16883c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = x10 / f7;
                fArr[0] = f7 * f10;
                n.g(pVar.L, f10, this.e, this.f16884f);
                pVar.r(false);
                return;
            default:
                p pVar2 = this.f16882b;
                pVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f11 = fArr2[1];
                float f12 = (this.f16883c * floatValue) - f11;
                fArr2[1] = f11 + f12;
                float f13 = fArr2[2];
                float f14 = (this.e * floatValue) - f13;
                fArr2[2] = f13 + f14;
                n nVar = pVar2.L;
                float f15 = fArr2[0];
                n.f(nVar, f12 * f15, f14 * f15);
                float f16 = fArr2[0];
                float f17 = (((this.f16884f - 1.0f) * floatValue) + 1.0f) / f16;
                fArr2[0] = f16 * f17;
                n.g(pVar2.L, f17, 0.0f, 0.0f);
                pVar2.r(false);
                return;
        }
    }
}
