package bi;

import android.view.View;
public final class u1 implements View.OnAttachStateChangeListener {
    public final int f3887a;
    public final org.telegram.ui.Components.e5 f3888b;

    public u1(org.telegram.ui.Components.e5 e5Var, int i7) {
        this.f3887a = i7;
        this.f3888b = e5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3887a) {
            case 0:
                this.f3888b.a();
                return;
            default:
                this.f3888b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3887a) {
            case 0:
                this.f3888b.b();
                return;
            default:
                this.f3888b.b();
                return;
        }
    }
}
