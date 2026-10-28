package ib;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends fb.u {
    public final int f13912a = 0;
    public final Object f13913b;
    public final Object f13914c;

    public c(fb.g gVar, Type type, fb.u uVar, hb.n nVar) {
        this.f13913b = new o(gVar, uVar, type);
        this.f13914c = nVar;
    }

    @Override
    public final Object read(nb.a aVar) {
        switch (this.f13912a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((hb.n) this.f13914c).U1();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((fb.u) ((o) this.f13913b).f13949c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f13913b;
                Object read = ((x0) this.f13914c).f13974c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        switch (this.f13912a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f13913b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f13914c).f13974c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f13914c = x0Var;
        this.f13913b = cls;
    }
}
