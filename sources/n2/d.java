package n2;

import android.os.Handler;
import e2.d0;
import gg.v1;
public final class d implements m {
    public final j f13715a;
    public g f13716b;
    public boolean f13717c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f13715a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new v1(this, 21));
    }
}
