package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements l {
    public final j f16247a;
    public g f16248b;
    public boolean f16249c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f16247a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.T(handler, new h0(this, 12));
    }
}
