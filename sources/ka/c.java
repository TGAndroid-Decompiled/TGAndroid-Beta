package ka;

import gd.k;
import kd.j;
import q1.e;
import rd.p;
public final class c extends j implements p {
    public Object f17248a;
    public final e f17249b;
    public final Long f17250c;

    public c(e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f17249b = eVar;
        this.f17250c = l10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(this.f17249b, this.f17250c, cVar);
        cVar2.f17248a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k kVar = k.f13831a;
        ((c) create((q1.b) obj, (id.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f16646a;
        af.b.c(obj);
        ((q1.b) this.f17248a).d(this.f17249b, this.f17250c);
        return k.f13831a;
    }
}
