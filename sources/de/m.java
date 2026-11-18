package de;
public final class m implements id.c, kd.d {
    public final id.c f8357a;
    public final id.h f8358b;

    public m(id.c cVar, id.h hVar) {
        this.f8357a = cVar;
        this.f8358b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8357a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8358b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8357a.resumeWith(obj);
    }
}
