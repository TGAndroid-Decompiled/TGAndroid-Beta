package bg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f2677a;
    public final i f2678b;

    public d(i iVar, int i10) {
        this.f2677a = i10;
        this.f2678b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2677a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar = this.f2678b;
                iVar.f2726j0 = floatValue;
                iVar.H = true;
                iVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar2 = this.f2678b;
                iVar2.f2728k0 = floatValue2;
                iVar2.H = true;
                iVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar3 = this.f2678b;
                iVar3.f2741v0 = floatValue3;
                iVar3.f2739t0.setAlpha(iVar3.f2741v0);
                iVar3.invalidate();
                return;
        }
    }
}
