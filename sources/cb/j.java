package cb;

import td.p;
import v7.i8;
public final class j extends md.i implements p {
    public Object f5078a;
    public final Object f5079b;
    public final n1.d f5080c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, kd.c cVar) {
        super(2, cVar);
        this.f5079b = obj;
        this.f5080c = dVar;
        this.d = kVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        j jVar = new j(this.f5079b, this.f5080c, this.d, cVar);
        jVar.f5078a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.i iVar = id.i.f12807a;
        ((j) create((n1.b) obj, (kd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f16062a;
        i8.b(obj);
        n1.b bVar = (n1.b) this.f5078a;
        n1.d key = this.f5080c;
        Object obj2 = this.f5079b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f17066b.get()) {
                bVar.f17065a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return id.i.f12807a;
    }
}
