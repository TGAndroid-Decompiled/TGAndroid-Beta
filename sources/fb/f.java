package fb;

import ib.y;
public class f extends y {
    public u f10387a = null;

    @Override
    public final u a() {
        u uVar = this.f10387a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final Object read(nb.a aVar) {
        u uVar = this.f10387a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        u uVar = this.f10387a;
        if (uVar != null) {
            uVar.write(bVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
