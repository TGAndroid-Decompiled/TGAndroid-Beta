package ma;

import pa.y;

public class f extends y {

    public u f17900a = null;

    @Override
    public final u a() {
        u uVar = this.f17900a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final Object read(ua.a aVar) {
        u uVar = this.f17900a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        u uVar = this.f17900a;
        if (uVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        uVar.write(bVar, obj);
    }
}
