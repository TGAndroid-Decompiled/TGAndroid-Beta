package la;

import oa.y;
public class f extends y {
    public u f16716a = null;

    @Override
    public final u a() {
        u uVar = this.f16716a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final Object read(ta.a aVar) {
        u uVar = this.f16716a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        u uVar = this.f16716a;
        if (uVar != null) {
            uVar.write(cVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
