package hi;

import android.animation.ValueAnimator;
public final class h6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14685a;
    public final float f14686b;
    public final float f14687c;
    public final float d;
    public final float f14688e;
    public final Object f14689f;

    public h6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f14685a = i7;
        this.f14689f = obj;
        this.f14686b = f10;
        this.f14687c = f11;
        this.d = f12;
        this.f14688e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14685a) {
            case 0:
                p pVar = (p) this.f14689f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6 i6Var = pVar.f14767a;
                float f10 = this.f14686b;
                float f11 = this.f14687c;
                i6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                i6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                i6Var.setTranslationX(this.d * floatValue);
                i6Var.setTranslationY(this.f14688e * floatValue);
                float f12 = 1.0f - floatValue;
                i6Var.setAlpha(f12);
                pVar.f14774s = f12;
                pVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f14689f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f14687c;
                float f14 = this.f14686b;
                jVar.f19840k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.f14688e;
                float f16 = this.d;
                jVar.f19841l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.f19832a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f14689f;
                z9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.g gVar = ((vg.f) z9Var.f32523b).f59421a;
                float f17 = this.f14687c;
                float f18 = this.f14686b;
                gVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.f14688e;
                float f20 = this.d;
                gVar.f59438i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
