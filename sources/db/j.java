package db;

import a8.jd;
import ud.p;
public final class j extends nd.i implements p {
    public Object f8301a;
    public final Object f8302b;
    public final n1.d f8303c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, ld.c cVar) {
        super(2, cVar);
        this.f8302b = obj;
        this.f8303c = dVar;
        this.d = kVar;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        j jVar = new j(this.f8302b, this.f8303c, this.d, cVar);
        jVar.f8301a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        jd.i iVar = jd.i.f15580a;
        ((j) create((n1.b) obj, (ld.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f18412a;
        jd.b(obj);
        n1.b bVar = (n1.b) this.f8301a;
        n1.d key = this.f8303c;
        Object obj2 = this.f8302b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f18574b.get()) {
                bVar.f18573a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return jd.i.f15580a;
    }
}
