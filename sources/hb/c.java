package hb;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends eb.u {
    public final int f11712a = 0;
    public final Object f11713b;
    public final Object f11714c;

    public c(eb.g gVar, Type type, eb.u uVar, gb.n nVar) {
        this.f11713b = new o(gVar, uVar, type);
        this.f11714c = nVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        switch (this.f11712a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((gb.n) this.f11714c).f2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((eb.u) ((o) this.f11713b).f11749c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f11713b;
                Object read = ((x0) this.f11714c).f11774c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        switch (this.f11712a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f11713b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f11714c).f11774c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f11714c = x0Var;
        this.f11713b = cls;
    }
}
