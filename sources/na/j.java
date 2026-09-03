package na;

import dd.p;
import k7.q7;
public final class j extends wc.i implements p {
    public Object f15905a;
    public final Object f15906b;
    public final n1.d f15907c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, uc.c cVar) {
        super(2, cVar);
        this.f15906b = obj;
        this.f15907c = dVar;
        this.d = kVar;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        j jVar = new j(this.f15906b, this.f15907c, this.d, cVar);
        jVar.f15905a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        sc.i iVar = sc.i.f47274a;
        ((j) create((n1.b) obj, (uc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f48998a;
        q7.b(obj);
        n1.b bVar = (n1.b) this.f15905a;
        n1.d key = this.f15907c;
        Object obj2 = this.f15906b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (!bVar.f15185b.get()) {
                bVar.f15184a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return sc.i.f47274a;
    }
}
