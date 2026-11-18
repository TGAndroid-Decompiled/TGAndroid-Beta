package hi;

import android.animation.ValueAnimator;
public final class h6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14726a;
    public final float f14727b;
    public final float f14728c;
    public final float d;
    public final float f14729e;
    public final Object f14730f;

    public h6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f14726a = i7;
        this.f14730f = obj;
        this.f14727b = f10;
        this.f14728c = f11;
        this.d = f12;
        this.f14729e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14726a) {
            case 0:
                q qVar = (q) this.f14730f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6 i6Var = qVar.f14810a;
                float f10 = this.f14727b;
                float f11 = this.f14728c;
                i6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                i6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                i6Var.setTranslationX(this.d * floatValue);
                i6Var.setTranslationY(this.f14729e * floatValue);
                float f12 = 1.0f - floatValue;
                i6Var.setAlpha(f12);
                qVar.f14817s = f12;
                qVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f14730f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f14728c;
                float f14 = this.f14727b;
                jVar.f19843k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.f14729e;
                float f16 = this.d;
                jVar.f19844l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.f19835a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f14730f;
                z9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) z9Var.f32526b).f59414a;
                float f17 = this.f14728c;
                float f18 = this.f14727b;
                fVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.f14729e;
                float f20 = this.d;
                fVar.f59431i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
