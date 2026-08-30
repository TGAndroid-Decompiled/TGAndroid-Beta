package eh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f implements View.OnAttachStateChangeListener {
    public final int f5612a;
    public final ImageReceiver f5613b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f5612a = i10;
        this.f5613b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5612a) {
            case 0:
                this.f5613b.onAttachedToWindow();
                return;
            default:
                this.f5613b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5612a) {
            case 0:
                this.f5613b.onDetachedFromWindow();
                return;
            default:
                this.f5613b.onDetachedFromWindow();
                return;
        }
    }
}
