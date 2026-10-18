package ld;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import md.g;
import td.p;
import v7.i8;
public final class b extends g {
    public int f16002a;
    public final p f16003b;
    public final kd.c f16004c;

    public b(kd.c cVar, kd.c cVar2, p pVar) {
        super(cVar);
        this.f16003b = pVar;
        this.f16004c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16002a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f16002a = 2;
                i8.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f16002a = 1;
        i8.b(obj);
        p pVar = this.f16003b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f16004c, this);
    }
}
