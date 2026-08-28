package hd;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final x0 f10446e;

    public h(qc.h hVar, Thread thread, x0 x0Var) {
        super(hVar, true);
        this.d = thread;
        this.f10446e = x0Var;
    }

    @Override
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!kotlin.jvm.internal.i.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
