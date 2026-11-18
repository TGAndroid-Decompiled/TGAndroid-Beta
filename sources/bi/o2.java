package bi;

import android.view.View;
public final class o2 implements View.OnAttachStateChangeListener {
    public final int f3922a;
    public final org.telegram.ui.Components.m5 f3923b;

    public o2(org.telegram.ui.Components.m5 m5Var, int i7) {
        this.f3922a = i7;
        this.f3923b = m5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3922a) {
            case 0:
                this.f3923b.a();
                return;
            default:
                this.f3923b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3922a) {
            case 0:
                this.f3923b.b();
                return;
            default:
                this.f3923b.b();
                return;
        }
    }
}
