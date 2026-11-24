package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class fi3 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final float b;
    public final float c;
    public final cj3 d;

    public fi3(cj3 cj3Var, float f, boolean z, float f2) {
        this.d = cj3Var;
        this.b = f;
        this.c = f2;
        this.a = (int) f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int R1 = (int) gl.R1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i = R1 - this.a;
        this.a = R1;
        cj3 cj3Var = this.d;
        cj3Var.f0[0].a.scrollBy(0, i);
        View view = cj3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
