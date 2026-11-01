package kg;

import android.animation.ValueAnimator;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f11259a;
    public final v f11260b;
    public final u f11261c;

    public s(v vVar, u uVar, int i10) {
        this.f11259a = i10;
        this.f11260b = vVar;
        this.f11261c = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11259a) {
            case 0:
                v vVar = this.f11260b;
                vVar.getClass();
                this.f11261c.f11275c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.invalidate();
                return;
            default:
                v vVar2 = this.f11260b;
                vVar2.getClass();
                this.f11261c.f11275c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar2.invalidate();
                return;
        }
    }
}
