package l1;

import b8.ib;
public final class d1 extends hd.j implements od.p {
    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        return new hd.j(2, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        dd.k kVar = dd.k.f8801a;
        ((d1) create((zd.c) obj, (fd.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.f12241a;
        ib.b(obj);
        return dd.k.f8801a;
    }
}
