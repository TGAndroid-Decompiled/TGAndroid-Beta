package ih;

import android.view.View;
public final class k1 implements View.OnAttachStateChangeListener {
    public final org.telegram.ui.Components.n5 f9264a;

    public k1(org.telegram.ui.Components.n5 n5Var) {
        this.f9264a = n5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f9264a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f9264a.b();
    }
}
