package bi;

import android.view.View;
public final class o2 implements View.OnAttachStateChangeListener {
    public final int f3888a;
    public final org.telegram.ui.Components.m5 f3889b;

    public o2(org.telegram.ui.Components.m5 m5Var, int i7) {
        this.f3888a = i7;
        this.f3889b = m5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3888a) {
            case 0:
                this.f3889b.a();
                return;
            default:
                this.f3889b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3888a) {
            case 0:
                this.f3889b.b();
                return;
            default:
                this.f3889b.b();
                return;
        }
    }
}
