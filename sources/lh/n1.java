package lh;

import android.view.View;
public final class n1 implements View.OnAttachStateChangeListener {
    public final g1 f12857a;

    public n1(g1 g1Var) {
        this.f12857a = g1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f12857a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
