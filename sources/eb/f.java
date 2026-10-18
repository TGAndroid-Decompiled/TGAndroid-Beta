package eb;

import hb.y;
public class f extends y {
    public u f8567a = null;

    @Override
    public final u a() {
        u uVar = this.f8567a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final Object read(mb.a aVar) {
        u uVar = this.f8567a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        u uVar = this.f8567a;
        if (uVar != null) {
            uVar.write(bVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
