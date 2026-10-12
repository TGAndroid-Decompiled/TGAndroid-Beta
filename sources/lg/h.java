package lg;

import android.animation.ValueAnimator;
import com.google.android.gms.internal.vision.e2;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f15285a;
    public final p f15286b;
    public final float f15287c;
    public final float[] d;
    public final float f15288e;
    public final float f15289f;

    public h(p pVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.f15285a = i10;
        this.f15286b = pVar;
        this.f15287c = f7;
        this.d = fArr;
        this.f15288e = f10;
        this.f15289f = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15285a) {
            case 0:
                p pVar = this.f15286b;
                pVar.getClass();
                float y3 = e2.y(this.f15287c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = y3 / f7;
                fArr[0] = f7 * f10;
                n.g(pVar.L, f10, this.f15288e, this.f15289f);
                pVar.r(false);
                return;
            default:
                p pVar2 = this.f15286b;
                pVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr2 = this.d;
                float f11 = fArr2[1];
                float f12 = (this.f15287c * floatValue) - f11;
                fArr2[1] = f11 + f12;
                float f13 = fArr2[2];
                float f14 = (this.f15288e * floatValue) - f13;
                fArr2[2] = f13 + f14;
                n nVar = pVar2.L;
                float f15 = fArr2[0];
                n.f(nVar, f12 * f15, f14 * f15);
                float f16 = fArr2[0];
                float f17 = (((this.f15289f - 1.0f) * floatValue) + 1.0f) / f16;
                fArr2[0] = f16 * f17;
                n.g(pVar2.L, f17, 0.0f, 0.0f);
                pVar2.r(false);
                return;
        }
    }
}
