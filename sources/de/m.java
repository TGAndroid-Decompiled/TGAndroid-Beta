package de;
public final class m implements id.c, kd.d {
    public final id.c f8691a;
    public final id.h f8692b;

    public m(id.c cVar, id.h hVar) {
        this.f8691a = cVar;
        this.f8692b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8691a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8692b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8691a.resumeWith(obj);
    }
}
