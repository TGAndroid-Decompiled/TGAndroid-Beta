package oa;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends la.u {
    public final int f19115a = 0;
    public final Object f19116b;
    public final Object f19117c;

    public c(la.g gVar, Type type, la.u uVar, na.n nVar) {
        this.f19116b = new o(gVar, uVar, type);
        this.f19117c = nVar;
    }

    @Override
    public final Object read(ta.a aVar) {
        switch (this.f19115a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((na.n) this.f19117c).Y1();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((la.u) ((o) this.f19116b).f19153c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f19116b;
                Object read = ((x0) this.f19117c).f19180c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        switch (this.f19115a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    cVar.i();
                    return;
                }
                cVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f19116b).write(cVar, obj2);
                }
                cVar.e();
                return;
            default:
                ((x0) this.f19117c).f19180c.write(cVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f19117c = x0Var;
        this.f19116b = cls;
    }
}
