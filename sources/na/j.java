package na;

import dd.p;
import k7.q7;
public final class j extends wc.i implements p {
    public Object f15903a;
    public final Object f15904b;
    public final n1.d f15905c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, uc.c cVar) {
        super(2, cVar);
        this.f15904b = obj;
        this.f15905c = dVar;
        this.d = kVar;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        j jVar = new j(this.f15904b, this.f15905c, this.d, cVar);
        jVar.f15903a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        sc.i iVar = sc.i.f47243a;
        ((j) create((n1.b) obj, (uc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f48962a;
        q7.b(obj);
        n1.b bVar = (n1.b) this.f15903a;
        n1.d key = this.f15905c;
        Object obj2 = this.f15904b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (!bVar.f15183b.get()) {
                bVar.f15182a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return sc.i.f47243a;
    }
}
