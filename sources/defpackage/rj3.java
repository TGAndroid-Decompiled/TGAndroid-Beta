package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class rj3 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final float b;
    public final float c;
    public final nk3 d;

    public rj3(nk3 nk3Var, float f, boolean z, float f2) {
        this.d = nk3Var;
        this.b = f;
        this.c = f2;
        this.a = (int) f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int R1 = (int) gm.R1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i = R1 - this.a;
        this.a = R1;
        nk3 nk3Var = this.d;
        nk3Var.f0[0].a.scrollBy(0, i);
        View view = nk3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
