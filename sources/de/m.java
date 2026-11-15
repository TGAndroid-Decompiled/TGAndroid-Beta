package de;
public final class m implements id.c, kd.d {
    public final id.c f8078a;
    public final id.h f8079b;

    public m(id.c cVar, id.h hVar) {
        this.f8078a = cVar;
        this.f8079b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8078a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8079b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8078a.resumeWith(obj);
    }
}
