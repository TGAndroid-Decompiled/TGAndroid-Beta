package k1;

import i7.c7;
public final class d extends uc.i implements bd.l {
    public int f13260a;

    @Override
    public final sc.c create(sc.c cVar) {
        return new uc.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        qc.i iVar = qc.i.f46603a;
        ((d) create((sc.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.f48210a;
        int i10 = this.f13260a;
        if (i10 != 0) {
            if (i10 == 1) {
                c7.b(obj);
                return qc.i.f46603a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c7.b(obj);
        this.f13260a = 1;
        throw null;
    }
}
