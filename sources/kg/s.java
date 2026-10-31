package kg;

import android.animation.ValueAnimator;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f11258a;
    public final v f11259b;
    public final u f11260c;

    public s(v vVar, u uVar, int i10) {
        this.f11258a = i10;
        this.f11259b = vVar;
        this.f11260c = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11258a) {
            case 0:
                v vVar = this.f11259b;
                vVar.getClass();
                this.f11260c.f11274c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.invalidate();
                return;
            default:
                v vVar2 = this.f11259b;
                vVar2.getClass();
                this.f11260c.f11274c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar2.invalidate();
                return;
        }
    }
}
