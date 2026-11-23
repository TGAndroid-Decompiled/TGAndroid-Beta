package bi;

import android.view.View;
public final class s2 implements View.OnAttachStateChangeListener {
    public final int f4062a;
    public final org.telegram.ui.Components.n5 f4063b;

    public s2(org.telegram.ui.Components.n5 n5Var, int i7) {
        this.f4062a = i7;
        this.f4063b = n5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4062a) {
            case 0:
                this.f4063b.a();
                return;
            default:
                this.f4063b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4062a) {
            case 0:
                this.f4063b.b();
                return;
            default:
                this.f4063b.b();
                return;
        }
    }
}
