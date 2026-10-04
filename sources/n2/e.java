package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class e implements m {
    public final k f16523a;
    public h f16524b;
    public boolean f16525c;
    public final f d;

    public e(f fVar, k kVar) {
        this.d = fVar;
        this.f16523a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
