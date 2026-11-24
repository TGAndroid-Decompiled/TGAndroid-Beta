package defpackage;

import android.view.View;
public final class of8 implements View.OnAttachStateChangeListener {
    public final pf8 a;

    public of8(pf8 pf8Var) {
        this.a = pf8Var;
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
