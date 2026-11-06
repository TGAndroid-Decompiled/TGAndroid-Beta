package fi;

import android.animation.ValueAnimator;
public final class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12233a;
    public final float f12234b;
    public final float f12235c;
    public final float d;
    public final float f12236e;
    public final Object f12237f;

    public j6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f12233a = i7;
        this.f12237f = obj;
        this.f12234b = f10;
        this.f12235c = f11;
        this.d = f12;
        this.f12236e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12233a) {
            case 0:
                p pVar = (p) this.f12237f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6 k6Var = pVar.f12326a;
                float f10 = this.f12234b;
                float f11 = this.f12235c;
                k6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                k6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                k6Var.setTranslationX(this.d * floatValue);
                k6Var.setTranslationY(this.f12236e * floatValue);
                float f12 = 1.0f - floatValue;
                k6Var.setAlpha(f12);
                pVar.f12333s = f12;
                pVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f12237f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f12235c;
                float f14 = this.f12234b;
                jVar.f18343k = com.google.android.recaptcha.internal.a.z(f13, f14, floatValue2, f14);
                float f15 = this.f12236e;
                float f16 = this.d;
                jVar.f18344l = com.google.android.recaptcha.internal.a.z(f15, f16, floatValue2, f16);
                jVar.f18335a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f12237f;
                x9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) x9Var.f30907b).f57270a;
                float f17 = this.f12235c;
                float f18 = this.f12234b;
                fVar.d = com.google.android.recaptcha.internal.a.z(f17, f18, floatValue3, f18);
                float f19 = this.f12236e;
                float f20 = this.d;
                fVar.f57287i = com.google.android.recaptcha.internal.a.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
