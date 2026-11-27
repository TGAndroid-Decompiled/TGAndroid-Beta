package defpackage;

import android.view.View;
public final class cn7 implements View.OnAttachStateChangeListener {
    public final bn7 a;
    public final int b;
    public final jn7 c;

    public cn7(jn7 jn7Var, bn7 bn7Var, int i) {
        this.c = jn7Var;
        this.a = bn7Var;
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
