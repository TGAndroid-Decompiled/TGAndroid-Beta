package k1;

import k7.q7;
public final class e extends wc.i implements dd.l {
    public int f10278a;

    @Override
    public final uc.c create(uc.c cVar) {
        return new wc.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        sc.i iVar = sc.i.f47274a;
        ((e) create((uc.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f48998a;
        int i10 = this.f10278a;
        if (i10 != 0) {
            if (i10 == 1) {
                q7.b(obj);
                return sc.i.f47274a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q7.b(obj);
        this.f10278a = 1;
        throw null;
    }
}
