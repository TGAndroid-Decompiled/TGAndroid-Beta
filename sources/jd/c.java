package jd;

import id.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.t7;
public final class c extends kd.c {
    public int f14093a;
    public final p f14094b;
    public final id.c f14095c;

    public c(id.c cVar, h hVar, p pVar, id.c cVar2) {
        super(cVar, hVar);
        this.f14094b = pVar;
        this.f14095c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14093a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f14093a = 2;
                t7.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14093a = 1;
        t7.b(obj);
        p pVar = this.f14094b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f14095c, this);
    }
}
