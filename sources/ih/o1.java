package ih;

import android.view.View;
public final class o1 implements View.OnAttachStateChangeListener {
    public final h1 f9308a;

    public o1(h1 h1Var) {
        this.f9308a = h1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f9308a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
