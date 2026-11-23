package gb;

import android.content.Context;
public final class s implements ib.b {
    public final int f13399a = 0;
    public final ib.c f13400b;
    public final d9.o f13401c;

    public s(ib.c cVar, d9.o oVar) {
        this.f13400b = cVar;
        this.f13401c = oVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13399a) {
            case 0:
                Context appContext = (Context) this.f13401c.f7917a;
                id.h blockingDispatcher = (id.h) this.f13400b.mo24get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                return q.a(jb.j.f17356a, new h9.g1(new o(0), 13), zd.b0.b(blockingDispatcher), new p(appContext, 0));
            default:
                return new jb.f((b) this.f13400b.mo24get(), (id.h) this.f13401c.f7917a);
        }
    }

    public s(d9.o oVar, ib.c cVar) {
        this.f13401c = oVar;
        this.f13400b = cVar;
    }
}
