package gb;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends db.u {
    public final int f10443a = 0;
    public final Object f10444b;
    public final Object f10445c;

    public c(db.g gVar, Type type, db.u uVar, fb.n nVar) {
        this.f10444b = new o(gVar, uVar, type);
        this.f10445c = nVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        switch (this.f10443a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((fb.n) this.f10445c).v2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((db.u) ((o) this.f10444b).f10481c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f10444b;
                Object read = ((x0) this.f10445c).f10508c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        switch (this.f10443a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f10444b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f10445c).f10508c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f10445c = x0Var;
        this.f10444b = cls;
    }
}
