package bb;

import rd.p;
import v7.u7;
public final class k extends kd.j implements p {
    public Object f2175a;
    public final Object f2176b;
    public final n1.d f2177c;
    public final l d;

    public k(Object obj, n1.d dVar, l lVar, id.c cVar) {
        super(2, cVar);
        this.f2176b = obj;
        this.f2177c = dVar;
        this.d = lVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        k kVar = new k(this.f2176b, this.f2177c, this.d, cVar);
        kVar.f2175a = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f8748a;
        ((k) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f11861a;
        u7.b(obj);
        n1.b bVar = (n1.b) this.f2175a;
        n1.d key = this.f2177c;
        Object obj2 = this.f2176b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f13685b.get()) {
                bVar.f13684a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        l.a(this.d, bVar);
        return gd.i.f8748a;
    }
}
