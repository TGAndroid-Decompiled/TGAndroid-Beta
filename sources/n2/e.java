package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class e implements m {
    public final k f16528a;
    public h f16529b;
    public boolean f16530c;
    public final f d;

    public e(f fVar, k kVar) {
        this.d = fVar;
        this.f16528a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
