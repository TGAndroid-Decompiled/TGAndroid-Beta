package hi;

import android.animation.ValueAnimator;
public final class h6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14729a;
    public final float f14730b;
    public final float f14731c;
    public final float d;
    public final float f14732e;
    public final Object f14733f;

    public h6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f14729a = i7;
        this.f14733f = obj;
        this.f14730b = f10;
        this.f14731c = f11;
        this.d = f12;
        this.f14732e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14729a) {
            case 0:
                q qVar = (q) this.f14733f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6 i6Var = qVar.f14813a;
                float f10 = this.f14730b;
                float f11 = this.f14731c;
                i6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                i6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                i6Var.setTranslationX(this.d * floatValue);
                i6Var.setTranslationY(this.f14732e * floatValue);
                float f12 = 1.0f - floatValue;
                i6Var.setAlpha(f12);
                qVar.f14820s = f12;
                qVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f14733f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f14731c;
                float f14 = this.f14730b;
                jVar.f19846k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.f14732e;
                float f16 = this.d;
                jVar.f19847l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.f19838a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) this.f14733f;
                y9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) y9Var.f32475b).f59413a;
                float f17 = this.f14731c;
                float f18 = this.f14730b;
                fVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.f14732e;
                float f20 = this.d;
                fVar.f59430i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
