package k1;

import g7.y5;
public final class d extends sc.i implements zc.l {
    public int f14442a;

    @Override
    public final qc.c create(qc.c cVar) {
        return new sc.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        oc.i iVar = oc.i.f19197a;
        ((d) create((qc.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.f47127a;
        int i9 = this.f14442a;
        if (i9 != 0) {
            if (i9 == 1) {
                y5.b(obj);
                return oc.i.f19197a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.b(obj);
        this.f14442a = 1;
        throw null;
    }
}
