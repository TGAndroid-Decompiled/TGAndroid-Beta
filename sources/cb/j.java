package cb;

import td.p;
import v7.i8;
public final class j extends md.i implements p {
    public Object f4702a;
    public final Object f4703b;
    public final n1.d f4704c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, kd.c cVar) {
        super(2, cVar);
        this.f4703b = obj;
        this.f4704c = dVar;
        this.d = kVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        j jVar = new j(this.f4703b, this.f4704c, this.d, cVar);
        jVar.f4702a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.i iVar = id.i.f11386a;
        ((j) create((n1.b) obj, (kd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f14658a;
        i8.b(obj);
        n1.b bVar = (n1.b) this.f4702a;
        n1.d key = this.f4704c;
        Object obj2 = this.f4703b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f15909b.get()) {
                bVar.f15908a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return id.i.f11386a;
    }
}
