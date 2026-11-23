package gb;

import android.content.Context;
public final class t implements ib.b {
    public final int f13403a = 0;
    public final ib.c f13404b;
    public final e.a f13405c;

    public t(ib.c cVar, e.a aVar) {
        this.f13404b = cVar;
        this.f13405c = aVar;
    }

    @Override
    public final Object mo23get() {
        switch (this.f13403a) {
            case 0:
                Context appContext = (Context) this.f13405c.f10170a;
                id.h blockingDispatcher = (id.h) this.f13404b.mo23get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                return q.a(jb.j.f17456a, new j6.r(new o(0), 9), zd.b0.b(blockingDispatcher), new p(appContext, 0));
            default:
                return new jb.f((b) this.f13404b.mo23get(), (id.h) this.f13405c.f10170a);
        }
    }

    public t(e.a aVar, ib.c cVar) {
        this.f13405c = aVar;
        this.f13404b = cVar;
    }
}
