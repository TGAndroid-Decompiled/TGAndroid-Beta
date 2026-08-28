package fh;

import android.view.View;
public final class u1 implements View.OnAttachStateChangeListener {
    public final m1 f6777a;

    public u1(m1 m1Var) {
        this.f6777a = m1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f6777a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
