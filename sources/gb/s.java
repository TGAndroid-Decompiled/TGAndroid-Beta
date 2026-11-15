package gb;

import android.content.Context;
public final class s implements ib.b {
    public final int f13090a = 0;
    public final ib.c f13091b;
    public final d9.o f13092c;

    public s(ib.c cVar, d9.o oVar) {
        this.f13091b = cVar;
        this.f13092c = oVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13090a) {
            case 0:
                Context appContext = (Context) this.f13092c.f7643b;
                id.h blockingDispatcher = (id.h) this.f13091b.mo24get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                return q.a(jb.j.f16980a, new hi.l0(new o(0), 13), zd.b0.b(blockingDispatcher), new p(appContext, 0));
            default:
                return new jb.f((b) this.f13091b.mo24get(), (id.h) this.f13092c.f7643b);
        }
    }

    public s(d9.o oVar, ib.c cVar) {
        this.f13092c = oVar;
        this.f13091b = cVar;
    }
}
