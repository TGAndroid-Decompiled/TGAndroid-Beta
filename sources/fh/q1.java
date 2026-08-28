package fh;

import android.view.View;
public final class q1 implements View.OnAttachStateChangeListener {
    public final org.telegram.ui.Components.i5 f6724a;

    public q1(org.telegram.ui.Components.i5 i5Var) {
        this.f6724a = i5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f6724a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f6724a.b();
    }
}
