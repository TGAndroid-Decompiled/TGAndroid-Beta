package md;

import a8.jd;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import ld.h;
import ud.p;
public final class c extends nd.c {
    public int f18417a;
    public final p f18418b;
    public final ld.c f18419c;

    public c(ld.c cVar, h hVar, p pVar, ld.c cVar2) {
        super(cVar, hVar);
        this.f18418b = pVar;
        this.f18419c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18417a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f18417a = 2;
                jd.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f18417a = 1;
        jd.b(obj);
        p pVar = this.f18418b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f18419c, this);
    }
}
