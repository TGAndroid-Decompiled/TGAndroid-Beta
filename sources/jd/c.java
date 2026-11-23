package jd;

import id.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;
public final class c extends kd.c {
    public int f17414a;
    public final p f17415b;
    public final id.c f17416c;

    public c(id.c cVar, h hVar, p pVar, id.c cVar2) {
        super(cVar, hVar);
        this.f17415b = pVar;
        this.f17416c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f17414a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f17414a = 2;
                b7.h.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f17414a = 1;
        b7.h.b(obj);
        p pVar = this.f17415b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f17416c, this);
    }
}
