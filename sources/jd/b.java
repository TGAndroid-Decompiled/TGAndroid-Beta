package jd;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.u7;
public final class b extends h {
    public int f11863a;
    public final p f11864b;
    public final id.c f11865c;

    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.f11864b = pVar;
        this.f11865c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f11863a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f11863a = 2;
                u7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f11863a = 1;
        u7.b(obj);
        p pVar = this.f11864b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f11865c, this);
    }
}
