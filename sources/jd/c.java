package jd;

import id.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;
public final class c extends kd.c {
    public int f17386a;
    public final p f17387b;
    public final id.c f17388c;

    public c(id.c cVar, h hVar, p pVar, id.c cVar2) {
        super(cVar, hVar);
        this.f17387b = pVar;
        this.f17388c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f17386a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f17386a = 2;
                b7.h.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f17386a = 1;
        b7.h.b(obj);
        p pVar = this.f17387b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f17388c, this);
    }
}
