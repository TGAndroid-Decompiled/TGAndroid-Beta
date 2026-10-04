package k1;

import v7.t7;
public final class d extends kd.j implements rd.l {
    public int f14298a;

    @Override
    public final id.c create(id.c cVar) {
        return new kd.j(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        gd.i iVar = gd.i.f10452a;
        ((d) create((id.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f14087a;
        int i10 = this.f14298a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
                return gd.i.f10452a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t7.b(obj);
        this.f14298a = 1;
        throw null;
    }
}
