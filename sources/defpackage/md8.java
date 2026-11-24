package defpackage;

import android.view.View;
public final class md8 implements View.OnAttachStateChangeListener {
    public final nd8 a;

    public md8(nd8 nd8Var) {
        this.a = nd8Var;
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
