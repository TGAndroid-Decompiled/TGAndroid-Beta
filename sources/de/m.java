package de;
public final class m implements id.c, kd.d {
    public final id.c f8386a;
    public final id.h f8387b;

    public m(id.c cVar, id.h hVar) {
        this.f8386a = cVar;
        this.f8387b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8386a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8387b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8386a.resumeWith(obj);
    }
}
