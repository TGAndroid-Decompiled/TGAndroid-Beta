package n2;

import android.os.Handler;
import e2.l0;
public final class d implements l {
    public final j f13443a;
    public g f13444b;
    public boolean f13445c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f13443a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        l0.W(handler, new lg.s(this, 10));
    }
}
