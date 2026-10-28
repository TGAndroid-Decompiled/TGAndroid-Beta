package k1;

import a8.jd;
public final class d extends nd.i implements ud.l {
    public int f16048a;

    @Override
    public final ld.c create(ld.c cVar) {
        return new nd.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        jd.i iVar = jd.i.f15579a;
        ((d) create((ld.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f18411a;
        int i10 = this.f16048a;
        if (i10 != 0) {
            if (i10 == 1) {
                jd.b(obj);
                return jd.i.f15579a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jd.b(obj);
        this.f16048a = 1;
        throw null;
    }
}
