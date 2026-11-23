package de;
public final class m implements id.c, kd.d {
    public final id.c f8352a;
    public final id.h f8353b;

    public m(id.c cVar, id.h hVar) {
        this.f8352a = cVar;
        this.f8353b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8352a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8353b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8352a.resumeWith(obj);
    }
}
