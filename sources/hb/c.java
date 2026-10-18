package hb;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends eb.u {
    public final int f11713a = 0;
    public final Object f11714b;
    public final Object f11715c;

    public c(eb.g gVar, Type type, eb.u uVar, gb.n nVar) {
        this.f11714b = new o(gVar, uVar, type);
        this.f11715c = nVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        switch (this.f11713a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((gb.n) this.f11715c).f2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((eb.u) ((o) this.f11714b).f11750c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f11714b;
                Object read = ((x0) this.f11715c).f11775c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        switch (this.f11713a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f11714b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f11715c).f11775c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f11715c = x0Var;
        this.f11714b = cls;
    }
}
