package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements l {
    public final j f16498a;
    public g f16499b;
    public boolean f16500c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f16498a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.T(handler, new h0(this, 13));
    }
}
