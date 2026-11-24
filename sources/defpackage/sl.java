package defpackage;

import android.view.View;
public final class sl implements View.OnLayoutChangeListener {
    public final r59 a;
    public final Runnable b;

    public sl(r59 r59Var, Runnable runnable) {
        this.a = r59Var;
        this.b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
