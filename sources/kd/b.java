package kd;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import ld.h;
import sd.p;
import v7.a8;
public final class b extends h {
    public int f14785a;
    public final p f14786b;
    public final jd.c f14787c;

    public b(jd.c cVar, jd.c cVar2, p pVar) {
        super(cVar);
        this.f14786b = pVar;
        this.f14787c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14785a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f14785a = 2;
                a8.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14785a = 1;
        a8.b(obj);
        p pVar = this.f14786b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f14787c, this);
    }
}
