package jh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f implements View.OnAttachStateChangeListener {
    public final int f10411a;
    public final ImageReceiver f10412b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f10411a = i10;
        this.f10412b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f10411a) {
            case 0:
                this.f10412b.P();
                return;
            default:
                this.f10412b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f10411a) {
            case 0:
                this.f10412b.R();
                return;
            default:
                this.f10412b.R();
                return;
        }
    }
}
