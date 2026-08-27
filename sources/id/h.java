package id;

import java.util.concurrent.locks.LockSupport;

public final class h extends a {
    public final Thread d;

    public final x0 f11155e;

    public h(rc.h hVar, Thread thread, x0 x0Var) {
        super(hVar, true);
        this.d = thread;
        this.f11155e = x0Var;
    }

    @Override
    public final void f(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (kotlin.jvm.internal.j.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
