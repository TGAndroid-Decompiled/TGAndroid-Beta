package na;

import dd.p;
import k7.p7;
public final class j extends wc.i implements p {
    public Object f14889a;
    public final Object f14890b;
    public final n1.d f14891c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, uc.c cVar) {
        super(2, cVar);
        this.f14890b = obj;
        this.f14891c = dVar;
        this.d = kVar;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        j jVar = new j(this.f14890b, this.f14891c, this.d, cVar);
        jVar.f14889a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        sc.i iVar = sc.i.f44253a;
        ((j) create((n1.b) obj, (uc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45663a;
        p7.b(obj);
        n1.b bVar = (n1.b) this.f14889a;
        n1.d key = this.f14891c;
        Object obj2 = this.f14890b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (!bVar.f14209b.get()) {
                bVar.f14208a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return sc.i.f44253a;
    }
}
