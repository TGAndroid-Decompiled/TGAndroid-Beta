package o3;

import android.os.Handler;
import h5.d0;
import lh.c3;
public final class d implements n {
    public final l f16385a;
    public i f16386b;
    public boolean f16387c;
    public final e d;

    public d(e eVar, l lVar) {
        this.d = eVar;
        this.f16385a = lVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.G;
        handler.getClass();
        d0.K(handler, new c3(this, 22));
    }
}
