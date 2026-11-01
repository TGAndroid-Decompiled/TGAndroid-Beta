package k1;
public final class d extends ed.j implements ld.l {
    public int f10528a;

    @Override
    public final cd.c create(cd.c cVar) {
        return new ed.j(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        ad.j jVar = ad.j.f401a;
        ((d) create((cd.c) obj)).invokeSuspend(jVar);
        return jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.f5864a;
        int i10 = this.f10528a;
        if (i10 != 0) {
            if (i10 == 1) {
                l9.b.b(obj);
                return ad.j.f401a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l9.b.b(obj);
        this.f10528a = 1;
        throw null;
    }
}
