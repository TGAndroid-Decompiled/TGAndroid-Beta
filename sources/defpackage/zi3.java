package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class zi3 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final float b;
    public final float c;
    public final uj3 d;

    public zi3(uj3 uj3Var, float f, boolean z, float f2) {
        this.d = uj3Var;
        this.b = f;
        this.c = f2;
        this.a = (int) f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int R1 = (int) hl.R1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i = R1 - this.a;
        this.a = R1;
        uj3 uj3Var = this.d;
        uj3Var.f0[0].a.scrollBy(0, i);
        View view = uj3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
