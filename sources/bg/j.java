package bg;

import android.animation.ValueAnimator;
import c3.i0;
import vh.u4;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f2749a;
    public final float f2750b;
    public final float f2751c;
    public final float d;
    public final float e;
    public final Object f2752f;

    public j(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f2749a = i10;
        this.f2752f = obj;
        this.f2750b = f7;
        this.f2751c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2749a) {
            case 0:
                n nVar = (n) this.f2752f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = this.f2751c;
                float f10 = this.f2750b;
                nVar.f2767k = i0.z(f7, f10, floatValue, f10);
                float f11 = this.e;
                float f12 = this.d;
                nVar.f2768l = i0.z(f11, f12, floatValue, f12);
                nVar.f2760a.a(f7, f11, false);
                return;
            case 1:
                lg.f fVar = (lg.f) this.f2752f;
                fVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.h hVar = ((lg.g) fVar.f11866b).f11867a;
                float f13 = this.f2751c;
                float f14 = this.f2750b;
                hVar.d = i0.z(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                hVar.f11882i = i0.z(f15, f16, floatValue2, f16);
                return;
            default:
                vh.n nVar2 = (vh.n) this.f2752f;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4 u4Var = nVar2.f52058a;
                float f17 = this.f2750b;
                float f18 = this.f2751c;
                u4Var.setScaleX(org.telegram.messenger.i0.T1(f17, f18, floatValue3));
                u4Var.setScaleY(org.telegram.messenger.i0.T1(f17, f18, floatValue3));
                u4Var.setTranslationX(this.d * floatValue3);
                u4Var.setTranslationY(this.e * floatValue3);
                float f19 = 1.0f - floatValue3;
                u4Var.setAlpha(f19);
                nVar2.f52064s = f19;
                nVar2.invalidate();
                return;
        }
    }
}
