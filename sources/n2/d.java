package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;
public final class d implements l {
    public final j f15149a;
    public g f15150b;
    public boolean f15151c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f15149a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
