package kg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f16559a;
    public final h f16560b;

    public d(h hVar, int i10) {
        this.f16559a = i10;
        this.f16560b = hVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16559a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = this.f16560b;
                hVar.f16605j0 = floatValue;
                hVar.H = true;
                hVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar2 = this.f16560b;
                hVar2.f16607k0 = floatValue2;
                hVar2.H = true;
                hVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar3 = this.f16560b;
                hVar3.f16620v0 = floatValue3;
                hVar3.f16618t0.setAlpha(hVar3.f16620v0);
                hVar3.invalidate();
                return;
        }
    }
}
