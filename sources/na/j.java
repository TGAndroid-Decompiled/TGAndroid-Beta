package na;

import dd.p;
import k7.p7;
public final class j extends wc.i implements p {
    public Object f14874a;
    public final Object f14875b;
    public final n1.d f14876c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, uc.c cVar) {
        super(2, cVar);
        this.f14875b = obj;
        this.f14876c = dVar;
        this.d = kVar;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        j jVar = new j(this.f14875b, this.f14876c, this.d, cVar);
        jVar.f14874a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        sc.i iVar = sc.i.f44318a;
        ((j) create((n1.b) obj, (uc.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45727a;
        p7.b(obj);
        n1.b bVar = (n1.b) this.f14874a;
        n1.d key = this.f14876c;
        Object obj2 = this.f14875b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (!bVar.f14197b.get()) {
                bVar.f14196a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return sc.i.f44318a;
    }
}
