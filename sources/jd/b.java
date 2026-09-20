package jd;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.u7;
public final class b extends h {
    public int f12973a;
    public final p f12974b;
    public final id.c f12975c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f12974b = pVar;
        this.f12975c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f12973a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f12973a = 2;
                u7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f12973a = 1;
        u7.b(obj);
        p pVar = this.f12974b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f12975c, this);
    }
}
