package ka;

import gd.k;
import kd.j;
import q1.e;
import rd.p;
public final class c extends j implements p {
    public Object f17807a;
    public final e f17808b;
    public final Long f17809c;

    public c(e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f17808b = eVar;
        this.f17809c = l10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(this.f17808b, this.f17809c, cVar);
        cVar2.f17807a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k kVar = k.f13173a;
        ((c) create((q1.b) obj, (id.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f16999a;
        af.b.c(obj);
        ((q1.b) this.f17807a).d(this.f17808b, this.f17809c);
        return k.f13173a;
    }
}
