package defpackage;

import java.util.concurrent.locks.LockSupport;
public final class ol0 extends b2 {
    public final Thread e;
    public final o54 f;

    public ol0(cy2 cy2Var, Thread thread, o54 o54Var) {
        super(cy2Var, true);
        this.e = thread;
        this.f = o54Var;
    }

    @Override
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (!rr5.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
