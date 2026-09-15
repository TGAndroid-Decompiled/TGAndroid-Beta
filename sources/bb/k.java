package bb;

import rd.p;
import v7.t7;
public final class k extends kd.j implements p {
    public Object f3477a;
    public final Object f3478b;
    public final n1.d f3479c;
    public final l d;

    public k(Object obj, n1.d dVar, l lVar, id.c cVar) {
        super(2, cVar);
        this.f3478b = obj;
        this.f3479c = dVar;
        this.d = lVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        k kVar = new k(this.f3478b, this.f3479c, this.d, cVar);
        kVar.f3477a = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f9616a;
        ((k) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12967a;
        t7.b(obj);
        n1.b bVar = (n1.b) this.f3477a;
        n1.d key = this.f3479c;
        Object obj2 = this.f3478b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f14856b.get()) {
                bVar.f14855a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        l.a(this.d, bVar);
        return gd.i.f9616a;
    }
}
