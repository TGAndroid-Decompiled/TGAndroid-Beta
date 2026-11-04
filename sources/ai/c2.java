package ai;

import android.view.View;
public final class c2 implements View.OnAttachStateChangeListener {
    public final int f539a;
    public final org.telegram.ui.Components.e5 f540b;

    public c2(org.telegram.ui.Components.e5 e5Var, int i3) {
        this.f539a = i3;
        this.f540b = e5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f539a) {
            case 0:
                this.f540b.a();
                return;
            default:
                this.f540b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f539a) {
            case 0:
                this.f540b.b();
                return;
            default:
                this.f540b.b();
                return;
        }
    }
}
