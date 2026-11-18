package de;
public final class m implements id.c, kd.d {
    public final id.c f8360a;
    public final id.h f8361b;

    public m(id.c cVar, id.h hVar) {
        this.f8360a = cVar;
        this.f8361b = hVar;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8360a;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8361b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f8360a.resumeWith(obj);
    }
}
