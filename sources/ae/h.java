package ae;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final y0 f461e;

    public h(jd.h hVar, Thread thread, y0 y0Var) {
        super(hVar, true);
        this.d = thread;
        this.f461e = y0Var;
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
