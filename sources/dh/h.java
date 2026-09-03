package dh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class h {
    public final ImageReceiver f4910a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f4910a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f4910a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
