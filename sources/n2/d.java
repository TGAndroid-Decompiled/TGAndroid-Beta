package n2;

import android.os.Handler;
import e2.d0;
import i2.g0;
public final class d implements m {
    public final k f15108a;
    public h f15109b;
    public boolean f15110c;
    public final f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.f15108a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new g0(this, 13));
    }
}
