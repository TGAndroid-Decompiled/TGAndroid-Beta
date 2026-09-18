package gb;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends db.u {
    public final int f9542a = 0;
    public final Object f9543b;
    public final Object f9544c;

    public c(db.g gVar, Type type, db.u uVar, fb.n nVar) {
        this.f9543b = new o(gVar, uVar, type);
        this.f9544c = nVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        switch (this.f9542a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((fb.n) this.f9544c).p2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((db.u) ((o) this.f9543b).f9579c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f9543b;
                Object read = ((x0) this.f9544c).f9604c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        switch (this.f9542a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f9543b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f9544c).f9604c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f9544c = x0Var;
        this.f9543b = cls;
    }
}
