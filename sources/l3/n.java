package l3;

import android.os.Handler;
public final class n {
    public final Handler f14150a;
    public final o f14151b;

    public n(Handler handler, o oVar) {
        if (oVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f14150a = handler;
        this.f14151b = oVar;
    }

    public final void a(m3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.f14150a;
        if (handler != null) {
            handler.post(new l(this, fVar, 1));
        }
    }
}
