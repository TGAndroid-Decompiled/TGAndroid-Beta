package n2;

import android.os.Handler;
import e2.d0;
import ig.t0;
public final class d implements l {
    public final j f16380a;
    public g f16381b;
    public boolean f16382c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f16380a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new t0(this, 15));
    }
}
