package bb;

import rd.p;
import v7.t7;
public final class l extends kd.j implements p {
    public Object f2589a;
    public final Object f2590b;
    public final n1.d f2591c;
    public final m d;

    public l(Object obj, n1.d dVar, m mVar, id.c cVar) {
        super(2, cVar);
        this.f2590b = obj;
        this.f2591c = dVar;
        this.d = mVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        l lVar = new l(this.f2590b, this.f2591c, this.d, cVar);
        lVar.f2589a = obj;
        return lVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f10616a;
        ((l) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f13640a;
        t7.b(obj);
        n1.b bVar = (n1.b) this.f2589a;
        n1.d key = this.f2591c;
        Object obj2 = this.f2590b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f16376b.get()) {
                bVar.f16375a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        m.a(this.d, bVar);
        return gd.i.f10616a;
    }
}
