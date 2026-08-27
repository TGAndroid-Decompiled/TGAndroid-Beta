package ah;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

public final class f implements View.OnAttachStateChangeListener {

    public final int f765a;

    public final ImageReceiver f766b;

    public f(ImageReceiver imageReceiver, int i10) {
        this.f765a = i10;
        this.f766b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f765a) {
            case 0:
                this.f766b.onAttachedToWindow();
                break;
            default:
                this.f766b.onAttachedToWindow();
                break;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f765a) {
            case 0:
                this.f766b.onDetachedFromWindow();
                break;
            default:
                this.f766b.onDetachedFromWindow();
                break;
        }
    }
}
