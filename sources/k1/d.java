package k1;

import v7.i8;
public final class d extends md.i implements td.l {
    public int f13768a;

    @Override
    public final kd.c create(kd.c cVar) {
        return new md.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        id.i iVar = id.i.f11386a;
        ((d) create((kd.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f14658a;
        int i10 = this.f13768a;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.b(obj);
                return id.i.f11386a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i8.b(obj);
        this.f13768a = 1;
        throw null;
    }
}
