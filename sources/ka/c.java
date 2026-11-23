package ka;

import c8.z;
import gd.k;
import kd.j;
import q1.e;
import rd.p;
public final class c extends j implements p {
    public Object f18196a;
    public final e f18197b;
    public final Long f18198c;

    public c(e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f18197b = eVar;
        this.f18198c = l10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(this.f18197b, this.f18198c, cVar);
        cVar2.f18196a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k kVar = k.f13480a;
        ((c) create((q1.b) obj, (id.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f17375a;
        z.b(obj);
        ((q1.b) this.f18196a).d(this.f18197b, this.f18198c);
        return k.f13480a;
    }
}
