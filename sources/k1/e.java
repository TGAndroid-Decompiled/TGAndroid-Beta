package k1;

import k7.p7;
public final class e extends wc.i implements dd.l {
    public int f9555a;

    @Override
    public final uc.c create(uc.c cVar) {
        return new wc.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        sc.i iVar = sc.i.f44318a;
        ((e) create((uc.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45727a;
        int i10 = this.f9555a;
        if (i10 != 0) {
            if (i10 == 1) {
                p7.b(obj);
                return sc.i.f44318a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p7.b(obj);
        this.f9555a = 1;
        throw null;
    }
}
