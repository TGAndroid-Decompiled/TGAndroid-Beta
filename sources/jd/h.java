package jd;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final w0 f11483e;

    public h(sc.h hVar, Thread thread, w0 w0Var) {
        super(hVar, true);
        this.d = thread;
        this.f11483e = w0Var;
    }

    @Override
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!kotlin.jvm.internal.j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
