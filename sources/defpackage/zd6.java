package defpackage;

import android.view.View;
public final class zd6 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final ae6 d;
    public long a = System.currentTimeMillis();
    public final yd6 c = new yd6(this, (byte) 0);

    public zd6(ae6 ae6Var) {
        this.d = ae6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.b = true;
        view.post(this.c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        view.removeCallbacks(this.c);
    }
}
