package n2;

import android.os.Handler;
import e2.d0;
import i2.g0;
public final class d implements l {
    public final j f15123a;
    public g f15124b;
    public boolean f15125c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f15123a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new g0(this, 13));
    }
}
