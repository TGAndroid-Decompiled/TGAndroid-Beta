package gh;

import android.view.View;

public final class n1 implements View.OnAttachStateChangeListener {

    public final org.telegram.ui.Components.i5 f7460a;

    public n1(org.telegram.ui.Components.i5 i5Var) {
        this.f7460a = i5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f7460a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f7460a.b();
    }
}
