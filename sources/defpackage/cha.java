package defpackage;

import android.view.View;
public final class cha implements View.OnLayoutChangeListener {
    public final eja a;

    public cha(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        s7 s7Var = this.a.q0;
        if (s7Var == null) {
            return;
        }
        s7Var.setTranslationX(((View) s7Var.getParent()).getMeasuredWidth() - s7Var.getRight());
    }
}
