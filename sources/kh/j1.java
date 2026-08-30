package kh;

import android.view.View;
public final class j1 implements View.OnAttachStateChangeListener {
    public final org.telegram.ui.Components.j5 f10678a;

    public j1(org.telegram.ui.Components.j5 j5Var) {
        this.f10678a = j5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f10678a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f10678a.b();
    }
}
