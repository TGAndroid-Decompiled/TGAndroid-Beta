package defpackage;

import android.view.View;
public final class bg6 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final cg6 d;
    public long a = System.currentTimeMillis();
    public final ag6 c = new ag6(this, (byte) 0);

    public bg6(cg6 cg6Var) {
        this.d = cg6Var;
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
