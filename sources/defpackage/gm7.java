package defpackage;

import android.view.View;
public final class gm7 implements View.OnAttachStateChangeListener {
    public final fm7 a;
    public final int b;
    public final nm7 c;

    public gm7(nm7 nm7Var, fm7 fm7Var, int i) {
        this.c = nm7Var;
        this.a = fm7Var;
        this.b = i;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.c.a(this.a, this.b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.c.n(this.a, this.b);
    }
}
