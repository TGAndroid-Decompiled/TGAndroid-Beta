package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements l {
    public final j f16502a;
    public g f16503b;
    public boolean f16504c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f16502a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.T(handler, new h0(this, 13));
    }
}
