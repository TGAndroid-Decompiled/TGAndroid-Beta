package n2;

import android.os.Handler;
import e2.d0;
import i2.g0;
public final class d implements l {
    public final j f14886a;
    public g f14887b;
    public boolean f14888c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f14886a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new g0(this, 12));
    }
}
