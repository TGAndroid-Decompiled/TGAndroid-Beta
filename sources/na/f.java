package na;

import qa.y;
public class f extends y {
    public u f17183a = null;

    @Override
    public final u a() {
        u uVar = this.f17183a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final Object read(va.a aVar) {
        u uVar = this.f17183a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        u uVar = this.f17183a;
        if (uVar != null) {
            uVar.write(bVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
