package bh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class h {
    public final ImageReceiver f2668a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.f2668a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.f2668a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
