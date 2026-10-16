package hb;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends eb.u {
    public final int f10408a = 0;
    public final Object f10409b;
    public final Object f10410c;

    public c(eb.g gVar, Type type, eb.u uVar, gb.p pVar) {
        this.f10409b = new o(gVar, uVar, type);
        this.f10410c = pVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        switch (this.f10408a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((gb.p) this.f10410c).i2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((eb.u) ((o) this.f10409b).f10445c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f10409b;
                Object read = ((x0) this.f10410c).f10470c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        switch (this.f10408a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f10409b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f10410c).f10470c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f10410c = x0Var;
        this.f10409b = cls;
    }
}
