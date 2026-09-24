package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements m {
    public final k f15097a;
    public h f15098b;
    public boolean f15099c;
    public final f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.f15097a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
