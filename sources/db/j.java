package db;

import ld.p;
public final class j extends ed.j implements p {
    public Object f5854a;
    public final Object f5855b;
    public final n1.d f5856c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, cd.c cVar) {
        super(2, cVar);
        this.f5855b = obj;
        this.f5856c = dVar;
        this.d = kVar;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        j jVar = new j(this.f5855b, this.f5856c, this.d, cVar);
        jVar.f5854a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ad.j jVar = ad.j.f401a;
        ((j) create((n1.b) obj, (cd.c) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.f5864a;
        l9.b.b(obj);
        n1.b bVar = (n1.b) this.f5854a;
        n1.d key = this.f5856c;
        Object obj2 = this.f5855b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f13411b.get()) {
                bVar.f13410a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return ad.j.f401a;
    }
}
