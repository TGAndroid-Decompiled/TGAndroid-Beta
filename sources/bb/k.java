package bb;

import rd.p;
import v7.t7;
public final class k extends kd.j implements p {
    public Object f3474a;
    public final Object f3475b;
    public final n1.d f3476c;
    public final l d;

    public k(Object obj, n1.d dVar, l lVar, id.c cVar) {
        super(2, cVar);
        this.f3475b = obj;
        this.f3476c = dVar;
        this.d = lVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        k kVar = new k(this.f3475b, this.f3476c, this.d, cVar);
        kVar.f3474a = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f9603a;
        ((k) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12959a;
        t7.b(obj);
        n1.b bVar = (n1.b) this.f3474a;
        n1.d key = this.f3476c;
        Object obj2 = this.f3475b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f14831b.get()) {
                bVar.f14830a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        l.a(this.d, bVar);
        return gd.i.f9603a;
    }
}
