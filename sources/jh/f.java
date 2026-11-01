package jh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f implements View.OnAttachStateChangeListener {
    public final int f10412a;
    public final ImageReceiver f10413b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f10412a = i10;
        this.f10413b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f10412a) {
            case 0:
                this.f10413b.P();
                return;
            default:
                this.f10413b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f10412a) {
            case 0:
                this.f10413b.R();
                return;
            default:
                this.f10413b.R();
                return;
        }
    }
}
