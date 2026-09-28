package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements m {
    public final k f15112a;
    public h f15113b;
    public boolean f15114c;
    public final f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.f15112a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
