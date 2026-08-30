package k1;

import k7.p7;
public final class e extends wc.i implements dd.l {
    public int f9574a;

    @Override
    public final uc.c create(uc.c cVar) {
        return new wc.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        sc.i iVar = sc.i.f44253a;
        ((e) create((uc.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.f45663a;
        int i10 = this.f9574a;
        if (i10 != 0) {
            if (i10 == 1) {
                p7.b(obj);
                return sc.i.f44253a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p7.b(obj);
        this.f9574a = 1;
        throw null;
    }
}
