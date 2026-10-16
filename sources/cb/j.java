package cb;

import td.p;
import v7.i8;
public final class j extends md.i implements p {
    public Object f4705a;
    public final Object f4706b;
    public final n1.d f4707c;
    public final k d;

    public j(Object obj, n1.d dVar, k kVar, kd.c cVar) {
        super(2, cVar);
        this.f4706b = obj;
        this.f4707c = dVar;
        this.d = kVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        j jVar = new j(this.f4706b, this.f4707c, this.d, cVar);
        jVar.f4705a = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.i iVar = id.i.f11390a;
        ((j) create((n1.b) obj, (kd.c) obj2)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f14658a;
        i8.b(obj);
        n1.b bVar = (n1.b) this.f4705a;
        n1.d key = this.f4707c;
        Object obj2 = this.f4706b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (!bVar.f15623b.get()) {
                bVar.f15622a.remove(key);
            } else {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
        }
        k.a(this.d, bVar);
        return id.i.f11390a;
    }
}
