package hi;

import android.animation.ValueAnimator;
public final class q6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15228a;
    public final float f15229b;
    public final float f15230c;
    public final float d;
    public final float f15231e;
    public final Object f15232f;

    public q6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f15228a = i7;
        this.f15232f = obj;
        this.f15229b = f10;
        this.f15230c = f11;
        this.d = f12;
        this.f15231e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15228a) {
            case 0:
                q qVar = (q) this.f15232f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6 r6Var = qVar.f15386a;
                float f10 = this.f15229b;
                float f11 = this.f15230c;
                r6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                r6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                r6Var.setTranslationX(this.d * floatValue);
                r6Var.setTranslationY(this.f15231e * floatValue);
                float f12 = 1.0f - floatValue;
                r6Var.setAlpha(f12);
                qVar.f15393s = f12;
                qVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f15232f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f15230c;
                float f14 = this.f15229b;
                jVar.f19940k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.f15231e;
                float f16 = this.d;
                jVar.f19941l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.f19932a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) this.f15232f;
                y9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) y9Var.f32576b).f59541a;
                float f17 = this.f15230c;
                float f18 = this.f15229b;
                fVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.f15231e;
                float f20 = this.d;
                fVar.f59558i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
