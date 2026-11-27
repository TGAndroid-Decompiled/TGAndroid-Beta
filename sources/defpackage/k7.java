package defpackage;

import android.view.ViewTreeObserver;
public final class k7 implements ViewTreeObserver.OnPreDrawListener {
    public final float a;
    public final s7 b;

    public k7(s7 s7Var, float f) {
        this.b = s7Var;
        this.a = f;
    }

    @Override
    public final boolean onPreDraw() {
        s7 s7Var = this.b;
        s7Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x = s7Var.e.getX();
        float f = this.a;
        if (x != f) {
            m7 m7Var = s7Var.e;
            m7Var.setTranslationX(f - m7Var.getX());
        }
        s7Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(k43.f).start();
        return true;
    }
}
