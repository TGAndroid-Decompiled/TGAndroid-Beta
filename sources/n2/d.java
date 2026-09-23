package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements l {
    public final j f14861a;
    public g f14862b;
    public boolean f14863c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f14861a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 12));
    }
}
