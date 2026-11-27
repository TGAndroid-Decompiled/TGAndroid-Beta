package defpackage;

import android.view.View;
public final class tk implements View.OnLayoutChangeListener {
    public final d79 a;
    public final Runnable b;

    public tk(d79 d79Var, Runnable runnable) {
        this.a = d79Var;
        this.b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
