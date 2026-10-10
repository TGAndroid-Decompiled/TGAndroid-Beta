package bb;

import sd.p;
import v7.a8;
public final class k extends ld.j implements p {
    public Object f3834a;
    public final Object f3835b;
    public final n1.d f3836c;
    public final l d;

    public k(Object obj, n1.d dVar, l lVar, jd.c cVar) {
        super(2, cVar);
        this.f3835b = obj;
        this.f3836c = dVar;
        this.d = lVar;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        k kVar = new k(this.f3835b, this.f3836c, this.d, cVar);
        kVar.f3834a = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        hd.i iVar = hd.i.f11092a;
        ((k) create((n1.b) obj, (jd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.f14784a;
        a8.b(obj);
        n1.b bVar = (n1.b) this.f3834a;
        n1.d key = this.f3836c;
        Object obj2 = this.f3835b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f16471b.get()) {
                bVar.f16470a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        l.a(this.d, bVar);
        return hd.i.f11092a;
    }
}
