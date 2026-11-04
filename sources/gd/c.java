package gd;

import b8.ib;
import fd.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import od.p;
public final class c extends hd.c {
    public int f12246a;
    public final p f12247b;
    public final fd.c f12248c;

    public c(fd.c cVar, h hVar, p pVar, fd.c cVar2) {
        super(cVar, hVar);
        this.f12247b = pVar;
        this.f12248c = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f12246a;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f12246a = 2;
                ib.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f12246a = 1;
        ib.b(obj);
        p pVar = this.f12247b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f12248c, this);
    }
}
