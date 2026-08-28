package j3;

import android.os.Handler;
public final class m {
    public final Handler f13291a;
    public final n f13292b;

    public m(Handler handler, n nVar) {
        if (nVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f13291a = handler;
        this.f13292b = nVar;
    }

    public final void a(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.f13291a;
        if (handler != null) {
            handler.post(new l(this, fVar, 1));
        }
    }
}
