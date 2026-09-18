package n2;

import android.os.Handler;
import e2.d0;
import i2.g0;
public final class d implements m {
    public final k f15069a;
    public h f15070b;
    public boolean f15071c;
    public final f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.f15069a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new g0(this, 12));
    }
}
