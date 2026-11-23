package gb;

import android.content.Context;
public final class s implements ib.b {
    public final int f13436a = 0;
    public final ib.c f13437b;
    public final d9.o f13438c;

    public s(ib.c cVar, d9.o oVar) {
        this.f13437b = cVar;
        this.f13438c = oVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13436a) {
            case 0:
                Context appContext = (Context) this.f13438c.f7954a;
                id.h blockingDispatcher = (id.h) this.f13437b.mo24get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                return q.a(jb.j.f17390a, new h9.g1(new o(0), 13), zd.b0.b(blockingDispatcher), new p(appContext, 0));
            default:
                return new jb.f((b) this.f13437b.mo24get(), (id.h) this.f13438c.f7954a);
        }
    }

    public s(d9.o oVar, ib.c cVar) {
        this.f13438c = oVar;
        this.f13437b = cVar;
    }
}
