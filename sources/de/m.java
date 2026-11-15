package de;
public final class m implements id.c, kd.d {
    public final id.c f8075a;
    public final id.h f8076b;

    public m(id.c cVar, id.h hVar) {
        this.f8075a = cVar;
        this.f8076b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8075a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8076b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8075a.resumeWith(obj);
    }
}
