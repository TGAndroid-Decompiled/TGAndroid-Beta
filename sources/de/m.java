package de;
public final class m implements id.c, kd.d {
    public final id.c f8686a;
    public final id.h f8687b;

    public m(id.c cVar, id.h hVar) {
        this.f8686a = cVar;
        this.f8687b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8686a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8687b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8686a.resumeWith(obj);
    }
}
