package jd;

import id.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.u7;
public final class c extends kd.c {
    public int f12967a;
    public final p f12968b;
    public final id.c f12969c;

    public c(id.c cVar, h hVar, p pVar, id.c cVar2) {
        super(cVar, hVar);
        this.f12968b = pVar;
        this.f12969c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f12967a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f12967a = 2;
                u7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f12967a = 1;
        u7.b(obj);
        p pVar = this.f12968b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f12969c, this);
    }
}
