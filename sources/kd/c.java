package kd;

import jd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import sd.p;
import v7.a8;
public final class c extends ld.c {
    public int f14789a;
    public final p f14790b;
    public final jd.c f14791c;

    public c(jd.c cVar, h hVar, p pVar, jd.c cVar2) {
        super(cVar, hVar);
        this.f14790b = pVar;
        this.f14791c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14789a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f14789a = 2;
                a8.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14789a = 1;
        a8.b(obj);
        p pVar = this.f14790b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f14791c, this);
    }
}
