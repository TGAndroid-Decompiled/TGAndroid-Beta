package ld;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import td.p;
import v7.i8;
public final class c extends md.c {
    public int f16004a;
    public final p f16005b;
    public final kd.c f16006c;

    public c(kd.c cVar, h hVar, p pVar, kd.c cVar2) {
        super(cVar, hVar);
        this.f16005b = pVar;
        this.f16006c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16004a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f16004a = 2;
                i8.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f16004a = 1;
        i8.b(obj);
        p pVar = this.f16005b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f16006c, this);
    }
}
