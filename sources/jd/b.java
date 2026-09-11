package jd;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.t7;
public final class b extends h {
    public int f13616a;
    public final p f13617b;
    public final id.c f13618c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f13617b = pVar;
        this.f13618c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f13616a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f13616a = 2;
                t7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f13616a = 1;
        t7.b(obj);
        p pVar = this.f13617b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f13618c, this);
    }
}
