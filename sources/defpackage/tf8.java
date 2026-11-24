package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class tf8 implements View.OnAttachStateChangeListener {
    public final byte a;
    public final ImageReceiver b;

    public tf8(ImageReceiver imageReceiver, byte b) {
        this.a = b;
        this.b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        ImageReceiver imageReceiver = this.b;
        switch (b) {
            case 0:
                imageReceiver.I();
                return;
            default:
                imageReceiver.I();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        ImageReceiver imageReceiver = this.b;
        switch (b) {
            case 0:
                imageReceiver.K();
                return;
            default:
                imageReceiver.K();
                return;
        }
    }
}
