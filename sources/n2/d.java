package n2;

import android.os.Handler;
import e2.n0;
public final class d implements l {
    public final j f18605a;
    public g f18606b;
    public boolean f18607c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f18605a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        n0.W(handler, new k2.c(this, 10));
    }
}
