package defpackage;

import android.view.View;
public final class yf6 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final zf6 d;
    public long a = System.currentTimeMillis();
    public final xf6 c = new xf6(this, (byte) 0);

    public yf6(zf6 zf6Var) {
        this.d = zf6Var;
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
