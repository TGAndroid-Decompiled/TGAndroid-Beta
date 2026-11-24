package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class gb0 implements ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final float b;
    public final boolean c;
    public final mb0 d;

    public gb0(mb0 mb0Var, float f, float f2, boolean z) {
        this.d = mb0Var;
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a aVar;
        a aVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mb0 mb0Var = this.d;
        mb0Var.O = floatValue;
        float R1 = gl.R1(this.a, this.b, floatValue);
        aVar = ((d) mb0Var).actionBar;
        aVar.getTitleTextView().setAlpha(mb0Var.O);
        if (mb0Var.G && !this.c) {
            mb0Var.m0(false, 1.0f - mb0Var.O);
        }
        mb0Var.r.setTranslationY(R1);
        mb0Var.y.setTranslationY(R1);
        mb0Var.fragmentView.invalidate();
        aVar2 = ((d) mb0Var).actionBar;
        aVar2.invalidate();
    }
}
