package dd;

import ed.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import ld.p;
public final class b extends h {
    public int f5866a;
    public final p f5867b;
    public final cd.c f5868c;

    public b(cd.c cVar, cd.c cVar2, p pVar) {
        super(cVar);
        this.f5867b = pVar;
        this.f5868c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f5866a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f5866a = 2;
                l9.b.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f5866a = 1;
        l9.b.b(obj);
        p pVar = this.f5867b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f5868c, this);
    }
}
