package defpackage;

import android.view.View;
public final class sk implements View.OnLayoutChangeListener {
    public final o39 a;
    public final Runnable b;

    public sk(o39 o39Var, Runnable runnable) {
        this.a = o39Var;
        this.b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
