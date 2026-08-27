package gh;

import android.view.View;

public final class r1 implements View.OnAttachStateChangeListener {

    public final k1 f7514a;

    public r1(k1 k1Var) {
        this.f7514a = k1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f7514a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
