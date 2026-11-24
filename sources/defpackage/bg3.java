package defpackage;

import android.animation.ValueAnimator;
public final class bg3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final cj3 b;
    public final float c;

    public bg3(cj3 cj3Var, float f, byte b) {
        this.a = b;
        this.b = cj3Var;
        this.c = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.c4(f, valueAnimator);
                return;
            default:
                cj3Var.Q3(f, valueAnimator);
                return;
        }
    }
}
