package cb;

import td.p;
import v7.i8;
public final class j extends md.i implements p {
    public Object f5076a;
    public final Object f5077b;
    public final n1.d f5078c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, kd.c cVar) {
        super(2, cVar);
        this.f5077b = obj;
        this.f5078c = dVar;
        this.d = kVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        j jVar = new j(this.f5077b, this.f5078c, this.d, cVar);
        jVar.f5076a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.i iVar = id.i.f12777a;
        ((j) create((n1.b) obj, (kd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f16000a;
        i8.b(obj);
        n1.b bVar = (n1.b) this.f5076a;
        n1.d key = this.f5078c;
        Object obj2 = this.f5077b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f17006b.get()) {
                bVar.f17005a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return id.i.f12777a;
    }
}
