package jd;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.t7;
public final class b extends h {
    public int f14089a;
    public final p f14090b;
    public final id.c f14091c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f14090b = pVar;
        this.f14091c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14089a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f14089a = 2;
                t7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14089a = 1;
        t7.b(obj);
        p pVar = this.f14090b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f14091c, this);
    }
}
