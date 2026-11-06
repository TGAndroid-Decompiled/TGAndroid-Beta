package jd;

import id.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;
public final class c extends kd.c {
    public int f16648a;
    public final p f16649b;
    public final id.c f16650c;

    public c(id.c cVar, h hVar, p pVar, id.c cVar2) {
        super(cVar, hVar);
        this.f16649b = pVar;
        this.f16650c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f16648a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f16648a = 2;
                af.b.c(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f16648a = 1;
        af.b.c(obj);
        p pVar = this.f16649b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f16650c, this);
    }
}
