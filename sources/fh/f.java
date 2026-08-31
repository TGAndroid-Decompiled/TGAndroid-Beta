package fh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f implements View.OnAttachStateChangeListener {
    public final int f6666a;
    public final ImageReceiver f6667b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f6666a = i10;
        this.f6667b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f6666a) {
            case 0:
                this.f6667b.onAttachedToWindow();
                return;
            default:
                this.f6667b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6666a) {
            case 0:
                this.f6667b.onDetachedFromWindow();
                return;
            default:
                this.f6667b.onDetachedFromWindow();
                return;
        }
    }
}
