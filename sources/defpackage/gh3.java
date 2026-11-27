package defpackage;

import android.animation.ValueAnimator;
public final class gh3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final uj3 b;
    public final float c;

    public gh3(uj3 uj3Var, float f, byte b) {
        this.a = b;
        this.b = uj3Var;
        this.c = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.f4(f, valueAnimator);
                return;
            default:
                uj3Var.T3(f, valueAnimator);
                return;
        }
    }
}
