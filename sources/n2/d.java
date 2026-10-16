package n2;

import android.os.Handler;
import e2.m0;
import ig.t0;
public final class d implements l {
    public final j f15655a;
    public g f15656b;
    public boolean f15657c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f15655a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new t0(this, 17));
    }
}
