package ch;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f implements View.OnAttachStateChangeListener {
    public final int f3498a;
    public final ImageReceiver f3499b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f3498a = i10;
        this.f3499b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3498a) {
            case 0:
                this.f3499b.onAttachedToWindow();
                return;
            default:
                this.f3499b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3498a) {
            case 0:
                this.f3499b.onDetachedFromWindow();
                return;
            default:
                this.f3499b.onDetachedFromWindow();
                return;
        }
    }
}
