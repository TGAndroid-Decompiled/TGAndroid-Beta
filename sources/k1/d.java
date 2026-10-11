package k1;

import v7.a8;
public final class d extends ld.j implements sd.l {
    public int f14334a;

    @Override
    public final jd.c create(jd.c cVar) {
        return new ld.j(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        hd.i iVar = hd.i.f11091a;
        ((d) create((jd.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.f14783a;
        int i10 = this.f14334a;
        if (i10 != 0) {
            if (i10 == 1) {
                a8.b(obj);
                return hd.i.f11091a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a8.b(obj);
        this.f14334a = 1;
        throw null;
    }
}
