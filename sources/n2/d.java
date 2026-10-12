package n2;

import android.os.Handler;
import e2.m0;
import ig.t0;
public final class d implements m {
    public final k f15941a;
    public g f15942b;
    public boolean f15943c;
    public final e d;

    public d(e eVar, k kVar) {
        this.d = eVar;
        this.f15941a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new t0(this, 18));
    }
}
