package bb;

import rd.p;
import v7.u7;
public final class k extends kd.j implements p {
    public Object f3476a;
    public final Object f3477b;
    public final n1.d f3478c;
    public final l d;

    public k(Object obj, n1.d dVar, l lVar, id.c cVar) {
        super(2, cVar);
        this.f3477b = obj;
        this.f3478c = dVar;
        this.d = lVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        k kVar = new k(this.f3477b, this.f3478c, this.d, cVar);
        kVar.f3476a = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.i iVar = gd.i.f9608a;
        ((k) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12962a;
        u7.b(obj);
        n1.b bVar = (n1.b) this.f3476a;
        n1.d key = this.f3478c;
        Object obj2 = this.f3477b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f15119b.get()) {
                bVar.f15118a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        l.a(this.d, bVar);
        return gd.i.f9608a;
    }
}
