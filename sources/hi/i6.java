package hi;

import android.animation.ValueAnimator;
public final class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14423a;
    public final float f14424b;
    public final float f14425c;
    public final float d;
    public final float f14426e;
    public final Object f14427f;

    public i6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f14423a = i7;
        this.f14427f = obj;
        this.f14424b = f10;
        this.f14425c = f11;
        this.d = f12;
        this.f14426e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14423a) {
            case 0:
                p pVar = (p) this.f14427f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6 j6Var = pVar.f14504a;
                float f10 = this.f14424b;
                float f11 = this.f14425c;
                j6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                j6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                j6Var.setTranslationX(this.d * floatValue);
                j6Var.setTranslationY(this.f14426e * floatValue);
                float f12 = 1.0f - floatValue;
                j6Var.setAlpha(f12);
                pVar.f14511s = f12;
                pVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f14427f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f14425c;
                float f14 = this.f14424b;
                jVar.f19479k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.f14426e;
                float f16 = this.d;
                jVar.f19480l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.f19471a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f14427f;
                x9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) x9Var.f32048b).f58844a;
                float f17 = this.f14425c;
                float f18 = this.f14424b;
                fVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.f14426e;
                float f20 = this.d;
                fVar.f58861i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
