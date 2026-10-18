package n2;

import android.os.Handler;
import e2.m0;
public final class d implements m {
    public final k f17038a;
    public h f17039b;
    public boolean f17040c;
    public final f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.f17038a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new ki.u(this, 7));
    }
}
