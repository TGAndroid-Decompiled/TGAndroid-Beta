package defpackage;

import java.util.concurrent.locks.LockSupport;
public final class ok0 extends b2 {
    public final Thread e;
    public final d44 f;

    public ok0(sw2 sw2Var, Thread thread, d44 d44Var) {
        super(sw2Var, true);
        this.e = thread;
        this.f = d44Var;
    }

    @Override
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (!rp5.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
