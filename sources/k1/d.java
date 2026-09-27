package k1;

import v7.u7;
public final class d extends kd.j implements rd.l {
    public int f13154a;

    @Override
    public final id.c create(id.c cVar) {
        return new kd.j(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        gd.i iVar = gd.i.f9608a;
        ((d) create((id.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12962a;
        int i10 = this.f13154a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
                return gd.i.f9608a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u7.b(obj);
        this.f13154a = 1;
        throw null;
    }
}
