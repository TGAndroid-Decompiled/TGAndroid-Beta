package ih;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public abstract class f {
    public final ImageReceiver f8537a = new ImageReceiver(null);

    public void a(View view) {
        ImageReceiver imageReceiver = this.f8537a;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    public void b() {
        this.f8537a.R();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
