package bi;

import android.view.View;
public final class s2 implements View.OnAttachStateChangeListener {
    public final int f4060a;
    public final org.telegram.ui.Components.n5 f4061b;

    public s2(org.telegram.ui.Components.n5 n5Var, int i7) {
        this.f4060a = i7;
        this.f4061b = n5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4060a) {
            case 0:
                this.f4061b.a();
                return;
            default:
                this.f4061b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4060a) {
            case 0:
                this.f4061b.b();
                return;
            default:
                this.f4061b.b();
                return;
        }
    }
}
