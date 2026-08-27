package k1;

import h7.k6;

public final class d extends tc.i implements ad.l {

    public int f14263a;

    @Override
    public final rc.c create(rc.c cVar) {
        return new d(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        d dVar = (d) create((rc.c) obj);
        pc.i iVar = pc.i.f45696a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.f47847a;
        int i10 = this.f14263a;
        if (i10 == 0) {
            k6.b(obj);
            this.f14263a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k6.b(obj);
        return pc.i.f45696a;
    }
}
