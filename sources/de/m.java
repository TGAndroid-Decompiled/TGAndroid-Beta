package de;
public final class m implements id.c, kd.d {
    public final id.c f8688a;
    public final id.h f8689b;

    public m(id.c cVar, id.h hVar) {
        this.f8688a = cVar;
        this.f8689b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8688a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8689b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8688a.resumeWith(obj);
    }
}
