package ce;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final x0 e;

    public h(ld.h hVar, Thread thread, x0 x0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = x0Var;
    }

    @Override
    public final void b(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!kotlin.jvm.internal.i.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
