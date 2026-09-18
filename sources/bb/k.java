package bb;

import rd.p;
import v7.t7;
public final class k extends kd.j implements p {
    public Object f3482a;
    public final Object f3483b;
    public final n1.d f3484c;
    public final l d;

    public k(Object obj, n1.d dVar, l lVar, id.c cVar) {
        super(2, cVar);
        this.f3483b = obj;
        this.f3484c = dVar;
        this.d = lVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        k kVar = new k(this.f3483b, this.f3484c, this.d, cVar);
        kVar.f3482a = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f9620a;
        ((k) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12970a;
        t7.b(obj);
        n1.b bVar = (n1.b) this.f3482a;
        n1.d key = this.f3484c;
        Object obj2 = this.f3483b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f15039b.get()) {
                bVar.f15038a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        l.a(this.d, bVar);
        return gd.i.f9620a;
    }
}
