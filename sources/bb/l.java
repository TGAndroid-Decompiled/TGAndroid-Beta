package bb;

import sd.p;
import v7.a8;
public final class l extends ld.j implements p {
    public Object f3833a;
    public final Object f3834b;
    public final n1.d f3835c;
    public final m d;

    public l(Object obj, n1.d dVar, m mVar, jd.c cVar) {
        super(2, cVar);
        this.f3834b = obj;
        this.f3835c = dVar;
        this.d = mVar;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        l lVar = new l(this.f3834b, this.f3835c, this.d, cVar);
        lVar.f3833a = obj;
        return lVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        hd.i iVar = hd.i.f11090a;
        ((l) create((n1.b) obj, (jd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.f14781a;
        a8.b(obj);
        n1.b bVar = (n1.b) this.f3833a;
        n1.d key = this.f3835c;
        Object obj2 = this.f3834b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f16216b.get()) {
                bVar.f16215a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        m.a(this.d, bVar);
        return hd.i.f11090a;
    }
}
