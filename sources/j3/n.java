package j3;

import android.os.Handler;

public final class n {

    public final Handler f12391a;

    public final o f12392b;

    public n(Handler handler, o oVar) {
        if (oVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f12391a = handler;
        this.f12392b = oVar;
    }

    public final void a(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.f12391a;
        if (handler != null) {
            handler.post(new l(this, fVar, 1));
        }
    }
}
