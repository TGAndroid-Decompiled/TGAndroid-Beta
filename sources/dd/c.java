package dd;

import cd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import ld.p;
public final class c extends ed.c {
    public int f5869a;
    public final p f5870b;
    public final cd.c f5871c;

    public c(cd.c cVar, h hVar, p pVar, cd.c cVar2) {
        super(cVar, hVar);
        this.f5870b = pVar;
        this.f5871c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f5869a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f5869a = 2;
                l9.b.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f5869a = 1;
        l9.b.b(obj);
        p pVar = this.f5870b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f5871c, this);
    }
}
