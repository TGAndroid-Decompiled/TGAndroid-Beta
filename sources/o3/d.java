package o3;

import android.os.Handler;
import h5.d0;
import nh.n5;
public final class d implements n {
    public final l f16244a;
    public i f16245b;
    public boolean f16246c;
    public final e d;

    public d(e eVar, l lVar) {
        this.d = eVar;
        this.f16244a = lVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.G;
        handler.getClass();
        d0.K(handler, new n5(this, 14));
    }
}
