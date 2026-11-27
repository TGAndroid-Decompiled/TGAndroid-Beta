package defpackage;

import android.view.View;
public final class ah8 implements View.OnAttachStateChangeListener {
    public final bh8 a;

    public ah8(bh8 bh8Var) {
        this.a = bh8Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.a.c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.a.c.f();
    }
}
