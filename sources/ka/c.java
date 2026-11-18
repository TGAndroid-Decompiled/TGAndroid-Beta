package ka;

import b7.h;
import gd.k;
import kd.j;
import q1.e;
import rd.p;
public final class c extends j implements p {
    public Object f18199a;
    public final e f18200b;
    public final Long f18201c;

    public c(e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f18200b = eVar;
        this.f18201c = l10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(this.f18200b, this.f18201c, cVar);
        cVar2.f18199a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k kVar = k.f13485a;
        ((c) create((q1.b) obj, (id.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f17381a;
        h.b(obj);
        ((q1.b) this.f18199a).d(this.f18200b, this.f18201c);
        return k.f13485a;
    }
}
