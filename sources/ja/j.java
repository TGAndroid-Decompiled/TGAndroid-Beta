package ja;

import g7.y5;
import zc.p;
public final class j extends sc.i implements p {
    public Object f14276a;
    public final Object f14277b;
    public final n1.d f14278c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, qc.c cVar) {
        super(2, cVar);
        this.f14277b = obj;
        this.f14278c = dVar;
        this.d = kVar;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        j jVar = new j(this.f14277b, this.f14278c, this.d, cVar);
        jVar.f14276a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        oc.i iVar = oc.i.f19197a;
        ((j) create((n1.b) obj, (qc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.f47127a;
        y5.b(obj);
        n1.b bVar = (n1.b) this.f14276a;
        n1.d key = this.f14278c;
        Object obj2 = this.f14277b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f18258b.get()) {
                bVar.f18257a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return oc.i.f19197a;
    }
}
