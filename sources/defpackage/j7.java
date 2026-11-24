package defpackage;

import android.view.ViewTreeObserver;
public final class j7 implements ViewTreeObserver.OnPreDrawListener {
    public final float a;
    public final r7 b;

    public j7(r7 r7Var, float f) {
        this.b = r7Var;
        this.a = f;
    }

    @Override
    public final boolean onPreDraw() {
        r7 r7Var = this.b;
        r7Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x = r7Var.e.getX();
        float f = this.a;
        if (x != f) {
            l7 l7Var = r7Var.e;
            l7Var.setTranslationX(f - l7Var.getX());
        }
        r7Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(s33.f).start();
        return true;
    }
}
