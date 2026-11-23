package jd;

import c8.z;
import kd.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;
public final class b extends h {
    public int f17377a;
    public final p f17378b;
    public final id.c f17379c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f17378b = pVar;
        this.f17379c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f17377a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f17377a = 2;
                z.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f17377a = 1;
        z.b(obj);
        p pVar = this.f17378b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f17379c, this);
    }
}
