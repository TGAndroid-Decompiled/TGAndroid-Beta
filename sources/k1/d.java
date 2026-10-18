package k1;

import v7.i8;
public final class d extends md.i implements td.l {
    public int f14573a;

    @Override
    public final kd.c create(kd.c cVar) {
        return new md.i(1, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        id.i iVar = id.i.f12777a;
        ((d) create((kd.c) obj)).invokeSuspend(iVar);
        return iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.f16000a;
        int i10 = this.f14573a;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.b(obj);
                return id.i.f12777a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i8.b(obj);
        this.f14573a = 1;
        throw null;
    }
}
