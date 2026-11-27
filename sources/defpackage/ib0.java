package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class ib0 implements ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final float b;
    public final boolean c;
    public final ob0 d;

    public ib0(ob0 ob0Var, float f, float f2, boolean z) {
        this.d = ob0Var;
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a aVar;
        a aVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ob0 ob0Var = this.d;
        ob0Var.O = floatValue;
        float R1 = hl.R1(this.a, this.b, floatValue);
        aVar = ((e) ob0Var).actionBar;
        aVar.getTitleTextView().setAlpha(ob0Var.O);
        if (ob0Var.G && !this.c) {
            ob0Var.m0(false, 1.0f - ob0Var.O);
        }
        ob0Var.r.setTranslationY(R1);
        ob0Var.y.setTranslationY(R1);
        ob0Var.fragmentView.invalidate();
        aVar2 = ((e) ob0Var).actionBar;
        aVar2.invalidate();
    }
}
