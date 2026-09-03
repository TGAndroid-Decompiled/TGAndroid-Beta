package o3;

import android.os.Handler;
import nh.n5;
public final class e implements o {
    public final m f16229a;
    public j f16230b;
    public boolean f16231c;
    public final f d;

    public e(f fVar, m mVar) {
        this.d = fVar;
        this.f16229a = mVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.G;
        handler.getClass();
        h5.d0.K(handler, new n5(this, 14));
    }
}
