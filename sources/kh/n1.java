package kh;

import android.view.View;
public final class n1 implements View.OnAttachStateChangeListener {
    public final g1 f10831a;

    public n1(g1 g1Var) {
        this.f10831a = g1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f10831a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
