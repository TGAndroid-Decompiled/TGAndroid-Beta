package defpackage;

import android.view.View;
public final class dk7 implements View.OnAttachStateChangeListener {
    public final ck7 a;
    public final int b;
    public final kk7 c;

    public dk7(kk7 kk7Var, ck7 ck7Var, int i) {
        this.c = kk7Var;
        this.a = ck7Var;
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
