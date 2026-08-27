package ka;

import ad.p;
import h7.k6;

public final class j extends tc.i implements p {

    public Object f15130a;

    public final Object f15131b;

    public final n1.e f15132c;
    public final k d;

    public j(Object obj, n1.e eVar, k kVar, rc.c cVar) {
        super(2, cVar);
        this.f15131b = obj;
        this.f15132c = eVar;
        this.d = kVar;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        j jVar = new j(this.f15131b, this.f15132c, this.d, cVar);
        jVar.f15130a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((n1.b) obj, (rc.c) obj2);
        pc.i iVar = pc.i.f45696a;
        jVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.f47847a;
        k6.b(obj);
        n1.b bVar = (n1.b) this.f15130a;
        n1.e key = this.f15132c;
        Object obj2 = this.f15131b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (bVar.f18083b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            bVar.f18082a.remove(key);
        }
        k.a(this.d, bVar);
        return pc.i.f45696a;
    }
}
