package dh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class h {
    public final ImageReceiver f4904a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f4904a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f4904a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
