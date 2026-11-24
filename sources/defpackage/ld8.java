package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class ld8 {
    public final ImageReceiver a = new ImageReceiver(null);

    public void a(View view) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.p0(view);
        imageReceiver.I();
    }

    public void b() {
        this.a.K();
    }

    public void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}
