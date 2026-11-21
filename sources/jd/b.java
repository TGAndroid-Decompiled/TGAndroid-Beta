package jd;

import kd.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;
public final class b extends h {
    public int f17408a;
    public final p f17409b;
    public final id.c f17410c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f17409b = pVar;
        this.f17410c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f17408a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f17408a = 2;
                b7.h.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f17408a = 1;
        b7.h.b(obj);
        p pVar = this.f17409b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f17410c, this);
    }
}
