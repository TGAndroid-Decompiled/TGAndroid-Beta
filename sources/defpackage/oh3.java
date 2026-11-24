package defpackage;

import android.animation.ValueAnimator;
public final class oh3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nk3 b;
    public final float c;

    public oh3(nk3 nk3Var, float f, byte b) {
        this.a = b;
        this.b = nk3Var;
        this.c = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.f4(f, valueAnimator);
                return;
            default:
                nk3Var.T3(f, valueAnimator);
                return;
        }
    }
}
