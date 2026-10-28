package md;

import a8.jd;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import nd.g;
import ud.p;
public final class b extends g {
    public int f18413a;
    public final p f18414b;
    public final ld.c f18415c;

    public b(ld.c cVar, ld.c cVar2, p pVar) {
        super(cVar);
        this.f18414b = pVar;
        this.f18415c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18413a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f18413a = 2;
                jd.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f18413a = 1;
        jd.b(obj);
        p pVar = this.f18414b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.f18415c, this);
    }
}
