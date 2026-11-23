package bi;

import android.view.View;
public final class u2 implements View.OnAttachStateChangeListener {
    public final int f4094a;
    public final org.telegram.ui.Components.m5 f4095b;

    public u2(org.telegram.ui.Components.m5 m5Var, int i7) {
        this.f4094a = i7;
        this.f4095b = m5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4094a) {
            case 0:
                this.f4095b.a();
                return;
            default:
                this.f4095b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4094a) {
            case 0:
                this.f4095b.b();
                return;
            default:
                this.f4095b.b();
                return;
        }
    }
}
