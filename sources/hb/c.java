package hb;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends eb.u {
    public final int f11739a = 0;
    public final Object f11740b;
    public final Object f11741c;

    public c(eb.g gVar, Type type, eb.u uVar, gb.n nVar) {
        this.f11740b = new o(gVar, uVar, type);
        this.f11741c = nVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        switch (this.f11739a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((gb.n) this.f11741c).f2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((eb.u) ((o) this.f11740b).f11776c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f11740b;
                Object read = ((x0) this.f11741c).f11801c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        switch (this.f11739a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f11740b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f11741c).f11801c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f11741c = x0Var;
        this.f11740b = cls;
    }
}
