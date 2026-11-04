package gd;

import b8.ib;
import hd.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import od.p;
public final class b extends h {
    public int f12243a;
    public final p f12244b;
    public final fd.c f12245c;

    public b(fd.c cVar, fd.c cVar2, p pVar) {
        super(cVar);
        this.f12244b = pVar;
        this.f12245c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f12243a;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f12243a = 2;
                ib.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f12243a = 1;
        ib.b(obj);
        p pVar = this.f12244b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f12245c, this);
    }
}
