package ja;

import b8.ib;
import dd.k;
import hd.j;
import od.p;
import p1.e;
public final class c extends j implements p {
    public Object f16229a;
    public final e f16230b;
    public final Long f16231c;

    public c(e eVar, Long l10, fd.c cVar) {
        super(2, cVar);
        this.f16230b = eVar;
        this.f16231c = l10;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        c cVar2 = new c(this.f16230b, this.f16231c, cVar);
        cVar2.f16229a = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k kVar = k.f8801a;
        ((c) create((p1.b) obj, (fd.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.f12241a;
        ib.b(obj);
        ((p1.b) this.f16229a).d(this.f16230b, this.f16231c);
        return k.f8801a;
    }
}
