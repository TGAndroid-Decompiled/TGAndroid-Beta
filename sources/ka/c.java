package ka;

import b7.h;
import gd.k;
import kd.j;
import q1.e;
import rd.p;
public final class c extends j implements p {
    public Object f18230a;
    public final e f18231b;
    public final Long f18232c;

    public c(e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f18231b = eVar;
        this.f18232c = l10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(this.f18231b, this.f18232c, cVar);
        cVar2.f18230a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k kVar = k.f13514a;
        ((c) create((q1.b) obj, (id.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f17406a;
        h.b(obj);
        ((q1.b) this.f18230a).d(this.f18231b, this.f18232c);
        return k.f13514a;
    }
}
