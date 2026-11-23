package hi;

import android.animation.ValueAnimator;
public final class g6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14714a;
    public final float f14715b;
    public final float f14716c;
    public final float d;
    public final float f14717e;
    public final Object f14718f;

    public g6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f14714a = i7;
        this.f14718f = obj;
        this.f14715b = f10;
        this.f14716c = f11;
        this.d = f12;
        this.f14717e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14714a) {
            case 0:
                r rVar = (r) this.f14718f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6 h6Var = rVar.f14791a;
                float f10 = this.f14715b;
                float f11 = this.f14716c;
                h6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                h6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                h6Var.setTranslationX(this.d * floatValue);
                h6Var.setTranslationY(this.f14717e * floatValue);
                float f12 = 1.0f - floatValue;
                h6Var.setAlpha(f12);
                rVar.f14798s = f12;
                rVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f14718f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f14716c;
                float f14 = this.f14715b;
                jVar.f19874k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.f14717e;
                float f16 = this.d;
                jVar.f19875l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.f19866a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f14718f;
                z9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) z9Var.f32557b).f59456a;
                float f17 = this.f14716c;
                float f18 = this.f14715b;
                fVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.f14717e;
                float f20 = this.d;
                fVar.f59473i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
