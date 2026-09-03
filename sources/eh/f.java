package eh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f implements View.OnAttachStateChangeListener {
    public final int f5601a;
    public final ImageReceiver f5602b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f5601a = i10;
        this.f5602b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5601a) {
            case 0:
                this.f5602b.onAttachedToWindow();
                return;
            default:
                this.f5602b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5601a) {
            case 0:
                this.f5602b.onDetachedFromWindow();
                return;
            default:
                this.f5602b.onDetachedFromWindow();
                return;
        }
    }
}
