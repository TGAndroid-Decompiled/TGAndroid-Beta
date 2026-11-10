package m1;
public final class c1 extends kd.j implements rd.p {
    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new kd.j(2, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        gd.k kVar = gd.k.f13831a;
        ((c1) create((ce.d) obj, (id.c) obj2)).invokeSuspend(kVar);
        return kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f16646a;
        af.b.c(obj);
        return gd.k.f13831a;
    }
}
