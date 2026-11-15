package jd;

import kd.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;
public final class b extends h {
    public int f17001a;
    public final p f17002b;
    public final id.c f17003c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f17002b = pVar;
        this.f17003c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f17001a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f17001a = 2;
                af.b.c(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f17001a = 1;
        af.b.c(obj);
        p pVar = this.f17002b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f17003c, this);
    }
}
