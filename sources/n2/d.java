package n2;

import android.os.Handler;
import e2.m0;
public final class d implements m {
    public final k f17037a;
    public h f17038b;
    public boolean f17039c;
    public final f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.f17037a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new ki.u(this, 7));
    }
}
