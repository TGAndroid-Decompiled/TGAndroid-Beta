package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class e implements m {
    public final k f16533a;
    public h f16534b;
    public boolean f16535c;
    public final f d;

    public e(f fVar, k kVar) {
        this.d = fVar;
        this.f16533a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
