package k1;

import v7.t7;
public final class d extends kd.j implements rd.l {
    public int f13161a;

    @Override
    public final id.c create(id.c cVar) {
        return new kd.j(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        gd.i iVar = gd.i.f9617a;
        ((d) create((id.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12969a;
        int i10 = this.f13161a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
                return gd.i.f9617a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t7.b(obj);
        this.f13161a = 1;
        throw null;
    }
}
