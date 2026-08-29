package la;

import bd.p;
import i7.c7;
public final class j extends uc.i implements p {
    public Object f15134a;
    public final Object f15135b;
    public final n1.d f15136c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, sc.c cVar) {
        super(2, cVar);
        this.f15135b = obj;
        this.f15136c = dVar;
        this.d = kVar;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        j jVar = new j(this.f15135b, this.f15136c, this.d, cVar);
        jVar.f15134a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        qc.i iVar = qc.i.f46603a;
        ((j) create((n1.b) obj, (sc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.f48210a;
        c7.b(obj);
        n1.b bVar = (n1.b) this.f15134a;
        n1.d key = this.f15136c;
        Object obj2 = this.f15135b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (!bVar.f17084b.get()) {
                bVar.f17083a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return qc.i.f46603a;
    }
}
