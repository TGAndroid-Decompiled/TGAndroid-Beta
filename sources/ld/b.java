package ld;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import md.g;
import td.p;
import v7.i8;
public final class b extends g {
    public int f15995a;
    public final p f15996b;
    public final kd.c f15997c;

    public b(kd.c cVar, kd.c cVar2, p pVar) {
        super(cVar);
        this.f15996b = pVar;
        this.f15997c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15995a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f15995a = 2;
                i8.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f15995a = 1;
        i8.b(obj);
        p pVar = this.f15996b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f15997c, this);
    }
}
